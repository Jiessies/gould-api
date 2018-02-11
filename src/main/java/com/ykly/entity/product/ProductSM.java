package com.ykly.entity.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by huangmingjie on 2018/2/5.
 */
@Data
@ApiModel(value = "库存表信息")
public class ProductSM {
    
    @ApiModelProperty(hidden = true)
    private int storeid;//主键
    
    @ApiModelProperty(hidden = true)
    private int productid;
    
    @ApiModelProperty(value = "成团日期")
    private String groupdate;
    
    @ApiModelProperty(value = "库存")
    private int instore;
    
    @ApiModelProperty(value = "站位数")
    private int seat;
    
    @ApiModelProperty(value = "签约数")
    private int signed;
    
    @ApiModelProperty(value = "预警值")
    private int warn;
    
    
    //暂时入参不需要的属性
    @ApiModelProperty(hidden = true)
    private int shareid;
}
