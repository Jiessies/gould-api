package com.ykly.common.utils;

import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrInputDocument;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class SolrUtil {
    /**
     * solr http服务地址
     */
    public static String SOLR_URL = "http://localhost:8983/solr/";
    
    /**
     * solr的core
     */
    public static String SOLR_CORE = "collection1";
    
    /**
     * 获取http solr服务
     *
     * @return
     */
    private static HttpSolrClient getSolrClient(String core) {
        HttpSolrClient hsc = new HttpSolrClient(SOLR_URL + core);
        return hsc;
    }
    
    /**
     * 获取solrCloud服务
     *
     * @return
     */
    public static CloudSolrClient getSolrClient(String zkHost, String collection) {
        CloudSolrClient cloudSolrClient = new CloudSolrClient(zkHost);
        cloudSolrClient.setDefaultCollection(collection);
        return cloudSolrClient;
    }
    
    /**
     * 提交以及关闭服务
     *
     * @param solrClient
     * @throws Exception
     */
    private static void commitAndCloseSolr(HttpSolrClient solrClient)
            throws Exception {
        solrClient.commit();
        solrClient.close();
    }
    
    /**
     * 添加文档
     *
     * @param map
     * @param core
     * @throws Exception
     */
    private static void addDocument(Map<String, String> map, String core)
            throws Exception {
        SolrInputDocument sid = new SolrInputDocument();
        for (Entry<String, String> entry : map.entrySet()) {
            sid.addField(entry.getKey(), entry.getValue());
        }
        HttpSolrClient solrClient = getSolrClient("/" + core);
        solrClient.add(sid);
        commitAndCloseSolr(solrClient);
    }
    
    public static void main(String[] args) {
        Map<String, String> paramMap = new HashMap<String, String>();
        paramMap.put("id", "2");
        paramMap.put("name", "b");
        paramMap.put("create_date", "2");
        try {
            addDocument(paramMap, SOLR_CORE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
