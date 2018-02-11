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
@ApiModel(value = "团期表信息")
public class ProductGO {
    
    @ApiModelProperty(hidden = true)
    private int group_offer_id;//主键
    
    @ApiModelProperty(hidden = true)
    private int product_id;
    
    @ApiModelProperty(value = "成人对外价")
    private Double adult_out_price;
    
    @ApiModelProperty(value = "儿童对外价")
    private Double child_out_price;
    
    @ApiModelProperty(value = "成人同行价")
    private Double adult_peer_price;
    
    @ApiModelProperty(value = "儿童同行价")
    private Double child_peer_price;
    
    @ApiModelProperty(value = "单房差")
    private Double single_room_dif;
    
    @ApiModelProperty(value = "定金")
    private Double deposit;
    
    @ApiModelProperty(value = "注册允许提前")
    private Double reg_able_start;
    
    @ApiModelProperty(value = "注册允许结束")
    private Double reg_able_end;
    
    @ApiModelProperty(value = "注册允许结束的小时")
    private Double reg_able_end_hour;
    
    @ApiModelProperty(value = "材料截止")
    private Double material_able;
    
    @ApiModelProperty(value = "库存")
    private Double stock;
    
    @ApiModelProperty(value = "库存预警")
    private Double stock_warn;
    
    @ApiModelProperty(value = "折扣")
    private Double discount;
    
    @ApiModelProperty(value = "价格")
    private Double price;
    
    @ApiModelProperty(value = "状态")
    private int status;
    
    @ApiModelProperty(value = "团期")
    private String group_date;
    
    @ApiModelProperty(value = "其他同行价")
    private Double other_peer_price;
    
    @ApiModelProperty(value = "预单房差")
    private Double pre_single_room_dif;
    
    @ApiModelProperty(value = "清位时间之小时")
    private Double clean_time_hour;
    
    @ApiModelProperty(value = "清位时间")
    private Double clean_time;
    
    @ApiModelProperty(value = "首次入库")
    private Double first_stock;
    
    @ApiModelProperty(value = "团号")
    private String group_no = StringUtils.EMPTY;
    
    
    //入参暂时不用的属性
    @ApiModelProperty(hidden = true)
    private String create_time;
    @ApiModelProperty(hidden = true)
    private String update_time;
    @ApiModelProperty(hidden = true)
    @Size(max = 5, message = "ifsure 长度不能超过5个字符!")
    private String ifsure = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    @Size(max = 5, message = "tripid 长度不能超过5个字符!")
    private String tripid = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    @Size(max = 5, message = "ifdeposit 长度不能超过5个字符!")
    private String ifdeposit = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    @Size(max = 5, message = "ifsingle 长度不能超过5个字符!")
    private String ifsingle = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private Double adult_out_onsale_price;
    @ApiModelProperty(hidden = true)
    private Double child_out_onsale_price;
}
