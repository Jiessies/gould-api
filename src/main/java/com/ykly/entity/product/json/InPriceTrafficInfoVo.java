package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@ApiModel("费用包含-交通信息Vo")
public class InPriceTrafficInfoVo implements ProductMontageDetail {
    @ApiModelProperty(value = "机票复选框", example = "费用包含-交通信息-机票复选框：0.未选中 1.选中(String)")
    private String usePlaneIsSelect = "0";
    @ApiModelProperty("机票")
    private List<PlaneTicketTypeVo> planeTicketList;
    @ApiModelProperty(value = "火车票复选框", example = "费用包含-交通信息-火车票复选框：0.未选中 1.选中(String)")
    private String useTrainIsSelect = "0";
    @ApiModelProperty(value = "火车票")
    private List<TrainTicketTypeVo> trainTicketList;
    @ApiModelProperty(value = "旅游巴士复选框", example = "费用包含-交通信息-旅游巴士复选框：0.未选中 1.选中(String)")
    private String useTourBusIsSelect = "0";
    @ApiModelProperty(value = "旅游巴士交通路径", example = "费用包含-交通信息-旅游巴士交通路径：空字符串代表请选择、往返、去程、回程、中间段(String)")
    private String tourBusTrafficPath;
    @ApiModelProperty(value = "当地旅游巴士", example = "费用包含-交通信息-当地旅游巴士：0.未选中 1.选中(String)")
    private String localTravelBusIsSelect = "0";

    public String getUsePlaneIsSelect() {
        return usePlaneIsSelect;
    }

    public void setUsePlaneIsSelect(String usePlaneIsSelect) {
        this.usePlaneIsSelect = usePlaneIsSelect;
    }

    public List<PlaneTicketTypeVo> getPlaneTicketList() {
        if ("0".equals(usePlaneIsSelect)){
            PlaneTicketTypeVo planeTicket = new PlaneTicketTypeVo();
            List<PlaneTicketTypeVo> list = new ArrayList<>();
            list.add(planeTicket);
            return list;
        }
        return planeTicketList;
    }

    public void setPlaneTicketList(List<PlaneTicketTypeVo> planeTicketList) {
        this.planeTicketList = planeTicketList;
    }

    public List<TrainTicketTypeVo> getTrainTicketList() {
        if ("0".equals(usePlaneIsSelect)){
            TrainTicketTypeVo trainTicket = new TrainTicketTypeVo();
            List<TrainTicketTypeVo> list = new ArrayList<>();
            list.add(trainTicket);
            return list;
        }
        return trainTicketList;
    }

    public void setTrainTicketList(List<TrainTicketTypeVo> trainTicketList) {
        this.trainTicketList = trainTicketList;
    }

    public String getUseTrainIsSelect() {
        return useTrainIsSelect;
    }

    public void setUseTrainIsSelect(String useTrainIsSelect) {
        this.useTrainIsSelect = useTrainIsSelect;
    }


    public String getUseTourBusIsSelect() {
        return useTourBusIsSelect;
    }

    public void setUseTourBusIsSelect(String useTourBusIsSelect) {
        this.useTourBusIsSelect = useTourBusIsSelect;
    }

    public String getTourBusTrafficPath() {
        return "0".equals(useTourBusIsSelect)?"":tourBusTrafficPath;
    }

    public void setTourBusTrafficPath(String tourBusTrafficPath) {
        this.tourBusTrafficPath = tourBusTrafficPath;
    }

    public String getLocalTravelBusIsSelect() {
        return localTravelBusIsSelect;
    }

    public void setLocalTravelBusIsSelect(String localTravelBusIsSelect) {
        this.localTravelBusIsSelect = localTravelBusIsSelect;
    }
    
    @Override
    public Map<String, Object> getMontageDetai() {
        Map<String, Object> detailMap = new HashMap<>();
        StringBuilder inPriceTrafficInfo = new StringBuilder("");
        switch (usePlaneIsSelect) {
            case "0":
                break;
            case "1":
                inPriceTrafficInfo = inPriceTrafficInfo.append("（团队机票将统一出票，如遇政府或航空公司政策性调整燃油税费，在未出票的情况下将进行多退少补，敬请谅解");
                for(PlaneTicketTypeVo ptt : planeTicketList){
                    inPriceTrafficInfo.append(ptt.getTrafficPath()).append("团队经济舱机票").append(ptt.getTaxType()).append("。");
                }
                break;
            default:
                break;
        }
        switch (useTrainIsSelect) {
            case "0":
                break;
            case "1":
                for(TrainTicketTypeVo ttt : trainTicketList){
                    inPriceTrafficInfo.append(ttt.getTrafficPath()).append("火车票").append(ttt.getSeatType()).append("。");
                }
                break;
            default:
                break;
        }
        switch (useTourBusIsSelect) {
            case "0":
                break;
            case "1":
                inPriceTrafficInfo.append(tourBusTrafficPath).append("旅游巴士").append("。");
                break;
            default:
                break;
        }
        switch (localTravelBusIsSelect) {
            case "0":
                break;
            case "1":
                inPriceTrafficInfo.append("当地旅游巴士").append("。");
                break;
            default:
                break;
        }
        detailMap.put("inPriceTrafficInfo", inPriceTrafficInfo);
        return detailMap;
    }
}
