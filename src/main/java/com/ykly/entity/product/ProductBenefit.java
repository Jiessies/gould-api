package com.ykly.entity.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by huangmingjie on 2018/2/9.
 */
@Data
@ApiModel(value = "团期-特殊客户优惠")
public class ProductBenefit {
    
    @ApiModelProperty(hidden = true)
    private int benefitid;//主键
    
    @ApiModelProperty(hidden = true)
    private int productid;
    
    @ApiModelProperty(value = "每人优惠多少钱")
    private int benefitnumber;
    
    @ApiModelProperty(value = "类型")
    private String benefitcrowd = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "备注")
    private String benefitnote = StringUtils.EMPTY;
    
    
}
