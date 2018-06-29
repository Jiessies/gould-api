package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel("费用不包含——门票")
public class NotInpriceTicketVo implements ProductMontageDetail {
    
    @ApiModelProperty(value = "门票,是否勾选 0否 1是", example = "费用不包含——门票-门票,是否勾选 0否 1是(String)")
    private String notInpriceTicketIsSelect = "0";
    @ApiModelProperty(value = "门票", example = "费用不包含——门票-门票(String)")
    private String notInpriceTicket = "";
    
    public String getNotInpriceTicketIsSelect() {
        return notInpriceTicketIsSelect;
    }
    
    public void setNotInpriceTicketIsSelect(String notInpriceTicketIsSelect) {
        this.notInpriceTicketIsSelect = notInpriceTicketIsSelect;
    }
    
    public String getNotInpriceTicket() {
        return notInpriceTicket;
    }
    
    public void setNotInpriceTicket(String notInpriceTicket) {
        this.notInpriceTicket = notInpriceTicket;
    }
    
    
    @Override
    public Map<String, Object> getMontageDetai() {
        Map<String,Object> detailMap = new HashMap<>();
        StringBuilder notInpriceTicketInfo = new StringBuilder("");
        switch (notInpriceTicketIsSelect){
            case "0":
                break;
            case "1":
                notInpriceTicketInfo.append("行程中注明需要另行支付的自费景点("+notInpriceTicket+")。");
                break;
            default:
                break;
        }
        detailMap.put("notInpriceTicketInfo",notInpriceTicketInfo);
        return detailMap;
    }
}
