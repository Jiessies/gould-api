package com.ykly.entity.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author
 * Created by huangmingjie on 2018/3/2.
 */
@Data
@ApiModel(value = "目的地城市中间表")
public class ProductPlace {
    
    @ApiModelProperty(value = "产品ID")
    private int p_id;
    
    @ApiModelProperty(value = "目的地ID")
    private int place_id;
}
