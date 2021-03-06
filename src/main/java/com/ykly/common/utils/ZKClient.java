package com.ykly.common.utils;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Stat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by huangmingjie on 2018/1/10.
 */
@Component
public class ZKClient implements Watcher {
    
    private static final Logger logger = LoggerFactory.getLogger(ZKClient.class);
    private static final String ZOOKEEPER_ADDRESS = "127.0.0.1:2181";
    private static final int SESSION_TIMEOUT = 10000;
    private CountDownLatch connectedSemaphore = new CountDownLatch(1);
    private AtomicInteger seq = new AtomicInteger();
    private ZooKeeper zooKeeper;
    
    @Override
    public void process(WatchedEvent event) {
        logger.info("进入process()方法...event = " + event);
        
        if (event == null) {
            return;
        }
        
        Event.KeeperState keeperState = event.getState(); // 连接状态
        Event.EventType eventType = event.getType(); // 事件类型
        String path = event.getPath(); // 受影响的path
        
        String logPrefix = "【Watcher-" + seq.incrementAndGet() + "】";
        logger.info(String.format("%s收到Watcher通知...", logPrefix));
        logger.info(String.format("%s连接状态：%s", logPrefix, keeperState));
        logger.info(String.format("%s事件类型：%s", logPrefix, eventType));
        logger.info(String.format("%s受影响的path：%s", logPrefix, path));
        
        if (Event.KeeperState.SyncConnected == keeperState) {
            if (Event.EventType.None == eventType) {
                // 成功连接上ZK服务器
                logger.info(logPrefix + "成功连接上ZK服务器...");
                connectedSemaphore.countDown();
                
            } else if (Event.EventType.NodeCreated == eventType) {
                // 创建节点
                logger.info(logPrefix + "节点创建");
                exists(path, true);
                
            } else if (Event.EventType.NodeDataChanged == eventType) {
                // 更新节点
                logger.info(logPrefix + "节点数据更新");
                logger.info(logPrefix + "数据内容: " + getNodeData(path, true));
                
            } else if (Event.EventType.NodeChildrenChanged == eventType) {
                // 更新子节点
                logger.info(logPrefix + "子节点变更");
                logger.info(logPrefix + "子节点列表：" + getChildren(path, true));
                
            } else if (Event.EventType.NodeDeleted == eventType) {
                // 删除节点
                logger.info(logPrefix + "节点 " + path + " 被删除");
            }
            
        } else if (Event.KeeperState.Disconnected == keeperState) {
            logger.info(logPrefix + "与ZK服务器断开连接");
        } else if (Event.KeeperState.AuthFailed == keeperState) {
            logger.info(logPrefix + "权限检查失败");
        } else if (Event.KeeperState.Expired == keeperState) {
            logger.info(logPrefix + "会话失效");
        }
    }
    
    public boolean createNode(String path, String data, List<ACL> acl, CreateMode createMode) {
        try {
            //设置监控(由于zookeeper的监控都是一次性的，所以每次必须设置监控)
            exists(path, true);
            String resultPath = zooKeeper.create(path, data.getBytes(), acl, createMode);
            logger.info(String.format("节点创建成功，path: %s，data: %s", resultPath, data));
        } catch (Exception e) {
            logger.error("节点创建失败", e);
            return false;
        }
        
        return true;
    }
    
    public boolean updateNode(String path, String data) {
        try {
            Stat stat = zooKeeper.setData(path, data.getBytes(), -1);
            logger.info("更新节点数据成功，path：" + path + ", stat: " + stat);
        } catch (Exception e) {
            logger.error("更新节点数据失败", e);
            return false;
        }
        
        return true;
    }
    
    public void deleteNode(String path) {
        try {
            zooKeeper.delete(path, -1);
            logger.info("删除节点成功，path：" + path);
        } catch (Exception e) {
            logger.error("删除节点失败", e);
        }
    }
    
    public String getNodeData(String path, boolean needWatch) {
        try {
            Stat stat = exists(path, needWatch);
            if (stat != null) {
                return new String(zooKeeper.getData(path, needWatch, stat));
            }
        } catch (Exception e) {
            logger.error("读取节点数据内容失败", e);
        }
        
        return null;
    }
    
    public List<String> getChildren(String path, boolean needWatch) {
        try {
            return zooKeeper.getChildren(path, needWatch);
        } catch (Exception e) {
            logger.error("获取子节点失败", e);
            return null;
        }
    }
    
    public Stat exists(String path, boolean needWatch) {
        try {
            return zooKeeper.exists(path, needWatch);
        } catch (Exception e) {
            logger.error("判断znode节点是否存在发生异常", e);
        }
        
        return null;
    }
    
    public void createConnection() {
        releaseConnection();
        try {
            zooKeeper = new ZooKeeper(ZOOKEEPER_ADDRESS, SESSION_TIMEOUT, this);
            logger.info("开始连接ZK服务器...");
            
            //zk连接未创建成功进行阻塞
            connectedSemaphore.await();
        } catch (Exception e) {
            logger.error("ZK连接创建失败", e);
        }
    }
    
    public void releaseConnection() {
        if (zooKeeper != null) {
            try {
                zooKeeper.close();
                logger.info("ZK连接关闭成功");
            } catch (InterruptedException e) {
                logger.error("ZK连接关闭失败", e);
            }
        }
    }
    
}
