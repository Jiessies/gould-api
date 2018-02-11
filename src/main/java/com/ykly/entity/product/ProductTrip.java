package com.ykly.entity.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.List;

/**
 * Created by huangmingjie on 2018/2/2.
 */
@Data
@ApiModel(value = "产品行程信息")
public class ProductTrip implements Serializable {
    
    @ApiModelProperty(hidden = true)
    private int trip_id;//主键
    
    @ApiModelProperty(hidden = true)
    private int product_id;
    
    @ApiModelProperty(value = "每一天标题")
    private String trip_title = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "早餐")
    private String breakfast = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "午餐")
    private String lunch = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "晚餐")
    private String dinner = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "住宿")
    private String trip_stay = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "创建时间")
    private String create_date;
    
    @ApiModelProperty(value = "更新时间")
    private String update_date;
    
    @ApiModelProperty(value = "第几天")
    private int trip_days;
    
    @ApiModelProperty(value = "描述")
    private String trip_describe = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "产品行程段信息")
    private List<ProductDTC> productDTCList;
}
