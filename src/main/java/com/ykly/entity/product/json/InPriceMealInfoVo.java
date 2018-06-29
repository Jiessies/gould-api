package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel("费用包含-用餐信息Vo")
public class InPriceMealInfoVo implements ProductMontageDetail {
    @ApiModelProperty(value = "类型", example = "费用包含-用餐-类型:0.什么也不选 1.无 2.行程中团队标准用餐(含飞机用餐) 3.行程中团队标准用餐(不含飞机用餐)(String)")
    private String mealType = "0";
    @ApiModelProperty(value = "输入框信息", example = "费用包含-用餐-输入框信息(String)")
    private String textMealInfo = "";
    
    public String getMealType() {
        return mealType;
    }
    
    public void setMealType(String mealType) {
        this.mealType = mealType;
    }
    
    public String getTextMealInfo() {
        return textMealInfo;
    }
    
    public void setTextMealInfo(String textMealInfo) {
        this.textMealInfo = textMealInfo;
    }
    
    @Override
    public Map<String, Object> getMontageDetai() {
        Map<String, Object> detailMap = new HashMap<>();
        StringBuilder inPriceMealInfo = new StringBuilder("");
        switch (mealType) {
            case "0":
                break;
            case "1":
                inPriceMealInfo = inPriceMealInfo.append("无。");
                break;
            case "2":
                inPriceMealInfo = inPriceMealInfo.append("行程中团队标准用餐，").append(textMealInfo).append("（中式餐或自助餐或特色餐，含飞机上用餐，自由活动期间用餐请自理；如因自身原因放弃用餐，则餐费不退）。");
                break;
            case "3":
                inPriceMealInfo = inPriceMealInfo.append("行程中团队标准用餐，").append(textMealInfo).append("（中式餐或自助餐或特色餐，自由活动期间用餐请自理；如因自身原因放弃用餐，则餐费不退）。");
                break;
            default:
                break;
        }
        detailMap.put("inPriceMealInfo", inPriceMealInfo);
        return detailMap;
    }
}
