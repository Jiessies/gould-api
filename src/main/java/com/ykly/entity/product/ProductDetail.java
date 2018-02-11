package com.ykly.entity.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by huangmingjie on 2018/2/2.
 */
@Data
@ApiModel(value = "产品详情入参类")
public class ProductDetail implements Serializable {
    
    @ApiModelProperty(hidden = true)
    private int detail_id;//主键
    
    @ApiModelProperty(hidden = true)
    private int product_id;
    
    //产品推荐
    @ApiModelProperty(value = "特色描述")
    @NotBlank(message = "特色描述不能为空")
    private String feature_describe;
    @ApiModelProperty(value = "详情")
    private String recommend_detail = StringUtils.EMPTY;
    @ApiModelProperty(value = "吃")
    private String eat = StringUtils.EMPTY;
    @ApiModelProperty(value = "住")
    private String reside = StringUtils.EMPTY;
    @ApiModelProperty(value = "行")
    private String walk = StringUtils.EMPTY;
    @ApiModelProperty(value = "游")
    private String travel = StringUtils.EMPTY;
    @ApiModelProperty(value = "娱")
    private String recreation = StringUtils.EMPTY;
    @ApiModelProperty(value = "购")
    private String reco_buy = StringUtils.EMPTY;
    @ApiModelProperty(value = "赠送")
    private String present = StringUtils.EMPTY;
    @ApiModelProperty(value = "特别优惠")
    private String special_offer = StringUtils.EMPTY;
    @ApiModelProperty(value = "重要提示")
    private String significance_prompt = StringUtils.EMPTY;
    @ApiModelProperty(value = "交通信息")
    private String traffic_information = StringUtils.EMPTY;
    
    //重要信息
    @ApiModelProperty(value = "发团地点")
    private String start_off_site = StringUtils.EMPTY;
    @ApiModelProperty(value = "组团形式")
    private String cluster_modality = StringUtils.EMPTY;
    @ApiModelProperty(value = "是否拼团")
    private String yes_no_cluster = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    @Size(max = 5, message = "if_headline_one 长度不能超过5个字符!")
    private String if_headline_one = StringUtils.EMPTY;//true or false
    @ApiModelProperty(hidden = true)
    @Size(max = 5, message = "if_headline_two 长度不能超过5个字符!")
    private String if_headline_two = StringUtils.EMPTY;//true or false
    @ApiModelProperty(hidden = true)
    @Size(max = 5, message = "if_headline_three 长度不能超过5个字符!")
    private String if_headline_three = StringUtils.EMPTY;//true or false
    @ApiModelProperty(value = "附加1")
    private String headline_one = StringUtils.EMPTY;
    @ApiModelProperty(value = "附加2")
    private String headline_two = StringUtils.EMPTY;
    @ApiModelProperty(value = "附加3")
    private String headline_three = StringUtils.EMPTY;
    
    //线路行程
    @ApiModelProperty(value = "往返交通-往")
    private int starting_point_traffic_id;
    @ApiModelProperty(value = "往返交通-返")
    private int return_trip_traffic_id;
    @ApiModelProperty(value = "天数-白")
    private int journey_daytime_num;
    @ApiModelProperty(value = "天数-晚")
    private int journey_night_num;
    @ApiModelProperty(value = "线路行程-文字框")
    private String circuit_journey = StringUtils.EMPTY;
    @ApiModelProperty(value = "线路行程-单选框")
    private String reference_journey = StringUtils.EMPTY;//是否参照行程 true是 false否
    //行程类:ProductDT-->ProductTrip-->ProductDTC-->ProductDTI
    
    //费用包含
    //交通类:ProductDetailTraffic
    @ApiModelProperty(value = "包含-交通-旅游巴士")
    private int in_price_bus_path;
    @ApiModelProperty(value = "包含-当地旅游巴士")
    private String in_price_if_bus = StringUtils.EMPTY;
    @ApiModelProperty(value = "包含-小交通输入框")
    private String in_price_airport = StringUtils.EMPTY;
    @ApiModelProperty(value = "包含-小交通下拉框")
    private int in_price_airport_path;
    @ApiModelProperty(value = "包含-签证类型")
    private String in_price_visa_type = StringUtils.EMPTY;
    @ApiModelProperty(value = "包含-签证数")
    private int in_price_visa_num;
    @ApiModelProperty(value = "包含-住宿-类型")
    private String in_price_hotel_type = StringUtils.EMPTY;
    @ApiModelProperty(value = "包含-住宿-级别几星级")
    private int in_price_hotel_star;
    @ApiModelProperty(value = "包含-住宿-几人间")
    private int in_price_hotel_total;
    @ApiModelProperty(value = "包含-住宿-酒店")
    private String in_price_hotel = StringUtils.EMPTY;
    //+ProductDH产品包含-住宿-酒店信息
    @ApiModelProperty(value = "包含-用餐-类型")
    private String in_price_meal_type = StringUtils.EMPTY;
    @ApiModelProperty(value = "包含-用餐-信息")
    private String in_price_meal_info = StringUtils.EMPTY;
    @ApiModelProperty(value = "包含-门票-信息")
    private String in_price_place_info = StringUtils.EMPTY;
    @ApiModelProperty(value = "包含-门票-是否有行程所含门票")
    private String in_price_place_if = StringUtils.EMPTY;//ture or false
    @ApiModelProperty(value = "包含-导游-类型")
    private String in_price_guide_type = StringUtils.EMPTY;
    @ApiModelProperty(value = "包含-导游-信息")
    private String in_price_guide_info = StringUtils.EMPTY;
    @ApiModelProperty(value = "包含-儿童价标准-类型")
    private String in_price_child_type = StringUtils.EMPTY;
    @ApiModelProperty(value = "包含-儿童价标准-身高最小cm")
    private int in_price_child_min;
    @ApiModelProperty(value = "包含-儿童价标准-身高最大cm")
    private int in_price_child_max;
    @ApiModelProperty(value = "包含-儿童价标准-占床类型")
    private int in_price_child_bed;
    @ApiModelProperty(value = "包含-儿童价标准-占床信息")
    private String in_price_child_info;
    @ApiModelProperty(value = "包含-小费")
    private int in_price_tip_num;
    @ApiModelProperty(value = "包含-小费信息")
    private String in_price_tip_info = StringUtils.EMPTY;
    @ApiModelProperty(value = "包含-赠送")
    private String in_price_present = StringUtils.EMPTY;
    @ApiModelProperty(value = "包含-其他")
    private String in_price_other = StringUtils.EMPTY;
    @ApiModelProperty(value = "包含—自定义内容")
    private String in_price_user_defined = StringUtils.EMPTY;
    
    //费用不包含
    @ApiModelProperty(value = "不包含-小交通")
    private String not_in_price_airport_name = StringUtils.EMPTY;
    @ApiModelProperty(value = "不包含-小交通-机场服务类型")
    private int not_in_price_airport_path;
    @ApiModelProperty(value = "不包含-往返机票税")
    @Size(max = 5, message = "not_in_price_if_plane 长度不能超过5个字符!")
    private String not_in_price_if_plane = StringUtils.EMPTY;
    @ApiModelProperty(value = "不包含-境外往返机票税")
    @Size(max = 5, message = "not_in_price_if_out_plane 长度不能超过5个字符!")
    private String not_in_price_if_out_plane = StringUtils.EMPTY;
    @ApiModelProperty(value = "不包含-往返机票税多少钱每人")
    private int not_in_price_airport_num;
    @ApiModelProperty(value = "不包含-境外往返机票税多少钱每人")
    private int not_in_price_out_airport_num;
    @ApiModelProperty(value = "不包含-签证-类型")
    private String not_in_price_visa_type = StringUtils.EMPTY;
    @ApiModelProperty(value = "不包含-签证-签证费")
    private int not_in_price_visa_num;
    @ApiModelProperty(value = "不包含-签证-个人签证")//true or false
    private String not_in_price_if_single_visa = StringUtils.EMPTY;//true or false
    @ApiModelProperty(value = "不包含-签证-团队签证")
    private String not_in_price_if_group_visa = StringUtils.EMPTY;//true or false
    @ApiModelProperty(value = "不包含-签证-港澳通行证置证费")
    private String not_in_price_if_got_visa = StringUtils.EMPTY;//true or false
    @ApiModelProperty(value = "不包含-签证-往来台湾通行证置证费")
    private String not_in_price_if_tai_visa = StringUtils.EMPTY;//true or false
    @ApiModelProperty(value = "不包含-单房差")
    @Size(max = 5, message = "not_in_price_if_room 长度不能超过5个字符!")
    private String not_in_price_if_room = StringUtils.EMPTY;//true or false
    @ApiModelProperty(value = "不包含-单房差说明")
    private String not_in_price_single_room = StringUtils.EMPTY;
    @ApiModelProperty(value = "不包含-门票")
    @Size(max = 5, message = "not_in_price_if_self_place 长度不能超过5个字符!")
    private String not_in_price_if_self_place = StringUtils.EMPTY;//true or false
    @ApiModelProperty(value = "不包含-门票说明")
    private String not_in_price_selt_place = StringUtils.EMPTY;
    @ApiModelProperty(value = "不包含-其他")
    private String not_in_price_other = StringUtils.EMPTY;
    @ApiModelProperty(value = "不包含-补充1")
    @Size(max = 5, message = "not_in_price_supply1 长度不能超过5个字符!")
    private String not_in_price_supply1 = StringUtils.EMPTY;//true or false
    @ApiModelProperty(value = "不包含-补充2")
    @Size(max = 5, message = "not_in_price_supply2 长度不能超过5个字符!")
    private String not_in_price_supply2 = StringUtils.EMPTY;//true or false
    @ApiModelProperty(value = "不包含-补充3")
    @Size(max = 5, message = "not_in_price_supply3 长度不能超过5个字符!")
    private String not_in_price_supply3 = StringUtils.EMPTY;//true or false
    @ApiModelProperty(value = "不包含-补充4")
    @Size(max = 5, message = "not_in_price_supply4 长度不能超过5个字符!")
    private String not_in_price_supply4 = StringUtils.EMPTY;//true or false
    @ApiModelProperty(value = "不包含-旅游意外险")
    @Size(max = 5, message = "not_in_price_if_safe 长度不能超过5个字符!")
    private String not_in_price_if_safe = StringUtils.EMPTY;//true or false
    @ApiModelProperty(value = "不包含—自定义内容")
    private String not_in_price_user_defined = StringUtils.EMPTY;
    
    //特殊人群限制
    @ApiModelProperty(value = "特殊人群限制-单笔订单出游人数少于几人需先询确认")
    private int people_under_num;
    @ApiModelProperty(value = "特殊人群限制-单笔订单出游人数超过几人需先询确认")
    private int people_exceed_num;
    @ApiModelProperty(value = "特殊人群限制-出游人年龄低于几岁含，不接收")
    private int age_under_num;
    @ApiModelProperty(value = "特殊人群限制-出游人年龄超过几岁含，不接收")
    private int age_exceed_num;
    @ApiModelProperty(value = "特殊人群限制-出游人年龄超过几岁含，需要签署健康协议")
    private int age_under_protocal_num;
    @ApiModelProperty(value = "特殊人群限制-最小在可以正常在线预定")
    private int age_min_num;
    @ApiModelProperty(value = "特殊人群限制-最大在可以正常在线预定")
    private int age_max_num;
    @ApiModelProperty(value = "是否接受外籍游客")
    @Size(max = 5, message = "foreign_nationality_tourist 长度不能超过5个字符!")
    private String foreign_nationality_tourist = StringUtils.EMPTY;//true or false
    
    //活动推荐
    @ApiModelProperty(value = "活动推荐说明")
    private String explain_textbox = StringUtils.EMPTY;
    
    //预定须知
    @ApiModelProperty(value = "预定须知-类型")//类型1 ，2
    private String notice_pay_type = StringUtils.EMPTY;
    @ApiModelProperty(value = "预定须知-小时内付款")
    private int notice_pay_hour;
    @ApiModelProperty(value = "预定须知-预订时请告之您的出游人")
    private String notice_if_need = StringUtils.EMPTY;
    @ApiModelProperty(value = "预定须知-不足多少人时")
    private int notice_less_num;
    @ApiModelProperty(value = "预定须知-几个工作日内")
    private int notice_less_days;
    @ApiModelProperty(value = "预定须知-离团类型")
    private String notice_leave_self = StringUtils.EMPTY;
    @ApiModelProperty(value = "预定须知-支付违约金")
    private int notice_leave_self_money;
    @ApiModelProperty(value = "预定须知-销签说明")
    private String notice_note = StringUtils.EMPTY;
    @ApiModelProperty(value = "预定须知-接受持中国大陆或港澳")
    private String notice_gat = StringUtils.EMPTY;
    @ApiModelProperty(value = "预定须知-有效证件问题受阻自行承担")
    private String notice_visa_self = StringUtils.EMPTY;
    @ApiModelProperty(value = "特别约定条款1")
    private String notice_item1 = StringUtils.EMPTY;
    @ApiModelProperty(value = "特别约定条款2")
    private String notice_item2 = StringUtils.EMPTY;
    @ApiModelProperty(value = "特别约定条款3")
    private String notice_item3 = StringUtils.EMPTY;
    @ApiModelProperty(value = "特别约定条款4")//true or false
    private String notice_item4 = StringUtils.EMPTY;
    @ApiModelProperty(value = "特别约定条款5")//true or false
    private String notice_item5 = StringUtils.EMPTY;
    @ApiModelProperty(value = "特别约定条款6")//true or false
    private String notice_item6 = StringUtils.EMPTY;
    @ApiModelProperty(value = "特别约定条款7")//true or false
    private String notice_item7 = StringUtils.EMPTY;
    @ApiModelProperty(value = "特别约定条款8")//true or false
    private String notice_item8 = StringUtils.EMPTY;
    @ApiModelProperty(value = "附加预定须知")
    private String notice_append = StringUtils.EMPTY;
    
    //其他
    @ApiModelProperty(value = "产品注意事项")
    private String announcement = StringUtils.EMPTY;
    @ApiModelProperty(value = "温馨提示")
    private String warm_prompt = StringUtils.EMPTY;
    
    //参与促销活动
    @ApiModelProperty(value = "特卖活动促销")
    private String if_promotion = StringUtils.EMPTY;
    
    //入参暂时不需要的属性
    @ApiModelProperty(hidden = true)
    private String transportation_way = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String sure_plane = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String sure_bus = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String circuit_info_mark = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String join_info_remark = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String default_line = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String if_small = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String journey_annotation = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String depart_info = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String urgency_people_phone = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String inform = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String join_service = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String explain_select = StringUtils.EMPTY;
    @ApiModelProperty(hidden = true)
    private String create_date;
    @ApiModelProperty(hidden = true)
    private String update_date;
}
