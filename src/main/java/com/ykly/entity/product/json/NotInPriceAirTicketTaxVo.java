package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel("费用不包含——机票税")
public class NotInPriceAirTicketTaxVo implements ProductMontageDetail {
    
    @ApiModelProperty(value = "往返机票税,是否勾选 0否 1是", example = "费用不包含——机票税-往返机票税,是否勾选 0否 1是(String)")
    private String notInPriceAirportNumIsSelect = "0";
    @ApiModelProperty(value = "往返机票税X元", example = "费用不包含——机票税-往返机票税X元(String)")
    private String notInPriceAirportNum = "";
    @ApiModelProperty(value = "境外机场回程机场税,是否勾选 0否 1是", example = "费用不包含——机票税-境外机场回程机场税,是否勾选 0否 1是(String)")
    private String notInPriceOutAirportNumIsSelect = "0";
    @ApiModelProperty(value = "境外机场回程机场税X元", example = "费用不包含——机票税-境外机场回程机场税X元(String)")
    private String notInPriceOutAirportNum = "";
    
    public String getNotInPriceAirportNumIsSelect() {
        return notInPriceAirportNumIsSelect;
    }
    
    public void setNotInPriceAirportNumIsSelect(String notInPriceAirportNumIsSelect) {
        this.notInPriceAirportNumIsSelect = notInPriceAirportNumIsSelect;
    }
    
    public String getNotInPriceOutAirportNumIsSelect() {
        return notInPriceOutAirportNumIsSelect;
    }
    
    public void setNotInPriceOutAirportNumIsSelect(String notInPriceOutAirportNumIsSelect) {
        this.notInPriceOutAirportNumIsSelect = notInPriceOutAirportNumIsSelect;
    }
    
    public String getNotInPriceAirportNum() {
        return notInPriceAirportNum;
    }
    
    public void setNotInPriceAirportNum(String notInPriceAirportNum) {
        this.notInPriceAirportNum = notInPriceAirportNum;
    }
    
    public String getNotInPriceOutAirportNum() {
        return notInPriceOutAirportNum;
    }
    
    public void setNotInPriceOutAirportNum(String notInPriceOutAirportNum) {
        this.notInPriceOutAirportNum = notInPriceOutAirportNum;
    }
    
    @Override
    public Map<String, Object> getMontageDetai() {
        Map<String,Object> detailMap = new HashMap<>();
        StringBuilder notInPriceAirTicketTaxInfo = new StringBuilder("");

        switch (notInPriceAirportNumIsSelect){
            case "0":
                break;
            case "1":
                notInPriceAirTicketTaxInfo.append("往返机票税"+notInPriceAirportNum+"元/人,报名时与团费一起支付;");
                break;
            default:
                break;
        }
        switch (notInPriceOutAirportNumIsSelect){
            case "0":
                break;
            case "1":
                notInPriceAirTicketTaxInfo.append("境外机场回程机场税"+notInPriceOutAirportNum+"元/人，境外机场现付(仅供参考，实际费用按当天规定执行)。");
                break;
            default:
                break;
        }
        detailMap.put("notInPriceAirTicketTaxInfo",notInPriceAirTicketTaxInfo);
        return detailMap;
    }
}
