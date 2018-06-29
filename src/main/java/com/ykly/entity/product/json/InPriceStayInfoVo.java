package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApiModel("费用包含-住宿信息Vo")
public class InPriceStayInfoVo implements ProductMontageDetail {
    @ApiModelProperty(value = "酒店类型", example = "费用包含-住宿-酒店类型:0.什么也不选 1.无 2.行程所列酒店 3.*星级酒店 4.酒店 5.当地酒店(String)")
    private String hotelType = "0";
    @ApiModelProperty(value = "酒店星级(文本框)", example = "费用包含-住宿-酒店星级(文本框)(String)")
    private String hotelStarLevel = "";
    @ApiModelProperty(value = "人数", example = "费用包含-住宿-人数(String)")
    private String peopleNum = "";
    @ApiModelProperty(value = "是否选中复选框", example = "费用包含-住宿-是否选中复选框:0.未选中 1.选中(String)")
    private String useHotelIsSelect = "0";
    @ApiModelProperty(value = "酒店或游船集合")
    private List<HotelInfoVo> hotelOrShipList;


    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public String getHotelStarLevel() {
        return hotelStarLevel;
    }

    public void setHotelStarLevel(String hotelStarLevel) {
        this.hotelStarLevel = hotelStarLevel;
    }

    public String getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(String peopleNum) {
        this.peopleNum = peopleNum;
    }

    public String getUseHotelIsSelect() {
        return useHotelIsSelect;
    }

    public void setUseHotelIsSelect(String useHotelIsSelect) {
        this.useHotelIsSelect = useHotelIsSelect;
    }

    public List<HotelInfoVo> getHotelOrShipList()
    {
        if ("0".equals(useHotelIsSelect)){
            List<HotelInfoVo> list = new ArrayList<>();
            list.add(new HotelInfoVo());
            return list;
        }
        return hotelOrShipList;
    }

    public void setHotelOrShipList(List<HotelInfoVo> hotelOrShipList) {
        this.hotelOrShipList = hotelOrShipList;
    }
    
    @Override
    public Map<String, Object> getMontageDetai() {
        
        Map<String,Object> detailMap = new HashMap<>();
        StringBuilder inPriceStay = new StringBuilder("");
        switch (hotelType){
            case "0":
                break;
            case "1":
                inPriceStay = inPriceStay.append("无。");
                break;
            case "2":
                inPriceStay = inPriceStay.append("行程所列酒店。");
                break;
            case "3":
                inPriceStay = inPriceStay.append(hotelStarLevel + "星级酒店 标准" + peopleNum + "人间。");
                break;
            case "4":
                inPriceStay = inPriceStay.append("酒店标准" + peopleNum + "人间。");
                break;
            case "5":
                inPriceStay = inPriceStay.append("当地酒店标准" + peopleNum + "人间。(相当于国内" + hotelStarLevel + "星级酒店标准，因当地酒店不评星级，无法精确地按照国内标准衡量，具体可在网上查阅其它客人的评价)。");
                break;
            default:
                break;
        }
        switch (useHotelIsSelect){
            case "0":
                break;
            case "1":
                for(HotelInfoVo hotelInfoVo : hotelOrShipList){
                    inPriceStay = inPriceStay.append(hotelInfoVo.getHotelOrShipName()).append(hotelInfoVo.getPeopleNum()).append("人间").append(hotelInfoVo.getNightNum()).append("晚").append("。");
                }
                break;
            default:
                break;
        }
        detailMap.put("inPriceStay", inPriceStay);
        return detailMap;
    }
}