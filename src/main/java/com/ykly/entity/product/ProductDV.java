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
@ApiModel(value = "签证产品详情-其他")
public class ProductDV implements Serializable {
    
    @ApiModelProperty(hidden = true)
    private int product_id;
    
    @ApiModelProperty(value = "证件类型")
    private String identity_type = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "是否上传电子版材料,是1否2")
    private String if_el = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "材料")
    private String material = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "信息详情")
    private String detail_info = StringUtils.EMPTY;
    
}
