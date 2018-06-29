package com.ykly.entity.product.detail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@ApiModel(value = "产品详情-推荐")
public class BTProductDetailRecommend {
    
    @ApiModelProperty(value = "主键ID", hidden = true)
    private int id;
    @ApiModelProperty(value = "产品Id", example = "产品Id(int)")
    private Integer product_id;
    @ApiModelProperty(value = "产品类型", example = "产品类型(int)")
    private int product_type;
    @ApiModelProperty(value = "特色描述", example = "特色描述(String)")
    private String feature_describe;
    @ApiModelProperty(value = "详情", example = "详情(String)")
    private String recommend_detail;
    @ApiModelProperty(value = "吃", example = "吃(String)")
    private String eat;
    @ApiModelProperty(value = "住", example = "住(String)")
    private String reside;
    @ApiModelProperty(value = "行", example = "行(String)")
    private String walk;
    @ApiModelProperty(value = "游", example = "游(String)")
    private String travel;
    @ApiModelProperty(value = "娱", example = "娱(String)")
    private String recreation;
    @ApiModelProperty(value = "购", example = "购(String)")
    private String reco_buy;
    @ApiModelProperty(value = "赠送", example = "赠送(String)")
    private String present;
    @ApiModelProperty(value = "特别优惠", example = "特别优惠(String)")
    private String special_offer;
    @ApiModelProperty(value = "重要提示", example = "重要提示(String)")
    private String significance_prompt;
    @ApiModelProperty(value = "交通信息", example = "交通信息(String)")
    private String traffic_information;
    
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
    
    public String getFeature_describe() {
        return feature_describe;
    }
    
    public void setFeature_describe(String feature_describe) {
        this.feature_describe = feature_describe;
    }
    
    public String getRecommend_detail() {
        return recommend_detail;
    }
    
    public void setRecommend_detail(String recommend_detail) {
        this.recommend_detail = recommend_detail;
    }
    
    public String getEat() {
        return eat;
    }
    
    public void setEat(String eat) {
        this.eat = eat;
    }
    
    public String getReside() {
        return reside;
    }
    
    public void setReside(String reside) {
        this.reside = reside;
    }
    
    public String getWalk() {
        return walk;
    }
    
    public void setWalk(String walk) {
        this.walk = walk;
    }
    
    public String getTravel() {
        return travel;
    }
    
    public void setTravel(String travel) {
        this.travel = travel;
    }
    
    public String getRecreation() {
        return recreation;
    }
    
    public void setRecreation(String recreation) {
        this.recreation = recreation;
    }
    
    public String getReco_buy() {
        return reco_buy;
    }
    
    public void setReco_buy(String reco_buy) {
        this.reco_buy = reco_buy;
    }
    
    public String getPresent() {
        return present;
    }
    
    public void setPresent(String present) {
        this.present = present;
    }
    
    public String getSpecial_offer() {
        return special_offer;
    }
    
    public void setSpecial_offer(String special_offer) {
        this.special_offer = special_offer;
    }
    
    public String getSignificance_prompt() {
        return significance_prompt;
    }
    
    public void setSignificance_prompt(String significance_prompt) {
        this.significance_prompt = significance_prompt;
    }
    
    public String getTraffic_information() {
        return traffic_information;
    }
    
    public void setTraffic_information(String traffic_information) {
        this.traffic_information = traffic_information;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}
