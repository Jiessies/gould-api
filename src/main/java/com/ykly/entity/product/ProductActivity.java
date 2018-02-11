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
@ApiModel(value = "产品活动信息")
public class ProductActivity implements Serializable {
    
    @ApiModelProperty(hidden = true)
    private int activity_id;//主键
    
    @ApiModelProperty(hidden = true)
    private int product_id;
    
    @ApiModelProperty(value = "活动推荐名称")
    private String activity_name = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "详情")
    private String detail = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "备注")
    private String remark = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "参考价")
    private String price = StringUtils.EMPTY;
}
