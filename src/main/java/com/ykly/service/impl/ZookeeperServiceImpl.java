package com.ykly.service.impl;

import com.ykly.common.utils.ZKClient;
import com.ykly.service.ZookeeperService;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by huangmingjie on 2018/1/10.
 */
@Service
public class ZookeeperServiceImpl implements ZookeeperService {
    
    private static final Logger logger = LoggerFactory.getLogger(ZookeeperServiceImpl.class);
    
    @Autowired
    private ZKClient zkClient;
    
    @Override
    public String testZookeeper(String serverId) {
        String parentPath = "/test";
        String childrenPath = "/test/children";
        try {
            zkClient.createConnection();
            boolean isSuccess = zkClient.createNode(parentPath, serverId, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            if (isSuccess) {
                //读取数据
                String result = zkClient.getNodeData(parentPath, true);
                logger.info("更新前数据：" + result);
                
                //更新数据
                isSuccess = zkClient.updateNode(parentPath, String.valueOf(System.currentTimeMillis()));
                if (isSuccess) {
                    logger.info("更新后数据：" + zkClient.getNodeData(parentPath, true));
                }
                
                // 创建子节点
                isSuccess = zkClient.createNode(childrenPath, String.valueOf(System.currentTimeMillis()), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
                if (isSuccess) {
                    zkClient.updateNode(childrenPath, String.valueOf(System.currentTimeMillis()));
                }
                
                //读取子节点
                List<String> childrenList = zkClient.getChildren(parentPath, true);
                if (childrenList != null && !childrenList.isEmpty()) {
                    for (String children : childrenList) {
                        System.out.println("子节点：" + children);
                    }
                }
            }
            
            Thread.sleep(1000);
            //创建临时有序子节点
            zkClient.createNode(childrenPath, String.valueOf(System.currentTimeMillis()), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
            zkClient.createNode(childrenPath, String.valueOf(System.currentTimeMillis()), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
            zkClient.createNode(childrenPath, String.valueOf(System.currentTimeMillis()), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
            
            // 读取子节点，并删除
            List<String> childrenList = zkClient.getChildren(parentPath, true);
            if (childrenList != null && !childrenList.isEmpty()) {
                for (String children : childrenList) {
                    System.out.println("子节点：" + children);
                    zkClient.deleteNode(parentPath + "/" + children);
                }
            }
            
            //删除父节点
            if (zkClient.exists(childrenPath, false) != null) {
                zkClient.deleteNode(childrenPath);
            }
            
            //释放链接
            Thread.sleep(1000);
            zkClient.releaseConnection();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "succ";
    }
}
