package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel("费用不包含——签证")
public class NotInPriceVisaVo implements ProductMontageDetail {
    
    @ApiModelProperty(value = "单选按钮", example = "费用不包含——签证-单选按钮:0.什么也不选 1.无 2.团队旅游签证费(输入价格) 3.落地签证费(输入价格、境外机场付) 4.落地签证费(输入价格、团费付) 5.团队旅游签证费 6.落地签证费(String)")
    private String notInPriceVisaType = "0";
    @ApiModelProperty(value = "签证费", example = "费用不包含——签证-签证费(String)")
    private String notInPriceVisaNum = "";
    @ApiModelProperty(value = "复选——个人签证,是否勾选 0否 1是", example = "费用不包含——签证-复选——个人签证,是否勾选 0否 1是(String)")
    private String notInPriceIfSingleVisaIsSelect = "0";
    @ApiModelProperty(value = "复选——团队签证,是否勾选 0否 1是", example = "费用不包含——签证-复选——团队签证,是否勾选 0否 1是(String)")
    private String notInPriceIfGroupVisaIsSelect = "0";
    @ApiModelProperty(value = "复选——港澳通行证置证费,是否勾选 0否 1是", example = "费用不包含——签证-复选——港澳通行证置证费,是否勾选 0否 1是(String)")
    private String notInPriceIfGotVisaIsSelect = "0";
    @ApiModelProperty(value = "复选——往来台湾通行证置证费,是否勾选 0否 1是", example = "费用不包含——签证-复选——往来台湾通行证置证费,是否勾选 0否 1是(String)")
    private String notInPriceIfTaiVisaIsSelect = "0";
    
    public String getNotInPriceVisaType() {
        return notInPriceVisaType;
    }
    
    public void setNotInPriceVisaType(String notInPriceVisaType) {
        this.notInPriceVisaType = notInPriceVisaType;
    }
    
    public String getNotInPriceVisaNum() {
        return notInPriceVisaNum;
    }
    
    public void setNotInPriceVisaNum(String notInPriceVisaNum) {
        this.notInPriceVisaNum = notInPriceVisaNum;
    }
    
    public String getNotInPriceIfSingleVisaIsSelect() {
        return notInPriceIfSingleVisaIsSelect;
    }
    
    public void setNotInPriceIfSingleVisaIsSelect(String notInPriceIfSingleVisaIsSelect) {
        this.notInPriceIfSingleVisaIsSelect = notInPriceIfSingleVisaIsSelect;
    }
    
    public String getNotInPriceIfGroupVisaIsSelect() {
        return notInPriceIfGroupVisaIsSelect;
    }
    
    public void setNotInPriceIfGroupVisaIsSelect(String notInPriceIfGroupVisaIsSelect) {
        this.notInPriceIfGroupVisaIsSelect = notInPriceIfGroupVisaIsSelect;
    }
    
    public String getNotInPriceIfGotVisaIsSelect() {
        return notInPriceIfGotVisaIsSelect;
    }
    
    public void setNotInPriceIfGotVisaIsSelect(String notInPriceIfGotVisaIsSelect) {
        this.notInPriceIfGotVisaIsSelect = notInPriceIfGotVisaIsSelect;
    }
    
    public String getNotInPriceIfTaiVisaIsSelect() {
        return notInPriceIfTaiVisaIsSelect;
    }
    
    public void setNotInPriceIfTaiVisaIsSelect(String notInPriceIfTaiVisaIsSelect) {
        this.notInPriceIfTaiVisaIsSelect = notInPriceIfTaiVisaIsSelect;
    }
    
    
    @Override
    public Map<String, Object> getMontageDetai() {
        Map<String,Object> detailMap = new HashMap<>();
        StringBuilder notInPriceVisaInfo = new StringBuilder("");

        switch (notInPriceVisaType){
            case "0":
            case "1":
                break;
            case "2":
                notInPriceVisaInfo.append("团队旅游签证费"+notInPriceVisaNum+"元/人,与团费一起支付;");
                break;
            case "3":
                notInPriceVisaInfo.append("落地签证费"+notInPriceVisaNum+"元/人,境外机场现付;");
                break;
            case "4":
                notInPriceVisaInfo.append("落地签证费"+notInPriceVisaNum+"元／人,与团费一起付;");
                break;
            case "5":
                notInPriceVisaInfo.append("团队旅游签证;");
                break;
            case "6":
                notInPriceVisaInfo.append("落地签证费");
                break;
            default:
                break;
        }

        switch (notInPriceIfSingleVisaIsSelect){
            case "0":
                break;
            case "1":
                notInPriceVisaInfo.append("个人签证,须自行办理;");
                break;
            default:
                break;
        }

        switch (notInPriceIfGroupVisaIsSelect){
            case "0":
                break;
            case "1":
                notInPriceVisaInfo.append("团队签证,须自行办理;");
                break;
            default:
                break;
        }

        switch (notInPriceIfGotVisaIsSelect){
            case "0":
                break;
            case "1":
                notInPriceVisaInfo.append("港澳通行证置证费;");
                break;
            default:
                break;
        }

        switch (notInPriceIfTaiVisaIsSelect){
            case "0":
                break;
            case "1":
                notInPriceVisaInfo.append("往来台湾通行证置证费;");
                break;
            default:
                break;
        }
        detailMap.put("notInPriceVisaInfo",notInPriceVisaInfo);
        return detailMap;
    }
}
