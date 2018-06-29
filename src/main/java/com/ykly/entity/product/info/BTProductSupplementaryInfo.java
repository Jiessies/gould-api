package com.ykly.entity.product.info;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@ApiModel(value = "产品主表附属表")
public class BTProductSupplementaryInfo {
    
    @ApiModelProperty(value = "主键", hidden = true)
    private int id;
    @ApiModelProperty(value = "产品id", example = "产品id(int)", hidden = true)
    private int product_id;
    @ApiModelProperty(value = "产品类型", example = "产品类型(int)")
    private int product_type;
    @ApiModelProperty(value = "最低成团人数", example = "最低成团人数(int)")
    private int group_people_num;
    @ApiModelProperty(value = "产品线路大类id", example = "产品线路大类id(int)")
    private int product_ltype_id;
    @ApiModelProperty(value = "产品线路大类名称", example = "产品线路大类名称(String)")
    private String product_ltype_name;
    @ApiModelProperty(value = "产品线路小类id", example = "产品线路小类id(int)")
    private int product_stype_id;
    @ApiModelProperty(value = "产品线路小类名称", example = "产品线路小类名称(String)")
    private String product_stype_name;
    @ApiModelProperty(value = "是否需要商家确认:0否1是", example = "是否需要商家确认:0否1是(int)")
    private int is_supplier_confirm;
    
    public int getProduct_id() {
        return product_id;
    }
    
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    
    public int getProduct_type() {
        return product_type;
    }
    
    public void setProduct_type(int product_type) {
        this.product_type = product_type;
    }
    
    public int getGroup_people_num() {
        return group_people_num;
    }
    
    public void setGroup_people_num(int group_people_num) {
        this.group_people_num = group_people_num;
    }
    
    public int getProduct_ltype_id() {
        return product_ltype_id;
    }
    
    public void setProduct_ltype_id(int product_ltype_id) {
        this.product_ltype_id = product_ltype_id;
    }
    
    public String getProduct_ltype_name() {
        return product_ltype_name;
    }
    
    public void setProduct_ltype_name(String product_ltype_name) {
        this.product_ltype_name = product_ltype_name;
    }
    
    public int getProduct_stype_id() {
        return product_stype_id;
    }
    
    public void setProduct_stype_id(int product_stype_id) {
        this.product_stype_id = product_stype_id;
    }
    
    public String getProduct_stype_name() {
        return product_stype_name;
    }
    
    public void setProduct_stype_name(String product_stype_name) {
        this.product_stype_name = product_stype_name;
    }
    
    public int getIs_supplier_confirm() {
        return is_supplier_confirm;
    }
    
    public void setIs_supplier_confirm(int is_supplier_confirm) {
        this.is_supplier_confirm = is_supplier_confirm;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}
