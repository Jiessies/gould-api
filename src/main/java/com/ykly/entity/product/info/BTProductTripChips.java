package com.ykly.entity.product.info;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@ApiModel(value = "行程段表")
public class BTProductTripChips {
    
    @ApiModelProperty(value = "行程id", hidden = true)
    private int chip_id;
    @ApiModelProperty(value = "行程段id", hidden = true)
    private int day_id;
    @ApiModelProperty(value = "行程描述", example = "行程描述(String)")
    private String trip_info;
    @ApiModelProperty(value = "行程小标题", example = "行程小标题(String)")
    private String trip_title;
    @ApiModelProperty(value = "行程小标题正文", example = "行程小标题正文(String)")
    private String trip_content;
    @ApiModelProperty(value = "行程段时间", example = "行程段时间(String)")
    private String trip_time;
    @ApiModelProperty(value = "行程中第几个段", example = "行程中第几个段(int)")
    private int chip_order;
    
    public int getChip_id() {
        return chip_id;
    }
    
    public void setChip_id(int chip_id) {
        this.chip_id = chip_id;
    }
    
    public String getTrip_info() {
        return trip_info;
    }
    
    public void setTrip_info(String trip_info) {
        this.trip_info = trip_info;
    }
    
    public String getTrip_title() {
        return trip_title;
    }
    
    public void setTrip_title(String trip_title) {
        this.trip_title = trip_title;
    }
    
    public String getTrip_content() {
        return trip_content;
    }
    
    public void setTrip_content(String trip_content) {
        this.trip_content = trip_content;
    }
    
    public String getTrip_time() {
        return trip_time;
    }
    
    public void setTrip_time(String trip_time) {
        this.trip_time = trip_time;
    }
    
    public int getChip_order() {
        return chip_order;
    }
    
    public void setChip_order(int chip_order) {
        this.chip_order = chip_order;
    }
    
    public int getDay_id() {
        return day_id;
    }
    
    public void setDay_id(int day_id) {
        this.day_id = day_id;
    }
}
