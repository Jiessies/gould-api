package com.ykly.service.impl;

import com.ykly.service.ProductSolrService;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by huangmingjie on 2018/1/9.
 */
@Service
public class ProductSolrServiceImpl implements ProductSolrService {
    
    @Autowired
    private CloudSolrClient searchClient;
    
    @Override
    public Map<String, Object> queryProductSolr(String obj) {
        Map<String, Object> responseMap = new HashMap<>();
        QueryResponse response = null;
        SolrQuery query = new SolrQuery();
        query.set("q", "*:*");
        try {
            response = searchClient.query(query);
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        responseMap.put("orderNo", obj);
        responseMap.put("result", response.getResults());
        return responseMap;
    }
    
}
