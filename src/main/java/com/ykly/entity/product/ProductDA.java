package com.ykly.entity.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by huangmingjie on 2018/2/9.
 */
@Data
@ApiModel(value = "产品特殊人群限制-地域限制")
public class ProductDA {
    
    @ApiModelProperty(hidden = true)
    private int product_id;
    
    @ApiModelProperty(value = "地区类型")
    private int area_type;
    
    @ApiModelProperty(value = "省")
    private int province_id;
    
    @ApiModelProperty(value = "市")
    private int city_id;
}
