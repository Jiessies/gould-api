package com.ykly.entity.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by huangmingjie on 2018/2/6.
 */
@Data
@ApiModel(value = "产品交通")
public class ProductDetailTraffic {
    
    @ApiModelProperty(hidden = true)
    private int product_id;
    
    @ApiModelProperty(value = "交通类型（飞机，火车")
    private int traffic_type;
    
    @ApiModelProperty(value = "税")
    private String tax_type = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "硬卧，软卧")
    private String site_type = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "去程，返程")
    private String traffic_path = StringUtils.EMPTY;
}
