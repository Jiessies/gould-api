package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel("费用包含-门票信息Vo")
public class InPriceTicketInfoVo implements ProductMontageDetail {
    @ApiModelProperty(value = "复选框选中状态", example = "费用包含-门票-复选框选中状态:0.未选中 1.选中(String)")
    private String ticketIsSelect = "0";
    @ApiModelProperty(value = "输入框输入信息", example = "费用包含-门票-输入框信息(String)")
    private String textTicketInfo = "";


    public String getTicketIsSelect() {
        return ticketIsSelect;
    }

    public void setTicketIsSelect(String ticketIsSelect) {
        this.ticketIsSelect = ticketIsSelect;
    }

    public String getTextTicketInfo() {
        return textTicketInfo;
    }

    public void setTextTicketInfo(String textTicketInfo) {
        this.textTicketInfo = textTicketInfo;
    }
    
    @Override
    public Map<String, Object> getMontageDetai() {
        Map<String, Object> detailMap = new HashMap<>();
        StringBuilder inPriceTicketInfo = new StringBuilder("");
        switch (ticketIsSelect) {
            case "0":
                break;
            case "1":
                inPriceTicketInfo = inPriceTicketInfo.append("行程中所含的景点首道大门票，").append(textTicketInfo).append("。");
                break;
            default:
                break;
        }
        detailMap.put("inPriceTicketInfo", inPriceTicketInfo);
        return detailMap;
    }
}
