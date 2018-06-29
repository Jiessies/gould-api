package com.ykly.entity.product.info;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@ApiModel(value = "产品主表")
public class BTProductMainInfo {
    
    @ApiModelProperty(value = "主键id", hidden = true)
    private int id;
    @ApiModelProperty(value = "产品id", example = "产品id(int)", hidden = true)
    private int product_id;
    
    @ApiModelProperty(value = "产品类型 1跟团 2商务 3体检 4自助 5邮轮 6签证 11短途游", example = "产品类型 1跟团 2商务 3体检 4自助 5邮轮 6签证 11短途游(int)")
    @NotNull(message = "产品类型不能为空")
    private int product_type;
    
    @ApiModelProperty(value = "供应商产品编号", example = "供应商产品编号(String)")
    private String supplier_num;
    
    @NotBlank(message = "供应商产品名称不能为空")
    @ApiModelProperty(value = "供应商产品名称", example = "供应商产品名称(String)")
    private String supplier_product_name;
    
    @ApiModelProperty(value = "供应商名称", example = "供应商名称(String)")
    private String supplier_name;
    
    @NotBlank(message = "节日名称不能为空")
    @ApiModelProperty(value = "节日名称", example = "节日名称(String)")
    private String yk_festival_name;
    
    @NotBlank(message = "产品名称前缀不能为空")
    @ApiModelProperty(value = "产品名称前缀", example = "产品名称前缀(String)")
    private String product_name_fir;
    
    @NotBlank(message = "产品名称后缀不能为空")
    @ApiModelProperty(value = "产品名称后缀", example = "产品名称后缀(String)")
    private String product_name_last;
    
    @NotBlank(message = "产品主题id不能为空")
    @ApiModelProperty(value = "产品主题id", example = "产品主题id(String)")
    private String yk_theme_id;
    
    @NotBlank(message = "产品主题名称不能为空")
    @ApiModelProperty(value = "产品主题名称", example = "产品主题名称(String)")
    private String yk_theme_name;
    
    @ApiModelProperty(value = "保险0 国内1 国外2", example = "保险0 国内1 国外2(int)")
    private int home_abroad;
    
    @NotBlank(message = "产品出发城市不能为空")
    @ApiModelProperty(value = "产品出发城市", example = "产品出发城市(String)")
    private String start_city_name;
    
    @NotBlank(message = "产品目的地城市id不能为空")
    @ApiModelProperty(value = "产品目的地城市id", example = "产品目的地城市id(String)")
    private String destination_city_id;
    
    @NotBlank(message = "产品目的地城市不能为空")
    @ApiModelProperty(value = "产品目的地城市", example = "产品目的地城市(String)")
    private String destination;
    
    @NotBlank(message = "成团地点不能为空")
    @ApiModelProperty(value = "成团地点", example = "成团地点(String)")
    private String group_position;
    
    @ApiModelProperty(value = "客户预定城市id", example = "客户预定城市id(String)")
    private String client_city_id;
    @ApiModelProperty(value = "代理商预定城市id", example = "代理商预定城市id(String)")
    private String agency_city_id;
    @ApiModelProperty(value = "指定代理商的登录名", example = "指定代理商的登录名(String)")
    private String agency_id;
    @ApiModelProperty(value = "产品创建用户id", example = "产品创建用户id(int)")
    private int create_user_id;
    @ApiModelProperty(value = "产品所属供应商id", example = "产品所属供应商id(int)")
    private int vendor_id;
    
    @NotNull(message = "产品经理id不能为空")
    @ApiModelProperty(value = "产品经理id", example = "产品经理id(int)")
    private int yk_director_id;
    
    @NotBlank(message = "产品负责人不能为空")
    @ApiModelProperty(value = "产品负责人", example = "产品负责人(String)")
    private String principal;
    
    @ApiModelProperty(value = "特色", example = "特色(String)")
    private String feature;
    @ApiModelProperty(value = "产品图片", example = "产品图片(String)")
    private String product_pic;
    @ApiModelProperty(value = "供应商公司id", example = "供应商公司id(int)")
    private int vendor_company_id;
    @ApiModelProperty(value = "成团地点id", example = "成团地点id(String)")
    private String group_position_id;
    @ApiModelProperty(value = "出发城市id", example = "出发城市id(String)")
    private String start_city_id;
    
    @NotNull(message = "系统级别产品来源类型不能为空")
    @ApiModelProperty(value = "系统级别产品来源类型", example = "系统级别产品来源类型 0 默认, 1 BOM(int)")
    private int sys_product_type;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
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
    
    public String getSupplier_num() {
        return supplier_num;
    }
    
    public void setSupplier_num(String supplier_num) {
        this.supplier_num = supplier_num;
    }
    
    public String getSupplier_product_name() {
        return supplier_product_name;
    }
    
    public void setSupplier_product_name(String supplier_product_name) {
        this.supplier_product_name = supplier_product_name;
    }
    
    public String getSupplier_name() {
        return supplier_name;
    }
    
    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }
    
    public String getYk_festival_name() {
        return yk_festival_name;
    }
    
    public void setYk_festival_name(String yk_festival_name) {
        this.yk_festival_name = yk_festival_name;
    }
    
    public String getProduct_name_fir() {
        return product_name_fir;
    }
    
    public void setProduct_name_fir(String product_name_fir) {
        this.product_name_fir = product_name_fir;
    }
    
    public String getProduct_name_last() {
        return product_name_last;
    }
    
    public void setProduct_name_last(String product_name_last) {
        this.product_name_last = product_name_last;
    }
    
    public String getYk_theme_id() {
        return yk_theme_id;
    }
    
    public void setYk_theme_id(String yk_theme_id) {
        this.yk_theme_id = yk_theme_id;
    }
    
    public String getYk_theme_name() {
        return yk_theme_name;
    }
    
    public void setYk_theme_name(String yk_theme_name) {
        this.yk_theme_name = yk_theme_name;
    }
    
    public int getHome_abroad() {
        return home_abroad;
    }
    
    public void setHome_abroad(int home_abroad) {
        this.home_abroad = home_abroad;
    }
    
    public String getStart_city_name() {
        return start_city_name;
    }
    
    public void setStart_city_name(String start_city_name) {
        this.start_city_name = start_city_name;
    }
    
    public String getDestination_city_id() {
        return destination_city_id;
    }
    
    public void setDestination_city_id(String destination_city_id) {
        this.destination_city_id = destination_city_id;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public String getGroup_position() {
        return group_position;
    }
    
    public void setGroup_position(String group_position) {
        this.group_position = group_position;
    }
    
    public String getClient_city_id() {
        return client_city_id;
    }
    
    public void setClient_city_id(String client_city_id) {
        this.client_city_id = client_city_id;
    }
    
    public String getAgency_city_id() {
        return agency_city_id;
    }
    
    public void setAgency_city_id(String agency_city_id) {
        this.agency_city_id = agency_city_id;
    }
    
    public String getAgency_id() {
        return agency_id;
    }
    
    public void setAgency_id(String agency_id) {
        this.agency_id = agency_id;
    }
    
    public int getCreate_user_id() {
        return create_user_id;
    }
    
    public void setCreate_user_id(int create_user_id) {
        this.create_user_id = create_user_id;
    }
    
    public int getVendor_id() {
        return vendor_id;
    }
    
    public void setVendor_id(int vendor_id) {
        this.vendor_id = vendor_id;
    }
    
    public int getYk_director_id() {
        return yk_director_id;
    }
    
    public void setYk_director_id(int yk_director_id) {
        this.yk_director_id = yk_director_id;
    }
    
    public String getPrincipal() {
        return principal;
    }
    
    public void setPrincipal(String principal) {
        this.principal = principal;
    }
    
    public String getFeature() {
        return feature;
    }
    
    public void setFeature(String feature) {
        this.feature = feature;
    }
    
    public String getProduct_pic() {
        return product_pic;
    }
    
    public void setProduct_pic(String product_pic) {
        this.product_pic = product_pic;
    }
    
    public int getVendor_company_id() {
        return vendor_company_id;
    }
    
    public void setVendor_company_id(int vendor_company_id) {
        this.vendor_company_id = vendor_company_id;
    }
    
    public String getGroup_position_id() {
        return group_position_id;
    }
    
    public void setGroup_position_id(String group_position_id) {
        this.group_position_id = group_position_id;
    }
    
    public String getStart_city_id() {
        return start_city_id;
    }
    
    public void setStart_city_id(String start_city_id) {
        this.start_city_id = start_city_id;
    }
    
    public int getSys_product_type() {
        return sys_product_type;
    }
    
    public void setSys_product_type(int sys_product_type) {
        this.sys_product_type = sys_product_type;
    }
}
