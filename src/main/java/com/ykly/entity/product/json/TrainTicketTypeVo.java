package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

@ApiModel("费用包含-交通信息-火车票类型Vo")
public class TrainTicketTypeVo implements ProductMontageDetail {
    @ApiModelProperty(value = "交通路径", example = "费用包含-交通信息-火车票类型-交通路径：空字符串代表请选择、往返、去程、回程、中间段(String)")
    private String trafficPath = "";
    @ApiModelProperty(value = "座位类别", allowableValues = "费用包含-交通信息-火车票类型-座位类别:空字符串代表没有选择、硬卧、软卧、硬座、一等座、二等座(String)")
    private String seatType = "";

    public String getTrafficPath() {
        return trafficPath;
    }

    public void setTrafficPath(String trafficPath) {
        this.trafficPath = trafficPath;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }
    
    @Override
    public Map<String, Object> getMontageDetai() {
        return null;
    }
}
