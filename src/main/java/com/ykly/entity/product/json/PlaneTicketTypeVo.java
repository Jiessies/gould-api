package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;


@ApiModel("费用包含-交通信息-机票类型Vo")
public class PlaneTicketTypeVo implements ProductMontageDetail {
    @ApiModelProperty(value = "交通路径", example = "费用包含-交通信息-机票类型-交通路径：空字符串代表请选择、往返、去程、回程、中间段(String)")
    private String trafficPath = "";
    @ApiModelProperty(value = "税类型", example = "费用包含-交通信息-机票类型-税类型(飞机票选择):空字符串代表没有选择、含税、不含税、其他(String)")
    private String taxType = "";

    public String getTrafficPath() {
        return trafficPath;
    }

    public void setTrafficPath(String trafficPath) {
        this.trafficPath = trafficPath;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }
    
    @Override
    public Map<String, Object> getMontageDetai() {
        return null;
    }
}
