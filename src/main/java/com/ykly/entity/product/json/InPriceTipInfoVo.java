package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel("费用包含-小费信息Vo")
public class InPriceTipInfoVo implements ProductMontageDetail {
    @ApiModelProperty(value = "选中状态", example = "费用包含-小费-选中状态:0.未选中 1.选中(String)")
    private String useTipIsSelect = "0";
    @ApiModelProperty(value = "价格", example = "费用包含-小费-价格(String)")
    private String price = "";
    @ApiModelProperty(value = "输入框说明", example = "费用包含-小费-输入框说明(String)")
    private String textTipInfo = "";

    public String getUseTipIsSelect() {
        return useTipIsSelect;
    }

    public void setUseTipIsSelect(String useTipIsSelect) {
        this.useTipIsSelect = useTipIsSelect;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTextTipInfo() {
        return textTipInfo;
    }

    public void setTextTipInfo(String textTipInfo) {
        this.textTipInfo = textTipInfo;
    }
    
    @Override
    public Map<String, Object> getMontageDetai() {
        Map<String, Object> detailMap = new HashMap<>();
        StringBuilder inPriceTipInfo = new StringBuilder("");
        switch (useTipIsSelect) {
            case "0":
                break;
            case "1":
                inPriceTipInfo = inPriceTipInfo.append("司机导游小费全程").append(price).append("元／人").append(textTipInfo).append("。");
                break;
            default:
                break;
        }
        detailMap.put("inPriceTipInfo", inPriceTipInfo);
        return detailMap;
    }
}
