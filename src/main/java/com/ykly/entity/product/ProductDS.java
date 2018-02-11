package com.ykly.entity.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * Created by huangmingjie on 2018/2/2.
 */
@Data
@ApiModel(value = "产品推荐信息")
public class ProductDS implements Serializable {
    
    @ApiModelProperty(hidden = true)
    private int product_id;
    
    @ApiModelProperty(hidden = true)
    private int shop_id;
    
    @ApiModelProperty(value = "名称")
    private String shop_name = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "营业产品")
    private String main_product = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "说明")
    private String shop_info = StringUtils.EMPTY;
    
}
