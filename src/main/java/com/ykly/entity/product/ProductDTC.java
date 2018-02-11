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
@ApiModel(value = "产品行程详情段信息")
public class ProductDTC implements Serializable {
    
    @ApiModelProperty(hidden = true)
    private int chip_id;//主键
    
    @ApiModelProperty(hidden = true)
    private int trip_id;
    
    @ApiModelProperty(value = "行程内容")
    private String trip_info = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "小标题")
    private String trip_title = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "小标题正文")
    private String trip_content = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "行程时间")
    private String trip_time = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "行程里第几个行程段")
    private int chip_order;
    
    @ApiModelProperty(value = "行程段图片信息")
    private ProductDTI productDTI;
}
