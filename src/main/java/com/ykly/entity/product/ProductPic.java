package com.ykly.entity.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * Created by huangmingjie on 2018/2/2.
 */
@Data
@ApiModel(value = "产品图片信息")
public class ProductPic implements Serializable {
    
    @ApiModelProperty(hidden = true)
    private int pic_id;//主键
    
    @ApiModelProperty(hidden = true)
    private int product_id;
    
    @ApiModelProperty(value = "首选图片")
    @NotBlank(message = "首选图片不能为空")
    private String first_pic;
    
    @ApiModelProperty(value = "图片名字")
    private String pic_name = StringUtils.EMPTY;
    
    //暂时入参不需要的属性
    @ApiModelProperty(hidden = true)
    private String img_length = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String pic_type = StringUtils.EMPTY;
    
}
