package com.ykly.common.utils;

import org.apache.solr.client.solrj.impl.CloudSolrClient;

public class SolrFactory {
	
	private static CloudSolrClient searchClient;
	
	/**
	 * 创建酒店collection链接
	 * 
	 * @param zkHost
	 * @param collection
	 * @return
	 */
	public static CloudSolrClient buildSearchClient(String zkHost,String collection){
		if(searchClient==null){
			searchClient = SolrUtil.getSolrClient(zkHost, collection);
		}
		return searchClient;
	}
}
