package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel("费用包含-儿童价信息Vo")
public class InPriceChildInfoVo implements ProductMontageDetail {
    @ApiModelProperty(value = "类型", example = "费用包含-儿童价-类型:0:什么也不选 1.无 2.年龄标准 3.身高标准 4.特殊说明(String)")
    private String childType = "0";
    
    @ApiModelProperty(value = "年龄(身高)最小值", example = "费用包含-儿童价-年龄(身高)最小值,根据类型选择填写年龄或者身高(String)")
    private String minValue = "";
    
    @ApiModelProperty(value = "年龄(身高)最大值", example = "费用包含-儿童价-年龄(身高)最大值,根据类型选择填写年龄或身高(String)")
    private String maxValue = "";
    
    @ApiModelProperty(value = "是否占床", example = "费用包含-儿童价-是否占床：空字符串代表什么也不选、占床、不占床(String)")
    private String isOccupyBed = "";
    
    @ApiModelProperty(value = "输入框信息", example = "费用包含-儿童价-输入框信息(String)")
    private String textExplaininfo = "";
    
    
    public String getChildType() {
        return childType;
    }
    
    public void setChildType(String childType) {
        this.childType = childType;
    }
    
    public String getMinValue() {
        return minValue;
    }
    
    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }
    
    public String getMaxValue() {
        return maxValue;
    }
    
    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }
    
    public String getIsOccupyBed() {
        return isOccupyBed;
    }
    
    public void setIsOccupyBed(String isOccupyBed) {
        this.isOccupyBed = isOccupyBed;
    }
    
    public String getTextExplaininfo() {
        return textExplaininfo;
    }
    
    public void setTextExplaininfo(String textExplaininfo) {
        this.textExplaininfo = textExplaininfo;
    }
    
    @Override
    public Map<String, Object> getMontageDetai() {
        Map<String, Object> detailMap = new HashMap<>();
        StringBuilder inPriceChildInfo = new StringBuilder("");
        switch (childType) {
            case "0":
                break;
            case "1":
                inPriceChildInfo = inPriceChildInfo.append("无。");
                break;
            case "2":
                inPriceChildInfo = inPriceChildInfo.append("年领").append(minValue).append("~").append(maxValue).append("周岁（不含），").append(isOccupyBed).append(textExplaininfo).append("。");
                break;
            case "3":
                inPriceChildInfo = inPriceChildInfo.append("身高").append(minValue).append("~").append(maxValue).append("cm（含）").append(isOccupyBed).append(textExplaininfo).append("。");
                break;
            case "4":
                inPriceChildInfo = inPriceChildInfo.append("儿童特殊说明。");
                break;
            default:
                break;
        }
        detailMap.put("inPriceChildInfo", inPriceChildInfo);
        return detailMap;
    }
}
