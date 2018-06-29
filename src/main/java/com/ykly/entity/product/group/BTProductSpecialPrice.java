package com.ykly.entity.product.group;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@ApiModel(value = "特殊人群报价")
public class BTProductSpecialPrice {
    
    @ApiModelProperty(value = "产品id",example = "产品id(int)")
    private int product_id;
    @ApiModelProperty(value = "产品类型",example = "产品类型(int)")
    private int product_type;
    @ApiModelProperty(value = "团期id",example = "团期id(int)")
    private int groupoffer_id;
    @ApiModelProperty(value = "行程编号",example = "行程编号(String)")
    private String trip_code;
    @ApiModelProperty(value = "价格名称",example = "价格名称(String)")
    private String price_name;
    @ApiModelProperty(value = "同行价",example = "同行价(int)")
    private int peer_price;
    @ApiModelProperty(value = "对外价",example = "对外价(int)")
    private int out_price;
    @ApiModelProperty(value = "是否删除 0否 1是",example = "是否删除 0否 1是(int)")
    private int is_del;
    
    public int getProduct_id() {
        return product_id;
    }
    
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    
    public int getProduct_type() {
        return product_type;
    }
    
    public void setProduct_type(int product_type) {
        this.product_type = product_type;
    }
    
    public int getGroupoffer_id() {
        return groupoffer_id;
    }
    
    public void setGroupoffer_id(int groupoffer_id) {
        this.groupoffer_id = groupoffer_id;
    }
    
    public String getTrip_code() {
        return trip_code;
    }
    
    public void setTrip_code(String trip_code) {
        this.trip_code = trip_code;
    }
    
    public String getPrice_name() {
        return price_name;
    }
    
    public void setPrice_name(String price_name) {
        this.price_name = price_name;
    }
    
    public int getPeer_price() {
        return peer_price;
    }
    
    public void setPeer_price(int peer_price) {
        this.peer_price = peer_price;
    }
    
    public int getOut_price() {
        return out_price;
    }
    
    public void setOut_price(int out_price) {
        this.out_price = out_price;
    }
    
    public int getIs_del() {
        return is_del;
    }
    
    public void setIs_del(int is_del) {
        this.is_del = is_del;
    }
}
