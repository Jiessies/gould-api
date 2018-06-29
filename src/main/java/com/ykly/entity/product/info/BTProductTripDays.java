package com.ykly.entity.product.info;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@ApiModel(value = "行程天表")
public class BTProductTripDays {
    
    @ApiModelProperty(value = "主键ID", hidden = true)
    private int day_id;
    @ApiModelProperty(value = "行程段id", hidden = true)
    private int trip_id;
    @ApiModelProperty(value = "产品ID", hidden = true)
    private int product_id;
    @ApiModelProperty(value = "标题", example = "标题(String)")
    private String trip_title;
    @ApiModelProperty(value = "早餐", example = "早餐(String)")
    private String breakfast;
    @ApiModelProperty(value = "午餐", example = "午餐(String)")
    private String lunch;
    @ApiModelProperty(value = "晚餐", example = "晚餐(String)")
    private String dinner;
    @ApiModelProperty(value = "住宿", example = "住宿(String)")
    private String trip_stay;
    @ApiModelProperty(value = "第几天", example = "第几天(int)")
    private int trip_days;
    @ApiModelProperty(value = "描述", example = "描述(String)")
    private String trip_describe;
    @ApiModelProperty(value = "BOM行程ID", example = "BOM行程ID(int)")
    private int bom_id;
    
    @ApiModelProperty(value = "产品行程段表入参VO", hidden = true)
    private List<BTProductTripChips> tripChipsList;
    
    @ApiModelProperty(value = "产品行程店表入参VO", hidden = true)
    private List<BTProductTripShops> tripShopsList;
    
    public int getTrip_id() {
        return trip_id;
    }
    
    public void setTrip_id(int trip_id) {
        this.trip_id = trip_id;
    }
    
    public int getProduct_id() {
        return product_id;
    }
    
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    
    public String getTrip_title() {
        return trip_title;
    }
    
    public void setTrip_title(String trip_title) {
        this.trip_title = trip_title;
    }
    
    public String getBreakfast() {
        return breakfast;
    }
    
    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }
    
    public String getLunch() {
        return lunch;
    }
    
    public void setLunch(String lunch) {
        this.lunch = lunch;
    }
    
    public String getDinner() {
        return dinner;
    }
    
    public void setDinner(String dinner) {
        this.dinner = dinner;
    }
    
    public String getTrip_stay() {
        return trip_stay;
    }
    
    public void setTrip_stay(String trip_stay) {
        this.trip_stay = trip_stay;
    }
    
    public int getTrip_days() {
        return trip_days;
    }
    
    public void setTrip_days(int trip_days) {
        this.trip_days = trip_days;
    }
    
    public String getTrip_describe() {
        return trip_describe;
    }
    
    public void setTrip_describe(String trip_describe) {
        this.trip_describe = trip_describe;
    }
    
    public List<BTProductTripChips> getTripChipsList() {
        return tripChipsList;
    }
    
    public void setTripChipsList(List<BTProductTripChips> tripChipsList) {
        this.tripChipsList = tripChipsList;
    }
    
    public List<BTProductTripShops> getTripShopsList() {
        return tripShopsList;
    }
    
    public void setTripShopsList(List<BTProductTripShops> tripShopsList) {
        this.tripShopsList = tripShopsList;
    }
    
    public int getDay_id() {
        return day_id;
    }
    
    public void setDay_id(int day_id) {
        this.day_id = day_id;
    }
    
    public int getBom_id() {
        return bom_id;
    }
    
    public void setBom_id(int bom_id) {
        this.bom_id = bom_id;
    }
}
