package com.ykly.entity.response;

/**
 * Created by huangmingjie on 2017/12/4.
 */
public class RangingInfo {
    private String origin_id;
    private String dest_id;
    private String distance;
    private String duration;
    
    public String getOrigin_id() {
        return origin_id;
    }
    
    public void setOrigin_id(String origin_id) {
        this.origin_id = origin_id;
    }
    
    public String getDest_id() {
        return dest_id;
    }
    
    public void setDest_id(String dest_id) {
        this.dest_id = dest_id;
    }
    
    public String getDistance() {
        return distance;
    }
    
    public void setDistance(String distance) {
        this.distance = distance;
    }
    
    public String getDuration() {
        return duration;
    }
    
    public void setDuration(String duration) {
        this.duration = duration;
    }
}
