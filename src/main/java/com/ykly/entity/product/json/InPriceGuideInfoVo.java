package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel("费用包含-导游信息Vo")
public class InPriceGuideInfoVo implements ProductMontageDetail {
    @ApiModelProperty(value = "类型", example = "费用包含-导游-0.什么也不选 1.无 2.当地中文导游 3.专职中文领队兼导游 4.专职领队和当地中文导游(String)")
    private String guideType = "0";
    @ApiModelProperty(value = "输入框信息", example = "费用包含-导游-输入框信息(String)")
    private String textGuideInfo = "";
    
    public String getGuideType() {
        return guideType;
    }
    
    public void setGuideType(String guideType) {
        this.guideType = guideType;
    }
    
    public String getTextGuideInfo() {
        return textGuideInfo;
    }
    
    public void setTextGuideInfo(String textGuideInfo) {
        this.textGuideInfo = textGuideInfo;
    }
    
    @Override
    public Map<String, Object> getMontageDetai() {
        Map<String, Object> detailMap = new HashMap<>();
        StringBuilder inPriceGuideInfo = new StringBuilder("");
        switch (guideType) {
            case "0":
                break;
            case "1":
                inPriceGuideInfo = inPriceGuideInfo.append("无。");
                break;
            case "2":
                inPriceGuideInfo = inPriceGuideInfo.append("当地中文导游，").append(textGuideInfo).append("。");
                break;
            case "3":
                inPriceGuideInfo = inPriceGuideInfo.append("专职中文领队兼导游，").append(textGuideInfo).append("。");
                break;
            case "4":
                inPriceGuideInfo = inPriceGuideInfo.append("专职领队和当地中文导游").append(textGuideInfo).append("。");
                break;
            default:
                break;
        }
        detailMap.put("inPriceGuideInfo", inPriceGuideInfo);
        return detailMap;
    }
}
