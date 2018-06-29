package com.ykly.entity.product.group;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@ApiModel(value = "产品团期入参类")
public class BTProductGroup {
    
    @ApiModelProperty(value = "团期库存表入参VO")
    private List<BTProductGroupOffer> groupOfferList;
    
    @ApiModelProperty(value = "特殊人群报价入参VO")
    private List<BTProductSpecialPrice> specialPriceList;
    
    public List<BTProductGroupOffer> getGroupOfferList() {
        return groupOfferList;
    }
    
    public void setGroupOfferList(List<BTProductGroupOffer> groupOfferList) {
        this.groupOfferList = groupOfferList;
    }
    
    public List<BTProductSpecialPrice> getSpecialPriceList() {
        return specialPriceList;
    }
    
    public void setSpecialPriceList(List<BTProductSpecialPrice> specialPriceList) {
        this.specialPriceList = specialPriceList;
    }
}
