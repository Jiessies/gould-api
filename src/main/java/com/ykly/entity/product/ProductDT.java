package com.ykly.entity.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * Created by huangmingjie on 2018/2/2.
 */
@Data
@ApiModel(value = "产品行程详情信息")
public class ProductDT implements Serializable {
    
    @ApiModelProperty(hidden = true)
    private int product_id;
    
    @ApiModelProperty(value = "行程编号")
    private String trip_code = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "供应商编号")
    private String supply_code = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "行程特色")
    private String trip_feature = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "白天数")
    private int trip_days;
    
    @ApiModelProperty(value = "晚上数")
    private int trip_nights;
    
    @ApiModelProperty(value = "是否默认行程，默认0，否1")
    @Size(max = 5, message = "if_default 长度不能超过5个字符!")
    private String if_default = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "行程附件（仅支持pdf文档）")
    private String file_path = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "产品行程信息")
    @NotEmpty(message = "产品行程信息不能为空")
    @Valid
    private List<ProductTrip> productTripList;
    
    
    //入参暂时不需要的属性
    @ApiModelProperty(hidden = true)
    private String material = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String detail_info = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String img_path = StringUtils.EMPTY;
}
