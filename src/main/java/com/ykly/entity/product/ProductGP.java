package com.ykly.entity.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import javax.validation.constraints.Size;

/**
 * Created by huangmingjie on 2018/2/5.
 */
@Data
@ApiModel(value = "特殊人群团期信息")
public class ProductGP {
    
    @ApiModelProperty(hidden = true)
    private int priceid;//主键
    
    @ApiModelProperty(hidden = true)
    private int productid;
    
    @ApiModelProperty(hidden = true)
    private int groupid;
    
    @ApiModelProperty(value = "报价类型")
    private String pricename = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "对内价格")
    private Double price;
    
    @ApiModelProperty(value = "对外价格")
    private Double outprice;
    
    @ApiModelProperty(value = "行程Code码")
    @Size(max = 5, message = "tripcode 长度不能超过5个字符!")
    private String tripcode;
}
