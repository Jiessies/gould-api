package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@ApiModel("火车票锁坐")
public class RequestTrainOrder {
    
    @NotBlank(message = "出发站名称不能为空")
    @ApiModelProperty("出发站名称")
    private String fromStationName;
    
    @NotBlank(message = "是否要无座票不能为空")
    @ApiModelProperty("是否要无座票，true要;false或者不传不要")
    private String isAcceptStanding;
    
    @NotBlank(message = "出发站简码不能为空")
    @ApiModelProperty("出发站简码")
    private String fromStationCode;
    
    @NotBlank(message = "到达站简码不能为空")
    @ApiModelProperty("到达站简码")
    private String toStationCode;
    
    @NotBlank(message = "到达站名称不能为空")
    @ApiModelProperty("到达站名称")
    private String toStationName;
    
    @NotBlank(message = "乘车日期不能为空")
    @ApiModelProperty("乘车日期")
    private String trainDate;
    
    @NotBlank(message = "是否需要选座不能为空")
    @ApiModelProperty("是否需要选座")
    private String isChooseSeats;
    
    @ApiModelProperty("选座STR（比如：1A1D2B2C2F，就是选5个坐席），选座个数要与乘客数量应该一致")
    private String chooseSeats;
    
    @ApiModelProperty("占座成功回调接口")
    private String callbackurl;
    
    @NotBlank(message = "车次不能为空")
    @ApiModelProperty("车次")
    private String checi;
    
    @ApiModelProperty("使用方订单号")
    private String orderid;
    
    @ApiModelProperty("乘客信息")
    @NotNull(message = "乘客信息不能为空")
    @Valid
    private List<RequestTrainOrderPassengers> passengersList;
    
    public String getFromStationName() {
        return fromStationName;
    }
    
    public void setFromStationName(String fromStationName) {
        this.fromStationName = fromStationName;
    }
    
    public String getIsAcceptStanding() {
        return isAcceptStanding;
    }
    
    public void setIsAcceptStanding(String isAcceptStanding) {
        this.isAcceptStanding = isAcceptStanding;
    }
    
    public String getFromStationCode() {
        return fromStationCode;
    }
    
    public void setFromStationCode(String fromStationCode) {
        this.fromStationCode = fromStationCode;
    }
    
    public String getToStationCode() {
        return toStationCode;
    }
    
    public void setToStationCode(String toStationCode) {
        this.toStationCode = toStationCode;
    }
    
    public String getToStationName() {
        return toStationName;
    }
    
    public void setToStationName(String toStationName) {
        this.toStationName = toStationName;
    }
    
    public String getTrainDate() {
        return trainDate;
    }
    
    public void setTrainDate(String trainDate) {
        this.trainDate = trainDate;
    }
    
    public String getIsChooseSeats() {
        return isChooseSeats;
    }
    
    public void setIsChooseSeats(String isChooseSeats) {
        this.isChooseSeats = isChooseSeats;
    }
    
    public String getChooseSeats() {
        return chooseSeats;
    }
    
    public void setChooseSeats(String chooseSeats) {
        this.chooseSeats = chooseSeats;
    }
    
    public String getCallbackurl() {
        return callbackurl;
    }
    
    public void setCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl;
    }
    
    public String getCheci() {
        return checi;
    }
    
    public void setCheci(String checi) {
        this.checi = checi;
    }
    
    public String getOrderid() {
        return orderid;
    }
    
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
    
    public List<RequestTrainOrderPassengers> getPassengersList() {
        return passengersList;
    }
    
    public void setPassengersList(List<RequestTrainOrderPassengers> passengersList) {
        this.passengersList = passengersList;
    }
}