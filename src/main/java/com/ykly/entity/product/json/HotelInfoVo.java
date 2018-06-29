package com.ykly.entity.product.json;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("费用包含-住宿信息-酒店Vo")
public class HotelInfoVo {
    @ApiModelProperty(value = "目的地酒店或游船名称", example = "费用包含-住宿信息-酒店-目的地酒店或游船名称(String)")
    private String hotelOrShipName = "";
    @ApiModelProperty(value = "人数", example = "费用包含-住宿信息-酒店-人数(String)")
    private String peopleNum = "";
    @ApiModelProperty(value = "晚数", example = "费用包含-住宿信息-酒店-晚数(String)")
    private String nightNum = "";
    
    public String getHotelOrShipName() {
        return hotelOrShipName;
    }
    
    public void setHotelOrShipName(String hotelOrShipName) {
        this.hotelOrShipName = hotelOrShipName;
    }
    
    public String getPeopleNum() {
        return peopleNum;
    }
    
    public void setPeopleNum(String peopleNum) {
        this.peopleNum = peopleNum;
    }
    
    public String getNightNum() {
        return nightNum;
    }
    
    public void setNightNum(String nightNum) {
        this.nightNum = nightNum;
    }
    
}
