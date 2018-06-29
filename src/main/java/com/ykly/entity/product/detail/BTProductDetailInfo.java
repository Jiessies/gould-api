package com.ykly.entity.product.detail;

import com.alibaba.fastjson.JSON;
import com.ykly.entity.product.json.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@ApiModel(value = "产品详情——重要信息,费用包含,费用不包含,特殊人群")
public class BTProductDetailInfo {
    
    @ApiModelProperty(value = "产品id", hidden = true)
    private Integer product_id;
    @ApiModelProperty(value = "产品类型", example = "产品类型(int)")
    private int product_type;
    @ApiModelProperty(value = "重要信息——发团地点", example = "重要信息——发团地点(String)")
    private String import_start_off_site;
    @ApiModelProperty(value = "重要信息——组团形式", example = "重要信息——组团形式(String)")
    private String import_cluster_modality;
    @ApiModelProperty(value = "重要信息——是否拼团", example = "重要信息——是否拼团(String)")
    private String import_yes_no_cluster;
    @ApiModelProperty(value = "重要信息——附加信息json")
    private String import_add_ons;
    @ApiModelProperty(value = "费用包含——交通信息json")
    private String inprice_traffic_info;
    @ApiModelProperty(value = "费用包含——小交通信息json")
    private String inprice_small_traffic_info;
    @ApiModelProperty(value = "费用包含——签证信息json")
    private String inprice_visa_info;
    @ApiModelProperty(value = "费用包含——住宿信息json")
    private String inprice_stay_info;
    @ApiModelProperty(value = "费用包含——用餐信息json")
    private String inprice_meal_info;
    @ApiModelProperty(value = "费用包含——门票信息json")
    private String inprice_ticket_info;
    @ApiModelProperty(value = "费用包含——导游信息json")
    private String inprice_guide_info;
    @ApiModelProperty(value = "费用包含——儿童信息json")
    private String inprice_child_info;
    @ApiModelProperty(value = "费用包含——小费信息json")
    private String inprice_tip_info;
    @ApiModelProperty(value = "费用包含——赠送", example = "费用包含——赠送(String)")
    private String inprice_present_info;
    @ApiModelProperty(value = "费用包含——其他", example = "费用包含——其他(String)")
    private String inprice_other_info;
    @ApiModelProperty(value = "费用包含——自定义", example = "费用包含——自定义(String)")
    private String inprice_userdefine_info;
    @ApiModelProperty(value = "费用不包含——小交通信息json")
    private String not_inprice_small_traffic_info;
    @ApiModelProperty(value = "费用不包含——机票税信息json")
    private String not_inprice_airticket_tax_info;
    @ApiModelProperty(value = "费用不包含——签证信息json")
    private String not_inprice_visa_info;
    @ApiModelProperty(value = "费用不包含——单房差信息json")
    private String not_inprice_singleroom_info;
    @ApiModelProperty(value = "费用不包含——门票信息json")
    private String not_inprice_ticket_info;
    @ApiModelProperty(value = "费用不包含——其他", example = "费用不包含——其他(String)")
    private String not_inprice_other_info;
    @ApiModelProperty(value = "费用不包含——补充信息json")
    private String not_inprice_add_ons_info;
    @ApiModelProperty(value = "费用不包含——保险", example = "费用不包含——保险(String)")
    private String not_inprice_if_safe;
    @ApiModelProperty(value = "费用不包含——自定义", example = "费用不包含——自定义(String)")
    private String not_inprice_userdefine_info;
    @ApiModelProperty(value = "特殊人群限制信息json")
    private String special_people_info;
    
    public Integer getProduct_id() {
        return product_id;
    }
    
    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }
    
    public int getProduct_type() {
        return product_type;
    }
    
    public void setProduct_type(int product_type) {
        this.product_type = product_type;
    }
    
    public String getImport_start_off_site() {
        return import_start_off_site;
    }
    
    public void setImport_start_off_site(String import_start_off_site) {
        this.import_start_off_site = import_start_off_site;
    }
    
    public String getImport_cluster_modality() {
        return import_cluster_modality;
    }
    
    public void setImport_cluster_modality(String import_cluster_modality) {
        this.import_cluster_modality = import_cluster_modality;
    }
    
    public String getImport_yes_no_cluster() {
        return import_yes_no_cluster;
    }
    
    public void setImport_yes_no_cluster(String import_yes_no_cluster) {
        this.import_yes_no_cluster = import_yes_no_cluster;
    }
    
    public String getImport_add_ons() {
        return import_add_ons;
    }
    
    public void setImport_add_ons(ImportAddOnsVo import_add_ons) {
        this.import_add_ons = JSON.toJSONString(import_add_ons);
    }
    
    public String getInprice_traffic_info() {
        return inprice_traffic_info;
    }
    
    public void setInprice_traffic_info(InPriceTrafficInfoVo inprice_traffic_info) {
        this.inprice_traffic_info = JSON.toJSONString(inprice_traffic_info);
    }
    
    public String getInprice_small_traffic_info() {
        return inprice_small_traffic_info;
    }
    
    public void setInprice_small_traffic_info(InPriceSmallTrafficInfoVo inprice_small_traffic_info) {
        this.inprice_small_traffic_info = JSON.toJSONString(inprice_small_traffic_info);
    }
    
    public String getInprice_visa_info() {
        return inprice_visa_info;
    }
    
    public void setInprice_visa_info(InPriceVisaInfoVo inprice_visa_info) {
        this.inprice_visa_info = JSON.toJSONString(inprice_visa_info);
    }
    
    public String getInprice_stay_info() {
        return inprice_stay_info;
    }
    
    public void setInprice_stay_info(InPriceStayInfoVo inprice_stay_info) {
        this.inprice_stay_info = JSON.toJSONString(inprice_stay_info);
    }
    
    public String getInprice_meal_info() {
        return inprice_meal_info;
    }
    
    public void setInprice_meal_info(InPriceMealInfoVo inprice_meal_info) {
        this.inprice_meal_info = JSON.toJSONString(inprice_meal_info);
    }
    
    public void setInprice_meal_info() {
        setInprice_meal_info();
    }
    
    public String getInprice_ticket_info() {
        return inprice_ticket_info;
    }
    
    public void setInprice_ticket_info(InPriceTicketInfoVo inprice_ticket_info) {
        this.inprice_ticket_info = JSON.toJSONString(inprice_ticket_info);
    }
    
    public String getInprice_guide_info() {
        return inprice_guide_info;
    }
    
    public void setInprice_guide_info(InPriceGuideInfoVo inprice_guide_info) {
        this.inprice_guide_info = JSON.toJSONString(inprice_guide_info);
    }
    
    public String getInprice_child_info() {
        return inprice_child_info;
    }
    
    public void setInprice_child_info(InPriceChildInfoVo inprice_child_info) {
        this.inprice_child_info = JSON.toJSONString(inprice_child_info);
    }
    
    public String getInprice_tip_info() {
        return inprice_tip_info;
    }
    
    public void setInprice_tip_info(InPriceTipInfoVo inprice_tip_info) {
        this.inprice_tip_info = JSON.toJSONString(inprice_tip_info);
    }
    
    public String getInprice_present_info() {
        return inprice_present_info;
    }
    
    public void setInprice_present_info(String inprice_present_info) {
        this.inprice_present_info = inprice_present_info;
    }
    
    public String getInprice_other_info() {
        return inprice_other_info;
    }
    
    public void setInprice_other_info(String inprice_other_info) {
        this.inprice_other_info = inprice_other_info;
    }
    
    public String getInprice_userdefine_info() {
        return inprice_userdefine_info;
    }
    
    public void setInprice_userdefine_info(String inprice_userdefine_info) {
        this.inprice_userdefine_info = inprice_userdefine_info;
    }
    
    public String getNot_inprice_small_traffic_info() {
        return not_inprice_small_traffic_info;
    }
    
    public void setNot_inprice_small_traffic_info(InPriceSmallTrafficInfoVo not_inprice_small_traffic_info) {
        this.not_inprice_small_traffic_info = JSON.toJSONString(not_inprice_small_traffic_info);
    }
    
    public String getNot_inprice_airticket_tax_info() {
        return not_inprice_airticket_tax_info;
    }
    
    public void setNot_inprice_airticket_tax_info(NotInPriceAirTicketTaxVo not_inprice_airticket_tax_info) {
        this.not_inprice_airticket_tax_info = JSON.toJSONString(not_inprice_airticket_tax_info);
    }
    
    public String getNot_inprice_visa_info() {
        return not_inprice_visa_info;
    }
    
    public void setNot_inprice_visa_info(NotInPriceVisaVo not_inprice_visa_info) {
        this.not_inprice_visa_info = JSON.toJSONString(not_inprice_visa_info);
    }
    
    public String getNot_inprice_singleroom_info() {
        return not_inprice_singleroom_info;
    }
    
    public void setNot_inprice_singleroom_info(NotInpriceSingleroomVo not_inprice_singleroom_info) {
        this.not_inprice_singleroom_info = JSON.toJSONString(not_inprice_singleroom_info);
    }
    
    public String getNot_inprice_ticket_info() {
        return not_inprice_ticket_info;
    }
    
    public void setNot_inprice_ticket_info(NotInpriceTicketVo not_inprice_ticket_info) {
        this.not_inprice_ticket_info = JSON.toJSONString(not_inprice_ticket_info);
    }
    
    public String getNot_inprice_other_info() {
        return not_inprice_other_info;
    }
    
    public void setNot_inprice_other_info(String not_inprice_other_info) {
        this.not_inprice_other_info = not_inprice_other_info;
    }
    
    public String getNot_inprice_add_ons_info() {
        return not_inprice_add_ons_info;
    }
    
    public void setNot_inprice_add_ons_info(NotInpriceAddOnsVo not_inprice_add_ons_info) {
        this.not_inprice_add_ons_info = JSON.toJSONString(not_inprice_add_ons_info);
    }
    
    public String getNot_inprice_if_safe() {
        return not_inprice_if_safe;
    }
    
    public void setNot_inprice_if_safe(String not_inprice_if_safe) {
        this.not_inprice_if_safe = not_inprice_if_safe;
    }
    
    public String getNot_inprice_userdefine_info() {
        return not_inprice_userdefine_info;
    }
    
    public void setNot_inprice_userdefine_info(String not_inprice_userdefine_info) {
        this.not_inprice_userdefine_info = not_inprice_userdefine_info;
    }
    
    public String getSpecial_people_info() {
        return special_people_info;
    }
    
    public void setSpecial_people_info(SpecialPeopleVo special_people_info) {
        this.special_people_info = JSON.toJSONString(special_people_info);
    }
    
}
