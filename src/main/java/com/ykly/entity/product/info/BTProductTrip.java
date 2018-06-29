package com.ykly.entity.product.info;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@ApiModel(value = "行程主表")
public class BTProductTrip {
    
    @ApiModelProperty(value = "行程主键ID", hidden = true)
    private int id;
    @ApiModelProperty(value = "产品id",example = "产品id(int)",hidden = true)
    private int product_id;
    @ApiModelProperty(value = "产品类型",example = "产品类型(int)")
    private int product_type;
    @ApiModelProperty(value = "行程编号",example = "行程编号(String)")
    private String trip_code;
    @ApiModelProperty(value = "供应商行程编号",example = "供应商行程编号(String)")
    private String supply_code;
    @ApiModelProperty(value = "行程特色",example = "行程特色(String)")
    private String trip_feature;
    @ApiModelProperty(value = "行程天数",example = "行程天数(int)")
    private int trip_days;
    @ApiModelProperty(value = "行程晚数",example = "行程晚数(int)")
    private int trip_nights;
    @ApiModelProperty(value = "是否默认行程 0否 1是",example = "否默认行程 0否 1是(int)")
    private int is_default;
    @ApiModelProperty(value = "去程交通方式",example = "去程交通方式ID(String)")
    private String startingPointTraffic;
    @ApiModelProperty(value = "返程交通方式",example = "返程交通方式ID(String)")
    private String returnTripTraffic;
    @ApiModelProperty(value = "线路行程说明",example = "线路行程说明(String)")
    private String circuit_journey;
    @ApiModelProperty(value = "行程附注",example = "行程附注(String)")
    private String journey_annotation = "";
    @ApiModelProperty(value = "产品行程天表入参VO")
    private List<BTProductTripDays> tripDaysList;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getProduct_id() {
        return product_id;
    }
    
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    
    public int getProduct_type() {
        return product_type;
    }
    
    public void setProduct_type(int product_type) {
        this.product_type = product_type;
    }
    
    public String getTrip_code() {
        return trip_code;
    }
    
    public void setTrip_code(String trip_code) {
        this.trip_code = trip_code;
    }
    
    public String getSupply_code() {
        return supply_code;
    }
    
    public void setSupply_code(String supply_code) {
        this.supply_code = supply_code;
    }
    
    public String getTrip_feature() {
        return trip_feature;
    }
    
    public void setTrip_feature(String trip_feature) {
        this.trip_feature = trip_feature;
    }
    
    public int getTrip_days() {
        return trip_days;
    }
    
    public void setTrip_days(int trip_days) {
        this.trip_days = trip_days;
    }
    
    public int getTrip_nights() {
        return trip_nights;
    }
    
    public void setTrip_nights(int trip_nights) {
        this.trip_nights = trip_nights;
    }
    
    public int getIs_default() {
        return is_default;
    }
    
    public void setIs_default(int is_default) {
        this.is_default = is_default;
    }
    
    public String getStartingPointTraffic() {
        return startingPointTraffic;
    }
    
    public void setStartingPointTraffic(String startingPointTraffic) {
        this.startingPointTraffic = startingPointTraffic;
    }
    
    public String getReturnTripTraffic() {
        return returnTripTraffic;
    }
    
    public void setReturnTripTraffic(String returnTripTraffic) {
        this.returnTripTraffic = returnTripTraffic;
    }
    
    public String getCircuit_journey() {
        return circuit_journey;
    }
    
    public void setCircuit_journey(String circuit_journey) {
        this.circuit_journey = circuit_journey;
    }
    
    public List<BTProductTripDays> getTripDaysList() {
        return tripDaysList;
    }
    
    public void setTripDaysList(List<BTProductTripDays> tripDaysList) {
        this.tripDaysList = tripDaysList;
    }
    
    public String getJourney_annotation() {
        return journey_annotation;
    }
    
    public void setJourney_annotation(String journey_annotation) {
        this.journey_annotation = journey_annotation;
    }
}
