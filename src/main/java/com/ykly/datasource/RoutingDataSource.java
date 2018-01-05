package com.ykly.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by huangmingjie on 2018/1/3.
 */
public class RoutingDataSource extends AbstractRoutingDataSource {
    private static String lastLength;
    private static String dbCount;
    private static String tableCount;
    private static String dataSourcePre;
    private static String dataSourceOrderOther;
    private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal();
    
    public RoutingDataSource() {
    }
    
    public static void setDataSourceKey(String dataSource) {
        dataSourceKey.set(dataSource);
    }
    
    protected Object determineCurrentLookupKey() {
        return dataSourceKey.get();
    }
    
    public static String getDataSource(String key) {
        String keySplit = key.substring(key.length() - Integer.parseInt(lastLength), key.length());
        int hashCode = Math.abs(keySplit.hashCode());
        return dataSourcePre + hashCode % Integer.parseInt(dbCount);
    }
    
    public static int getTableIndex(String key) {
        int hashCode = Math.abs(key.hashCode());
        return hashCode % Integer.parseInt(tableCount);
    }
    
    public static String getLastLength() {
        return lastLength;
    }
    
    public static void setLastLength(String lastLength) {
        lastLength = lastLength;
    }
    
    public static String getDbCount() {
        return dbCount;
    }
    
    public static void setDbCount(String dbCount) {
        dbCount = dbCount;
    }
    
    public static String getTableCount() {
        return tableCount;
    }
    
    public static void setTableCount(String tableCount) {
        tableCount = tableCount;
    }
    
    public static String getDataSourcePre() {
        return dataSourcePre;
    }
    
    public static void setDataSourcePre(String dataSourcePre) {
        dataSourcePre = dataSourcePre;
    }
    
    public static String getDataSourceOrderOther() {
        return dataSourceOrderOther;
    }
    
    public static void setDataSourceOrderOther(String dataSourceOrderOther) {
        dataSourceOrderOther = dataSourceOrderOther;
    }
}
