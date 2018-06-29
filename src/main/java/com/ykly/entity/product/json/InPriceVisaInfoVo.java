package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel("费用包含-签证信息Vo")
public class InPriceVisaInfoVo implements ProductMontageDetail {
    @ApiModelProperty(value = "签证类型", example = "费用包含-签证-签证类型:0.什么也不选 1.无 2.输入价格的团队旅游签证 3.输入价格的落地签证 4.免签证 5.团队旅游签证 6.落地签证(String)")
    private String visaType;
    @ApiModelProperty(value = "输入框价格", example = "费用包含-签证-输入框价格(String)")
    private String textPrice;


    public String getVisaType() {
        return visaType;
    }

    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }

    public String getTextPrice() {
        return textPrice;
    }

    public void setTextPrice(String textPrice) {
        this.textPrice = textPrice;
    }
    
    @Override
    public Map<String, Object> getMontageDetai() {
        Map<String, Object> detailMap = new HashMap<>();
        StringBuilder inPriceVisaInfo = new StringBuilder("");
        switch (visaType) {
            case "0":
                break;
            case "1":
                inPriceVisaInfo = inPriceVisaInfo.append("无").append("。");
                break;
            case "2":
                inPriceVisaInfo = inPriceVisaInfo.append("团队旅游签证").append(textPrice).append("元／人").append("。");
                break;
            case "3":
                inPriceVisaInfo = inPriceVisaInfo.append("落地签证").append(textPrice).append("元／人").append("。");
                break;
            case "4":
                inPriceVisaInfo = inPriceVisaInfo.append("免签证").append("。");
                break;
            case "5":
                inPriceVisaInfo = inPriceVisaInfo.append("团队旅游签证").append("。");
                break;
            case "6":
                inPriceVisaInfo = inPriceVisaInfo.append("落地签证").append("。");
                break;
            default:
                break;
        }
        detailMap.put("inPriceVisaInfo", inPriceVisaInfo);
        return detailMap;
    }
}
