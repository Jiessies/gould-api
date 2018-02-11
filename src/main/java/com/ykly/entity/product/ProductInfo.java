package com.ykly.entity.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by huangmingjie on 2018/2/2.
 */
@Data
@ApiModel(value = "产品基本信息")
public class ProductInfo implements Serializable {
    
    @ApiModelProperty(hidden = true)
    private int product_id;//主键
    
    @ApiModelProperty(value = "产品大类ID")
    private int big_category_id;
    
    @ApiModelProperty(value = "供应商产品编号")
    private String supplier_num = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "供应商产品名称")
    @NotBlank(message = "供应商产品名称不能为空")
    private String supplier_name;
    
    @ApiModelProperty(value = "盈科产品节日id")
    private int yk_festival_id;
    
    @ApiModelProperty(value = "盈科产品名称第一个框")
    @NotBlank(message = "盈科产品名称不能为空")
    private String yk_name_fir;
    
    @ApiModelProperty(value = "盈科产品名称第二个框")
    private String yk_name_last = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "盈科产品主题")
    @NotBlank(message = "盈科产品主题不能为空")
    private String yk_theme_id;
    
    @ApiModelProperty(value = "自定义主题")
    private String custom_theme = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "供应商产品类型(第一个框)")
    @NotNull(message = "供应商产品类型不能为空")
    private int supplier_type_id;
    
    @ApiModelProperty(value = "应商产品类型(第二个框)")
    private int type_subset_id;
    
    @ApiModelProperty(value = "最低成团人数")
    @NotNull(message = "最低成团人数不能为空")
    private int group_people_num;
    
    @ApiModelProperty(value = "出发城市")
    @NotBlank(message = "出发城市不能为空")
    private String supplier_start_city;
    
    @ApiModelProperty(value = "成团地点")
    @NotNull(message = "成团地点不能为空")
    private int clustering_site_id;
    
    @ApiModelProperty(value = "目的地城市")
    @NotBlank(message = "目的地城市不能为空")
    private String supplier_destination;
    
    @ApiModelProperty(value = "指定代理商")
    private String agency_id = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "客户预定城市")
    private String client_city_id = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "代理商预定城市")
    private String agency_city_id = StringUtils.EMPTY;
    
    @ApiModelProperty(value = "产品负责人")
    @NotBlank(message = "产品负责人不能为空")
    private String principal;
    
    @ApiModelProperty(value = "盈科产品经理")
    @NotBlank(message = "盈科产品经理不能为空")
    private String yk_director_id;
    
    @ApiModelProperty(value = "盈科产品经理")
    private String feature = StringUtils.EMPTY;
    
    
    //暂时入参不需要的属性
    @ApiModelProperty(hidden = true)
    private String online_status = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String submit_status = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String activty_sales = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private int little_category_id;
    @ApiModelProperty(hidden = true)
    private String update_date;
    @ApiModelProperty(hidden = true)
    private String create_date;
    @ApiModelProperty(hidden = true)
    private String clouds_location_type = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String vendor_id = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String back_reason = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String yk_num = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String info_word = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private int model_id;
    @ApiModelProperty(hidden = true)
    private String start_site = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String start_site_time = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private int templet_id;
    @ApiModelProperty(hidden = true)
    private int auto_audit_status;
    @ApiModelProperty(hidden = true)
    private int operation_status;
    @ApiModelProperty(hidden = true)
    private long register_deadline;
    @ApiModelProperty(hidden = true)
    private String create_login_name = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private long give_time;
}
