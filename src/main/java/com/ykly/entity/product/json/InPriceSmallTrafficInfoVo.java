package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel("费用包含-小交通信息Vo")
public class InPriceSmallTrafficInfoVo implements ProductMontageDetail {
    @ApiModelProperty(value = "选中状态", example = "费用包含-小交通-选中状态:0.未选中 1.选中(String)")
    private String useLittleIsSelect = "0";
    @ApiModelProperty(value = "输入框信息(某地到某地)", example = "费用包含-小交通-输入框信(某地到某地)(String)")
    private String airportText = "";
    @ApiModelProperty(value = "交通路径", example = "费用包含-小交通-交通路径:空字符串代表请选择、往返、去程、回程、中间段(String)")
    private String trafficPath = "";

    public String getUseLittleIsSelect() {
        return useLittleIsSelect;
    }

    public void setUseLittleIsSelect(String useLittleIsSelect) {
        this.useLittleIsSelect = useLittleIsSelect;
    }

    public String getAirportText() {
        return airportText;
    }

    public void setAirportText(String airportText) {
        this.airportText = airportText;
    }

    public String getTrafficPath() {
        return trafficPath;
    }

    public void setTrafficPath(String trafficPath) {
        this.trafficPath = trafficPath;
    }
    
    @Override
    public Map<String, Object> getMontageDetai() {
    
        Map<String, Object> detailMap = new HashMap<>();
        StringBuilder inPriceSmallTrafficInfo = new StringBuilder("");
        switch (useLittleIsSelect) {
            case "0":
                break;
            case "1":
                inPriceSmallTrafficInfo = inPriceSmallTrafficInfo.append("airportText").append("机场").append("trafficPath").append("服务。");
                break;
            default:
                break;
        }
        detailMap.put("inPriceSmallTrafficInfo", inPriceSmallTrafficInfo);
        return detailMap;
    }
}
