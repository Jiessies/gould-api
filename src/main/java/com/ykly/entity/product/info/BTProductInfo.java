package com.ykly.entity.product.info;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@ApiModel(value = "产品基本入参类")
public class BTProductInfo {
    
    @ApiModelProperty(value = "接口操作类型：0新增，1修改改", allowableValues = "接口操作类型：0新增，1修改改")
    private String operationType;
    
    @ApiModelProperty(value = "产品主表入参VO", allowableValues = "产品主表入参VO")
    @NotNull(message = "产品主表入参VO不能为空")
    @Valid
    private BTProductMainInfo mainInfo;
    
    @ApiModelProperty(value = "产品附表入参VO", allowableValues = "产品附表入参VO")
    private BTProductSupplementaryInfo supplementaryInfo;
    
    @ApiModelProperty(value = "产品行程表入参VO", allowableValues = "产品行程表入参VO")
    private BTProductTrip trip;
    
    public BTProductMainInfo getMainInfo() {
        return mainInfo;
    }
    
    public void setMainInfo(BTProductMainInfo mainInfo) {
        this.mainInfo = mainInfo;
    }
    
    public BTProductSupplementaryInfo getSupplementaryInfo() {
        return supplementaryInfo;
    }
    
    public void setSupplementaryInfo(BTProductSupplementaryInfo supplementaryInfo) {
        this.supplementaryInfo = supplementaryInfo;
    }
    
    public BTProductTrip getTrip() {
        return trip;
    }
    
    public void setTrip(BTProductTrip trip) {
        this.trip = trip;
    }
    
    public String getOperationType() {
        return operationType;
    }
    
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
}
