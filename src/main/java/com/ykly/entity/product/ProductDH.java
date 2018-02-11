package com.ykly.entity.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by huangmingjie on 2018/2/9.
 */
@Data
@ApiModel(value = "产品包含酒店信息")
public class ProductDH {
    
    @ApiModelProperty(hidden = true)
    private int product_id;
    
    @ApiModelProperty(value = "包含-酒店名称")
    private String hotel_name = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "包含-几人")
    private int hotel_people;
    
    @ApiModelProperty(value = "包含-几晚")
    private int hotel_days;
    
}
