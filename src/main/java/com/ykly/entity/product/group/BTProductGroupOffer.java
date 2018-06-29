package com.ykly.entity.product.group;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@ApiModel(value = "团期库存表")
public class BTProductGroupOffer {
    @ApiModelProperty(value = "团期id", example = "团期id(int)")
    private Integer id;
    @ApiModelProperty(value = "产品id", example = "产品id(int)")
    private int product_id;
    @ApiModelProperty(value = "行程id", example = "行程id(int)")
    private int tripid;
    @ApiModelProperty(value = "团期年", example = "团期年(String)")
    private String year;
    @ApiModelProperty(value = "团期月", example = "团期月(String)")
    private String month;
    @ApiModelProperty(value = "团期日", example = "团期日(String)")
    private String day;
    @ApiModelProperty(value = "团期long", example = "团期long(Long)")
    private Long groupdate;
    @ApiModelProperty(value = "成人对外int分", example = "成人对外int分(int)")
    private int adult_out_price;
    @ApiModelProperty(value = "成人同行", example = "成人同行(int)")
    private int adult_peer_price;
    @ApiModelProperty(value = "儿童对外", example = "儿童对外(int)")
    private int child_out_price;
    @ApiModelProperty(value = "儿童同行", example = "儿童同行(int)")
    private int child_peer_price;
    @ApiModelProperty(value = "单房差", example = "单房差(int)")
    private int single_room_dif;
    @ApiModelProperty(value = "定金", example = "定金(int)")
    private int deposit;
    @ApiModelProperty(value = "报名开始前提前多久，存分钟", example = "报名开始前提前多久，存分钟(int)")
    private int reg_able_start;
    @ApiModelProperty(value = "材料截止前多久，截止分钟", example = "材料截止前多久，截止分钟(int)")
    private int material_able;
    @ApiModelProperty(value = "材料截至提交日期", example = "材料截至提交日期(Long)")
    private Long material_end;
    @ApiModelProperty(value = "产品类型", example = "产品类型(String)")
    private String product_type;
    @ApiModelProperty(value = "0为默认，1为已删除", example = "0为默认，1为已删除(int)")
    private int is_delete;
    @ApiModelProperty(value = "是否共享库存,0为默认,2为不需要 1为需要", example = "是否共享库存,0为默认,2为不需要 1为需要(int)")
    private int is_share;
    @ApiModelProperty(value = "是否有其他的价格类型，0为默认1为有其他", example = "是否有其他的价格类型，0为默认1为有其他(int)")
    private int is_other_price;
    @ApiModelProperty(value = "是否需要商家确认，0为默认,2为不需要 1为需要", example = "是否需要商家确认，0为默认,2为不需要 1为需要(int)")
    private int is_sure;
    @ApiModelProperty(value = "共享库存id", example = "共享库存id(int)")
    private int share_stockid;
    @ApiModelProperty(value = "创建时间long", example = "创建时间long(Long)")
    private Long createtime;
    @ApiModelProperty(value = "最后更新时间long", example = "最后更新时间long(Long)")
    private Long updatetime;
    @ApiModelProperty(value = "团期开始可定时间", example = "团期开始可定时间(Long)")
    private Long groupdate_start;
    @ApiModelProperty(value = "团期截止可定时间", example = "团期截止可定时间(Long)")
    private Long groupdate_end;
    @ApiModelProperty(value = "计算得出的清位时间", example = "计算得出的清位时间(Long)")
    private Long clean_time;
    @ApiModelProperty(value = "库存", example = "库存(int)")
    private int stock;
    @ApiModelProperty(value = "预警", example = "预警(int)")
    private int warn;
    @ApiModelProperty(value = "占位数", example = "占位数(int)")
    private int seat;
    @ApiModelProperty(value = "余位数", example = "余位数(int)")
    private int remain;
    @ApiModelProperty(value = "签约数", example = "签约数(int)")
    private int signed;
    @ApiModelProperty(value = "是否定金", example = "是否定金(int)")
    private int is_deposit;
    @ApiModelProperty(value = "是否单房差,0为默认,2为不需要 1为需要", example = "是否单房差,0为默认,2为不需要 1为需要(int)")
    private int is_single;
    @ApiModelProperty(value = "报名截止提前天数，存分钟", example = "报名截止提前天数，存分钟(int)")
    private int reg_able_end_day;
    @ApiModelProperty(value = "报名截止提前小时数，存分钟", example = "报名截止提前小时数，存分钟(int)")
    private int reg_able_end_hour;
    @ApiModelProperty(value = "清位时间天数，存分钟", example = "清位时间天数，存分钟(int)")
    private int clean_time_day;
    @ApiModelProperty(value = "清位时间小时数，存分钟", example = "清位时间小时数，存分钟(int)")
    private int clean_time_hour;
    @ApiModelProperty(value = "门票价格类型id", example = "门票价格类型id(Long)")
    private Long scenic_Price_Id;
    @ApiModelProperty(value = "提前预订天数(非快捷景区门票)", example = "提前预订天数(非快捷景区门票)(int)")
    private int reg_able_start_day;
    @ApiModelProperty(value = "团号", example = "团号(String)")
    private String tuan_no;
    
    public int getProduct_id() {
        return product_id;
    }
    
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    
    public int getTripid() {
        return tripid;
    }
    
    public void setTripid(int tripid) {
        this.tripid = tripid;
    }
    
    public String getYear() {
        return year;
    }
    
    public void setYear(String year) {
        this.year = year;
    }
    
    public String getMonth() {
        return month;
    }
    
    public void setMonth(String month) {
        this.month = month;
    }
    
    public String getDay() {
        return day;
    }
    
    public void setDay(String day) {
        this.day = day;
    }
    
    public Long getGroupdate() {
        return groupdate;
    }
    
    public void setGroupdate(Long groupdate) {
        this.groupdate = groupdate;
    }
    
    public int getAdult_out_price() {
        return adult_out_price;
    }
    
    public void setAdult_out_price(int adult_out_price) {
        this.adult_out_price = adult_out_price;
    }
    
    public int getAdult_peer_price() {
        return adult_peer_price;
    }
    
    public void setAdult_peer_price(int adult_peer_price) {
        this.adult_peer_price = adult_peer_price;
    }
    
    public int getChild_out_price() {
        return child_out_price;
    }
    
    public void setChild_out_price(int child_out_price) {
        this.child_out_price = child_out_price;
    }
    
    public int getChild_peer_price() {
        return child_peer_price;
    }
    
    public void setChild_peer_price(int child_peer_price) {
        this.child_peer_price = child_peer_price;
    }
    
    public int getSingle_room_dif() {
        return single_room_dif;
    }
    
    public void setSingle_room_dif(int single_room_dif) {
        this.single_room_dif = single_room_dif;
    }
    
    public int getDeposit() {
        return deposit;
    }
    
    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
    
    public int getReg_able_start() {
        return reg_able_start;
    }
    
    public void setReg_able_start(int reg_able_start) {
        this.reg_able_start = reg_able_start;
    }
    
    public int getMaterial_able() {
        return material_able;
    }
    
    public void setMaterial_able(int material_able) {
        this.material_able = material_able;
    }
    
    public Long getMaterial_end() {
        return material_end;
    }
    
    public void setMaterial_end(Long material_end) {
        this.material_end = material_end;
    }
    
    public String getProduct_type() {
        return product_type;
    }
    
    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }
    
    public int getIs_delete() {
        return is_delete;
    }
    
    public void setIs_delete(int is_delete) {
        this.is_delete = is_delete;
    }
    
    public int getIs_share() {
        return is_share;
    }
    
    public void setIs_share(int is_share) {
        this.is_share = is_share;
    }
    
    public int getIs_other_price() {
        return is_other_price;
    }
    
    public void setIs_other_price(int is_other_price) {
        this.is_other_price = is_other_price;
    }
    
    public int getIs_sure() {
        return is_sure;
    }
    
    public void setIs_sure(int is_sure) {
        this.is_sure = is_sure;
    }
    
    public int getShare_stockid() {
        return share_stockid;
    }
    
    public void setShare_stockid(int share_stockid) {
        this.share_stockid = share_stockid;
    }
    
    public Long getCreatetime() {
        return createtime;
    }
    
    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }
    
    public Long getUpdatetime() {
        return updatetime;
    }
    
    public void setUpdatetime(Long updatetime) {
        this.updatetime = updatetime;
    }
    
    public Long getGroupdate_start() {
        return groupdate_start;
    }
    
    public void setGroupdate_start(Long groupdate_start) {
        this.groupdate_start = groupdate_start;
    }
    
    public Long getGroupdate_end() {
        return groupdate_end;
    }
    
    public void setGroupdate_end(Long groupdate_end) {
        this.groupdate_end = groupdate_end;
    }
    
    public Long getClean_time() {
        return clean_time;
    }
    
    public void setClean_time(Long clean_time) {
        this.clean_time = clean_time;
    }
    
    public int getStock() {
        return stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public int getWarn() {
        return warn;
    }
    
    public void setWarn(int warn) {
        this.warn = warn;
    }
    
    public int getSeat() {
        return seat;
    }
    
    public void setSeat(int seat) {
        this.seat = seat;
    }
    
    public int getRemain() {
        return remain;
    }
    
    public void setRemain(int remain) {
        this.remain = remain;
    }
    
    public int getSigned() {
        return signed;
    }
    
    public void setSigned(int signed) {
        this.signed = signed;
    }
    
    public int getIs_deposit() {
        return is_deposit;
    }
    
    public void setIs_deposit(int is_deposit) {
        this.is_deposit = is_deposit;
    }
    
    public int getIs_single() {
        return is_single;
    }
    
    public void setIs_single(int is_single) {
        this.is_single = is_single;
    }
    
    public int getReg_able_end_day() {
        return reg_able_end_day;
    }
    
    public void setReg_able_end_day(int reg_able_end_day) {
        this.reg_able_end_day = reg_able_end_day;
    }
    
    public int getReg_able_end_hour() {
        return reg_able_end_hour;
    }
    
    public void setReg_able_end_hour(int reg_able_end_hour) {
        this.reg_able_end_hour = reg_able_end_hour;
    }
    
    public int getClean_time_day() {
        return clean_time_day;
    }
    
    public void setClean_time_day(int clean_time_day) {
        this.clean_time_day = clean_time_day;
    }
    
    public int getClean_time_hour() {
        return clean_time_hour;
    }
    
    public void setClean_time_hour(int clean_time_hour) {
        this.clean_time_hour = clean_time_hour;
    }
    
    public Long getScenic_Price_Id() {
        return scenic_Price_Id;
    }
    
    public void setScenic_Price_Id(Long scenic_Price_Id) {
        this.scenic_Price_Id = scenic_Price_Id;
    }
    
    public int getReg_able_start_day() {
        return reg_able_start_day;
    }
    
    public void setReg_able_start_day(int reg_able_start_day) {
        this.reg_able_start_day = reg_able_start_day;
    }
    
    public String getTuan_no() {
        return tuan_no;
    }
    
    public void setTuan_no(String tuan_no) {
        this.tuan_no = tuan_no;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
