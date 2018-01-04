package com.ykly.entity.response;

import java.util.List;

/**
 * Created by huangmingjie on 2017/12/4.
 */
public class GouldResult {
    private int status;
    private String info;
    private String infocode;
    private List<RangingInfo> results;
    
    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getInfo() {
        return info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }
    
    public String getInfocode() {
        return infocode;
    }
    
    public void setInfocode(String infocode) {
        this.infocode = infocode;
    }
    
    public List<RangingInfo> getResults() {
        return results;
    }
    
    public void setResults(List<RangingInfo> results) {
        this.results = results;
    }
}
