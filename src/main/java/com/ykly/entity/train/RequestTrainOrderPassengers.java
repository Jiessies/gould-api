package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

@ApiModel("锁坐游客信息")
public class RequestTrainOrderPassengers {
    
    @ApiModelProperty("乘客姓名")
    @NotBlank(message = "乘客姓名不能为空")
    private String passengersename;
    
    @ApiModelProperty("乘客证件号")
    @NotBlank(message = "乘客证件号不能为空")
    private String passportseno;
    
    @ApiModelProperty("证件类型名称")
    private String passporttypeseidname;
    
    @ApiModelProperty("证件类型 ID不名称对应关系:1:二代身份证，2:一代身份证，C:港澳通行证，G:台湾通 行证，B:护照")
    @NotBlank(message = "证件类型ID不能为空")
    private String passporttypeseid;
    
    @ApiModelProperty("乘客的顺序号 传空字符串")
    private String passengerid;
    
    @ApiModelProperty("票号（此票在本订单中的唯一标识）")
    private String ticketNo;
    
    @ApiModelProperty("票种 ID，票种名称对应关系：1:成人票，2:儿童票，3:学生票，4:残军票")
    @NotBlank(message = "票种ID不能为空")
    private String piaotype;
    
    @ApiModelProperty("票种名称")
    @NotBlank(message = "票种名称不能为空")
    private String piaotypename;
    
    @ApiModelProperty("座位编码。与座位名称对应关系：9:商务座，P:特等座，M:一等座，O:二等座，6:高级软卧，4:软卧，3:硬卧，2:软座，1:硬座注意：当最低的一种座位，无票时，购买选择该座位种类， 买下的就是无座(也就说买无座的席别编码就是该车次的 最低席别的编码)，另外，当最低席别的票卖完了的时候 才可以卖无座的票。")
    @NotBlank(message = "座位编码不能为空")
    private String zwcode;
    
    @ApiModelProperty("座位名称")
    @NotBlank(message = "座位名称不能为空")
    private String zwname;
    //车次与主信息重复
    @ApiModelProperty("车次")
    @NotBlank(message = "车次不能为空")
    private String checi;
    
    @NotNull(message = "票价不能为空")
    @ApiModelProperty("票价")
    private Integer price;
    
    @ApiModelProperty("身份核验状态 0：正常 1：待审核 2：未通过（占座结果回调才有）")
    @NotBlank(message = "身份核验状态不能为空")
    private String reason;
    
    @ApiModelProperty("省份名称：参考附件5.4 的provinces")
    private String provinceName;
    
    @ApiModelProperty("省份编号：参考附件5.4 的provinces")
    private String provinceCode;
    
    @ApiModelProperty("学校代号")
    private String schoolCode;
    
    @ApiModelProperty("学校名称")
    private String schoolName;
    
    @ApiModelProperty("学号")
    private String studentNo;
    
    @ApiModelProperty("学制")
    private String schoolSystem;
    
    @ApiModelProperty("入学年份：yyyy")
    private String enterYear;
    
    @ApiModelProperty("优惠区间起始地名称")
    private String preferenceFromStationName;
    
    @ApiModelProperty("优惠区间起始地代号")
    private String preferenceFromStationCode;
    
    @ApiModelProperty("优惠区间到达地名称")
    private String preferenceToStationName;
    
    @ApiModelProperty("优惠区间到达地代号")
    private String preferenceToStationCode;
    
    public String getPassengersename() {
        return passengersename;
    }
    
    public void setPassengersename(String passengersename) {
        this.passengersename = passengersename;
    }
    
    public String getPassportseno() {
        return passportseno;
    }
    
    public void setPassportseno(String passportseno) {
        this.passportseno = passportseno;
    }
    
    public String getPassporttypeseidname() {
        return passporttypeseidname;
    }
    
    public void setPassporttypeseidname(String passporttypeseidname) {
        this.passporttypeseidname = passporttypeseidname;
    }
    
    public String getPassporttypeseid() {
        return passporttypeseid;
    }
    
    public void setPassporttypeseid(String passporttypeseid) {
        this.passporttypeseid = passporttypeseid;
    }
    
    public String getPassengerid() {
        return passengerid;
    }
    
    public void setPassengerid(String passengerid) {
        this.passengerid = passengerid;
    }
    
    public String getTicketNo() {
        return ticketNo;
    }
    
    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }
    
    public String getPiaotype() {
        return piaotype;
    }
    
    public void setPiaotype(String piaotype) {
        this.piaotype = piaotype;
    }
    
    public String getPiaotypename() {
        return piaotypename;
    }
    
    public void setPiaotypename(String piaotypename) {
        this.piaotypename = piaotypename;
    }
    
    public String getZwcode() {
        return zwcode;
    }
    
    public void setZwcode(String zwcode) {
        this.zwcode = zwcode;
    }
    
    public String getZwname() {
        return zwname;
    }
    
    public void setZwname(String zwname) {
        this.zwname = zwname;
    }
    
    public String getCheci() {
        return checi;
    }
    
    public void setCheci(String checi) {
        this.checi = checi;
    }
    
    public Integer getPrice() {
        return price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }
    
    public String getReason() {
        return reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public String getProvinceName() {
        return provinceName;
    }
    
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    
    public String getProvinceCode() {
        return provinceCode;
    }
    
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
    
    public String getSchoolCode() {
        return schoolCode;
    }
    
    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }
    
    public String getSchoolName() {
        return schoolName;
    }
    
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    
    public String getStudentNo() {
        return studentNo;
    }
    
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }
    
    public String getSchoolSystem() {
        return schoolSystem;
    }
    
    public void setSchoolSystem(String schoolSystem) {
        this.schoolSystem = schoolSystem;
    }
    
    public String getEnterYear() {
        return enterYear;
    }
    
    public void setEnterYear(String enterYear) {
        this.enterYear = enterYear;
    }
    
    public String getPreferenceFromStationName() {
        return preferenceFromStationName;
    }
    
    public void setPreferenceFromStationName(String preferenceFromStationName) {
        this.preferenceFromStationName = preferenceFromStationName;
    }
    
    public String getPreferenceFromStationCode() {
        return preferenceFromStationCode;
    }
    
    public void setPreferenceFromStationCode(String preferenceFromStationCode) {
        this.preferenceFromStationCode = preferenceFromStationCode;
    }
    
    public String getPreferenceToStationName() {
        return preferenceToStationName;
    }
    
    public void setPreferenceToStationName(String preferenceToStationName) {
        this.preferenceToStationName = preferenceToStationName;
    }
    
    public String getPreferenceToStationCode() {
        return preferenceToStationCode;
    }
    
    public void setPreferenceToStationCode(String preferenceToStationCode) {
        this.preferenceToStationCode = preferenceToStationCode;
    }
}