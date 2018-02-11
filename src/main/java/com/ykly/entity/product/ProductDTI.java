package com.ykly.entity.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by huangmingjie on 2018/2/7.
 */
@Data
@ApiModel(value = "行程段图片资源库信息")
public class ProductDTI {
    
    @ApiModelProperty(hidden = true)
    private int img_id;//主键
    
    @ApiModelProperty(hidden = true)
    private int chip_id;
    
    @ApiModelProperty(value = "资源库图片的名称")
    private String place_name = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "资源库地址code码")
    private String last_id = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "图片路径")
    private String img_url = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "图片标题")
    private String img_name = StringUtils.EMPTY;
}
