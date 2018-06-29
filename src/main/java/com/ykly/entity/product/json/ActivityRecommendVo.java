package com.ykly.entity.product.json;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("活动推荐——活动推荐")
public class ActivityRecommendVo {
    
    @ApiModelProperty(value = "活动推荐名称",example = "活动推荐——活动推荐-活动推荐名称(String)")
    private String activityName = "";
    @ApiModelProperty(value = "参考价",example = "活动推荐——活动推荐-参考价(String)")
    private String price = "";
    @ApiModelProperty(value = "详情",example = "活动推荐——活动推荐-详情(String)")
    private String detail = "";
    @ApiModelProperty(value = "备注",example = "活动推荐——活动推荐-备注(String)")
    private String remark = "";
    
    public String getActivityName() {
        return activityName;
    }
    
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
    
    public String getPrice() {
        return price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    
    public String getDetail() {
        return detail;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    public String getRemark() {
        return remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
