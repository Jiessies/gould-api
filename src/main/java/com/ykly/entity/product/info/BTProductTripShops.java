package com.ykly.entity.product.info;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@ApiModel(value = "行程店表")
public class BTProductTripShops {
    
    @ApiModelProperty(value = "商店ID",hidden = true)
    private int shop_id;
    @ApiModelProperty(value = "行程段ID",hidden = true)
    private int day_id;
    @ApiModelProperty(value = "商店名",example = "商店名(String)")
    private String shop_name;
    @ApiModelProperty(value = "营业产品",example = "营业产品(String)")
    private String shop_product;
    @ApiModelProperty(value = "说明",example = "说明(String)")
    private String shop_explian;
    @ApiModelProperty(value = "停留时间",example = "停留时间(String)")
    private String stay_time;
    
    public String getShop_name() {
        return shop_name;
    }
    
    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }
    
    public String getShop_product() {
        return shop_product;
    }
    
    public void setShop_product(String shop_product) {
        this.shop_product = shop_product;
    }
    
    public String getShop_explian() {
        return shop_explian;
    }
    
    public void setShop_explian(String shop_explian) {
        this.shop_explian = shop_explian;
    }
    
    public String getStay_time() {
        return stay_time;
    }
    
    public void setStay_time(String stay_time) {
        this.stay_time = stay_time;
    }
    
    public int getShop_id() {
        return shop_id;
    }
    
    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }
    
    public int getDay_id() {
        return day_id;
    }
    
    public void setDay_id(int day_id) {
        this.day_id = day_id;
    }
}
