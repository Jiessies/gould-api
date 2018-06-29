package com.ykly.entity.product.detail;

import com.alibaba.fastjson.JSON;
import com.ykly.entity.product.json.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@ApiModel(value = "产品详情——活动推荐,预定须知,其他等")
public class BTProductDetailOther {
    
    @ApiModelProperty(value = "主键", example = "主键(int)")
    private int id;
    @ApiModelProperty(value = "产品ID", example = "产品ID(int)")
    private Integer product_id;
    @ApiModelProperty(value = "产品类型", example = "产品类型(int)")
    private int product_type;
    @ApiModelProperty(value = "活动推荐")
    private String activity_recommend;
    @ApiModelProperty(value = "购物推荐")
    private String shop_recommend;
    @ApiModelProperty(value = "活动推荐说明", example = "活动推荐说明(String)")
    private String explain_textbox;
    @ApiModelProperty(value = "产品注意事项", example = "产品注意事项(String)")
    private String announcement;
    @ApiModelProperty(value = "温馨提示", example = "温馨提示(String)")
    private String warm_prompt;
    @ApiModelProperty(value = "预定须知")
    private String pre_order_info;
    @ApiModelProperty(value = "特别约定条款", example = "特别约定条款(String)")
    private String pre_order_special_info;
    @ApiModelProperty(value = "预定须知(文本框信息）", example = "预定须知(文本框信息String）")
    private String pre_order_add_ons_info;
    @ApiModelProperty(value = "签证信息")
    private String visa_info;
    
    public Integer getProduct_id() {
        return product_id;
    }
    
    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }
    
    public int getProduct_type() {
        return product_type;
    }
    
    public void setProduct_type(int product_type) {
        this.product_type = product_type;
    }
    
    public String getActivity_recommend() {
        return activity_recommend;
    }
    
    public void setActivity_recommend(List<ActivityRecommendVo> activity_recommend) {
        this.activity_recommend = JSON.toJSONString(activity_recommend);
    }
    
    public String getShop_recommend() {
        return shop_recommend;
    }
    
    public void setShop_recommend(List<ShopRecommendVo> shop_recommend) {
        this.shop_recommend = JSON.toJSONString(shop_recommend);
    }
    
    public String getExplain_textbox() {
        return explain_textbox;
    }
    
    public void setExplain_textbox(String explain_textbox) {
        this.explain_textbox = explain_textbox;
    }
    
    public String getAnnouncement() {
        return announcement;
    }
    
    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }
    
    public String getWarm_prompt() {
        return warm_prompt;
    }
    
    public void setWarm_prompt(String warm_prompt) {
        this.warm_prompt = warm_prompt;
    }
    
    public String getPre_order_info() {
        return pre_order_info;
    }
    
    public void setPre_order_info(PreOrderNoticeVo pre_order_info) {
        this.pre_order_info = JSON.toJSONString(pre_order_info);
    }
    
    public String getPre_order_special_info() {
        return pre_order_special_info;
    }
    
    public void setPre_order_special_info(String pre_order_special_info) {
        this.pre_order_special_info = pre_order_special_info;
    }
    
    public String getPre_order_add_ons_info() {
        return pre_order_add_ons_info;
    }
    
    public void setPre_order_add_ons_info(String pre_order_add_ons_info) {
        this.pre_order_add_ons_info = pre_order_add_ons_info;
    }
    
    public String getVisa_info() {
        return visa_info;
    }
    
    public void setVisa_info(OtherVisaInfoVo visa_info) {
        this.visa_info = JSON.toJSONString(visa_info);
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}
