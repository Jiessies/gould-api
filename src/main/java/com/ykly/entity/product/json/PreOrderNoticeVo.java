package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApiModel("预定须知")
public class PreOrderNoticeVo implements ProductMontageDetail {
    
    @ApiModelProperty(value = "为了确保您能够按时出行", example = "预定须知-预定须知(String)")
    private String noticePayType = "0";
    @ApiModelProperty(value = "为了确保您能够按时出行,产品确认后请在X小时内付款", example = "预定须知-为了确保您能够按时出行,产品确认后请在X小时内付款(String)")
    private String noticePayHour = "";
    @ApiModelProperty(value = "预订时请告之您的出游人数、出发日期、住宿、用餐标准、以及您的特殊需求", example = "预定须知-预订时请告之您的出游人数、出发日期、住宿、用餐标准、以及您的特殊需求(String)")
    private String noticeIfNeedIsSelect = "";
    @ApiModelProperty(value = "此团收客人数不足X人时,是否勾选 0否1是", example = "预定须知-此团收客人数不足X人时,是否勾选 0否1是(String)")
    private String importCheckIsSelect = "0";
    @ApiModelProperty(value = "此团收客人数不足X人", example = "预定须知-此团收客人数不足X人(String)")
    private String noticeLessNum = "";
    @ApiModelProperty(value = "本公司会于出发前X个工作日通知取消该行程", example = "预定须知-本公司会于出发前X个工作日通知取消该行程(String)")
    private String noticeLessDays = "";
    @ApiModelProperty(value = "团队游览中不允许擅自离团", example = "预定须知-团队游览中不允许擅自离团(String)")
    private String noticeLeaveSelfType = "";
    @ApiModelProperty(value = "需要支付违约金X元", example = "预定须知-需要支付违约金X元(String)")
    private String noticeLeaveSelfMoney = "";
    @ApiModelProperty(value = "销签说明,是否勾选 0否1是", example = "预定须知-销签说明,是否勾选 0否1是(String)")
    private String noticeNoteIsSelect = "0";
    @ApiModelProperty(value = "本团队产品只接受持各地签发的XX客人", example = "预定须知-本团队产品只接受持各地签发的XX客人(String)")
    private String noticeGat = "0";
    @ApiModelProperty(value = "如果您已自备签证，请务必提供有效护照及签证复印件 是否勾选 0否1是", example = "预定须知-如果您已自备签证，请务必提供有效护照及签证复印件 是否勾选 0否1是(String)")
    private String noticeVisaSelfIsSelect = "";
    @ApiModelProperty(value = "因甲方原因发生拒签、延时交签造成本次出境行程变更或取消的，乙方不承担违约责任，甲方需承担申办 签证费用X元 ,是否勾选 0否1是", example = "预定须知-因甲方原因发生拒签、延时交签造成本次出境行程变更或取消的，乙方不承担违约责任，甲方需承担申办 签证费用X元 ,是否勾选 0否1是(String)")
    private String noticeItem1IsSelect = "0";
    @ApiModelProperty(value = "因甲方原因发生拒签、延时交签造成本次出境行程变更或取消的，乙方不承担违约责任，甲方需承担申办 签证费用X元", example = "预定须知-因甲方原因发生拒签、延时交签造成本次出境行程变更或取消的，乙方不承担违约责任，甲方需承担申办 签证费用X元(String)")
    private String noticeItem1 = "";
    @ApiModelProperty(value = "本团机位订金X元,是否勾选 0否1是", example = "预定须知-本团机位订金X元,是否勾选 0否1是(String)")
    private String noticeItem2IsSelect = "0";
    @ApiModelProperty(value = "本团机位订金X元", example = "预定须知-本团机位订金X元(String)")
    private String noticeItem2 = "";
    @ApiModelProperty(value = "因甲方原因 送签后或者出签后 造成本次行程变更或取消行程的，乙方不承担任何违约责任， 甲方需承担申办签证费用X元,是否勾选 0否1是", example = "预定须知-因甲方原因 送签后或者出签后 造成本次行程变更或取消行程的，乙方不承担任何违约责任， 甲方需承担申办签证费用X元,是否勾选 0否1是(String)")
    private String noticeItem3IsSelect = "0";
    @ApiModelProperty(value = "因甲方原因 送签后或者出签后 造成本次行程变更或取消行程的，乙方不承担任何违约责任， 甲方需承担申办签证费用X元", example = "预定须知-因甲方原因 送签后或者出签后 造成本次行程变更或取消行程的，乙方不承担任何违约责任， 甲方需承担申办签证费用X元(String)")
    private String noticeItem3 = "";
    @ApiModelProperty(value = "此合同签订后即为出机票的有效确认，旅行社到出票时间点直接出票，恕不另行告知,是否勾选 0否1是", example = "预定须知-此合同签订后即为出机票的有效确认，旅行社到出票时间点直接出票，恕不另行告知,是否勾选 0否1是(String)")
    private String noticeItem4IsSelect = "0";
    @ApiModelProperty(value = "若甲方因为个人原因无法出入境或提供的护照扫描件与在机场登记护照信息不符，责任自负，乙方不承担责任,是否勾选 0否1是", example = "预定须知-若甲方因为个人原因无法出入境或提供的护照扫描件与在机场登记护照信息不符，责任自负，乙方不承担责任,是否勾选 0否1是(String)")
    private String noticeItem5IsSelect;
    @ApiModelProperty(value = "特别提醒,是否勾选 0否1是", example = "预定须知-特别提醒,是否勾选 0否1是(String)")
    private String noticeItem6IsSelect = "0";
    @ApiModelProperty(value = "联运航班不保证当天航班，去程可能会提前一天，回程可能会晚一天,是否勾选 0否1是", example = "预定须知-联运航班不保证当天航班，去程可能会提前一天，回程可能会晚一天,是否勾选 0否1是(String)")
    private String noticeItem7IsSelect = "0";
    @ApiModelProperty(value = "甲方认可：当甲方面试出签之后临时退团时，甲方同意缴纳旅游担保金的，乙方退还客人护照,是否勾选 0否1是", example = "预定须知-甲方认可：当甲方面试出签之后临时退团时，甲方同意缴纳旅游担保金的，乙方退还客人护照,是否勾选 0否1是(String)")
    private String noticeItem8IsSelect = "0";
    @ApiModelProperty(value = "附加预订须知,是否勾选 0否1是", example = "预定须知-附加预订须知,是否勾选 0否1是(String)")
    private String preOrderAddOnsIsSelect = "";
    @ApiModelProperty(value = "附加预订须知", example = "预定须知-附加预订须知(String)")
    private List<String> preOrderAddOns;
    
    public String getNoticePayType() {
        return noticePayType;
    }
    
    public void setNoticePayType(String noticePayType) {
        this.noticePayType = noticePayType;
    }
    
    public String getNoticePayHour() {
        return noticePayHour;
    }
    
    public void setNoticePayHour(String noticePayHour) {
        this.noticePayHour = noticePayHour;
    }
    
    public String getNoticeIfNeedIsSelect() {
        return noticeIfNeedIsSelect;
    }
    
    public void setNoticeIfNeedIsSelect(String noticeIfNeedIsSelect) {
        this.noticeIfNeedIsSelect = noticeIfNeedIsSelect;
    }
    
    public String getImportCheckIsSelect() {
        return importCheckIsSelect;
    }
    
    public void setImportCheckIsSelect(String importCheckIsSelect) {
        this.importCheckIsSelect = importCheckIsSelect;
    }
    
    public String getNoticeLessNum() {
        return noticeLessNum;
    }
    
    public void setNoticeLessNum(String noticeLessNum) {
        this.noticeLessNum = noticeLessNum;
    }
    
    public String getNoticeLessDays() {
        return noticeLessDays;
    }
    
    public void setNoticeLessDays(String noticeLessDays) {
        this.noticeLessDays = noticeLessDays;
    }
    
    public String getNoticeLeaveSelfType() {
        return noticeLeaveSelfType;
    }
    
    public void setNoticeLeaveSelfType(String noticeLeaveSelfType) {
        this.noticeLeaveSelfType = noticeLeaveSelfType;
    }
    
    public String getNoticeLeaveSelfMoney() {
        return noticeLeaveSelfMoney;
    }
    
    public void setNoticeLeaveSelfMoney(String noticeLeaveSelfMoney) {
        this.noticeLeaveSelfMoney = noticeLeaveSelfMoney;
    }
    
    public String getNoticeNoteIsSelect() {
        return noticeNoteIsSelect;
    }
    
    public void setNoticeNoteIsSelect(String noticeNoteIsSelect) {
        this.noticeNoteIsSelect = noticeNoteIsSelect;
    }
    
    public String getNoticeGat() {
        return noticeGat;
    }
    
    public void setNoticeGat(String noticeGat) {
        this.noticeGat = noticeGat;
    }
    
    public String getNoticeVisaSelfIsSelect() {
        return noticeVisaSelfIsSelect;
    }
    
    public void setNoticeVisaSelfIsSelect(String noticeVisaSelfIsSelect) {
        this.noticeVisaSelfIsSelect = noticeVisaSelfIsSelect;
    }
    
    public String getNoticeItem1IsSelect() {
        return noticeItem1IsSelect;
    }
    
    public void setNoticeItem1IsSelect(String noticeItem1IsSelect) {
        this.noticeItem1IsSelect = noticeItem1IsSelect;
    }
    
    public String getNoticeItem1() {
        return noticeItem1;
    }
    
    public void setNoticeItem1(String noticeItem1) {
        this.noticeItem1 = noticeItem1;
    }
    
    public String getNoticeItem2IsSelect() {
        return noticeItem2IsSelect;
    }
    
    public void setNoticeItem2IsSelect(String noticeItem2IsSelect) {
        this.noticeItem2IsSelect = noticeItem2IsSelect;
    }
    
    public String getNoticeItem2() {
        return noticeItem2;
    }
    
    public void setNoticeItem2(String noticeItem2) {
        this.noticeItem2 = noticeItem2;
    }
    
    public String getNoticeItem3IsSelect() {
        return noticeItem3IsSelect;
    }
    
    public void setNoticeItem3IsSelect(String noticeItem3IsSelect) {
        this.noticeItem3IsSelect = noticeItem3IsSelect;
    }
    
    public String getNoticeItem3() {
        return noticeItem3;
    }
    
    public void setNoticeItem3(String noticeItem3) {
        this.noticeItem3 = noticeItem3;
    }
    
    public String getNoticeItem4IsSelect() {
        return noticeItem4IsSelect;
    }
    
    public void setNoticeItem4IsSelect(String noticeItem4IsSelect) {
        this.noticeItem4IsSelect = noticeItem4IsSelect;
    }
    
    public String getNoticeItem5IsSelect() {
        return noticeItem5IsSelect;
    }
    
    public void setNoticeItem5IsSelect(String noticeItem5IsSelect) {
        this.noticeItem5IsSelect = noticeItem5IsSelect;
    }
    
    public String getNoticeItem6IsSelect() {
        return noticeItem6IsSelect;
    }
    
    public void setNoticeItem6IsSelect(String noticeItem6IsSelect) {
        this.noticeItem6IsSelect = noticeItem6IsSelect;
    }
    
    public String getNoticeItem7IsSelect() {
        return noticeItem7IsSelect;
    }
    
    public void setNoticeItem7IsSelect(String noticeItem7IsSelect) {
        this.noticeItem7IsSelect = noticeItem7IsSelect;
    }
    
    public String getNoticeItem8IsSelect() {
        return noticeItem8IsSelect;
    }
    
    public void setNoticeItem8IsSelect(String noticeItem8IsSelect) {
        this.noticeItem8IsSelect = noticeItem8IsSelect;
    }
    
    public String getPreOrderAddOnsIsSelect() {
        return preOrderAddOnsIsSelect;
    }
    
    public void setPreOrderAddOnsIsSelect(String preOrderAddOnsIsSelect) {
        this.preOrderAddOnsIsSelect = preOrderAddOnsIsSelect;
    }
    
    public List<String> getPreOrderAddOns() {
        return preOrderAddOns;
    }
    
    public void setPreOrderAddOns(List<String> preOrderAddOns) {
        this.preOrderAddOns = preOrderAddOns;
    }
    
    @Override
    public Map<String, Object> getMontageDetai() {
        Map<String, Object> detailMap = new HashMap<>();
        StringBuilder preOrderNoticeInfo = new StringBuilder("");
        
        switch (noticePayType) {
            case "0":
                break;
            case "1":
                preOrderNoticeInfo.append("为了确保您能够按时出行，产品确认后请在" + noticePayHour + "小时内付款，同时请按要求尽快提供出游所需的材料并签订出境旅游合同。");
                break;
            case "2":
                preOrderNoticeInfo.append("为了确保您能够按时出行，产品确认后请在" + noticePayHour + "小时内付预付款签订报名意向书，同时请按要求尽快提供出游所需的材料，并于出团前5个工作日交齐尾款并签订出境旅游合同。");
                break;
            default:
                break;
        }
        
        switch (noticeIfNeedIsSelect) {
            case "0":
                break;
            case "1":
                preOrderNoticeInfo.append("预订时请告之您的出游人数、出发日期、住宿、用餐标准、以及您的特殊需求。团队报价按2人入住1间房核算,如出现单男单女,则尽量安排与其他同性别团友拼房或加床；若客人无需安排或旅行社无法安排,请补齐单房差以享用单人房间。团队机票一经开出,不得更改,不得签转,不得退票；另飞行时间、车程时间、船程时间以当日实际所用时间为准。如遇国家或航空公司政策性调整机票、燃油税价格,按调整后的实际价格结算。当地购物时请慎重考虑,把握好质量与价格,请务必保存好所有的购物票据,若购物点提供发票,请索要。是否给予签证或签注、是否准予出入境,是使领馆及有关部门的权力,如因游客自身原因或因提供材料存在问题不能及时办理签证或签注以及被有关部门拒发签证或签注,不准出入境而影响行程的,签证费及其他费用损失由游客自行承担。为了不耽误您的行程,请您在国际航班起飞前180分钟到达机场办理登机以及出入境相关手续；如涉及海外国内段行程,请您在航班起飞前60分钟到达机场办理登机手续。出团通知最晚于出团前1个工作日发送,若能提前确定,我们将会第一时间通知您。");
                break;
            default:
                break;
        }
        
        switch (importCheckIsSelect) {
            case "0":
                break;
            case "1":
                preOrderNoticeInfo.append("此团收客人数不足" + noticeLessNum + "人时，本公司会于出发前" + noticeLessDays + "个工作日通知取消该行程,您可以选择延期出发、更改线路出行,或退回团款。");
                break;
            default:
                break;
        }
        
        switch (noticeLeaveSelfType) {
            case "0":
                break;
            case "1":
                preOrderNoticeInfo.append("团队游览中不允许擅自离团（自由活动除外),如有不便敬请谅解。");
                break;
            case "2":
                preOrderNoticeInfo.append("团队游览中不允许擅自离团（自由活动除外),游客中途离团视同违约，需要支付违约金" + noticeLeaveSelfMoney + "元,且由此造成未参加行程内景点、用餐、房、车等费用不退,旅行社亦不承担游客离团时发生意外的责任。");
                break;
            default:
                break;
        }
        
        switch (noticeNoteIsSelect) {
            case "0":
                break;
            case "1":
                preOrderNoticeInfo.append("销签说明：团队返回后，请务必将护照及返程登机牌的原件交于领队统一办理销签手续（其中登机牌原件递送进领馆后是不予退还的，如您需要换取航空公司的积分，可在机场换取登机牌时同时办理）；且按照各使领馆现行规定，会抽查团队部分或全部出团游客回国后面试销签，届时抽查到的游客必须按照使馆通知的时间本人前往使馆面试销签。");
                break;
            default:
                break;
        }
        
        switch (noticeGat) {
            case "0":
                break;
            case "1":
                preOrderNoticeInfo.append("本团队产品只接受持各地签发的中国大陆因私护照客人，不接受港澳台及外籍客人预订。");
                break;
            case "2":
                preOrderNoticeInfo.append("本团队产品只接受持各地签发的港澳通行证客人，不接受港澳台及外籍客人预订。");
                break;
            default:
                break;
        }
        
        switch (noticeVisaSelfIsSelect) {
            case "0":
                break;
            case "1":
                preOrderNoticeInfo.append("如果您已自备签证，请务必提供有效护照及签证复印件，用于核对姓名和签证有效期。如因自备签证问题造成行程受阻，相应损失需自行承担。");
                break;
            default:
                break;
        }
        
        
        switch (noticeItem1IsSelect) {
            case "0":
                detailMap.put("notice_item1", "");
                break;
            case "1":
                detailMap.put("notice_item1", "因甲方原因发生拒签、延时交签造成本次出境行程变更或取消的，乙方不承担违约责任，甲方需承担申办 签证费用" + noticeItem1 + "元/人。");
                break;
            default:
                detailMap.put("notice_item1", "");
                break;
        }
        
        switch (noticeItem2IsSelect) {
            case "0":
                detailMap.put("notice_item2", "");
                break;
            case "1":
                detailMap.put("notice_item2", "本团 机位订金" + noticeItem2 + "元/人。 ，未送签证前，如因甲方原因取消行程的，已收取的 机位订金不予退还 ，同时按照旅游合同相关条款保留收取甲方违约金的权利。");
                break;
            default:
                detailMap.put("notice_item2", "");
                break;
        }
        
        switch (noticeItem3IsSelect) {
            case "0":
                detailMap.put("notice_item3", "");
                break;
            case "1":
                detailMap.put("notice_item3", "因甲方原因 送签后或者出签后 造成本次行程变更或取消行程的，乙方不承担任何违约责任， 甲方需承担申办签证费用" + noticeItem3 + "元/人和机位订金等实际已经发生的费用 。");
                break;
            default:
                detailMap.put("notice_item3", "");
                break;
        }
        
        switch (noticeItem4IsSelect) {
            case "0":
                detailMap.put("notice_item4", "");
                break;
            case "1":
                detailMap.put("notice_item4", "此合同签订后即为出机票的有效确认，旅行社到出票时间点直接出票，恕不另行告知。");
                break;
            default:
                detailMap.put("notice_item4", "");
                break;
        }
        
        switch (noticeItem5IsSelect) {
            case "0":
                detailMap.put("notice_item5", "");
                break;
            case "1":
                detailMap.put("notice_item5", "若甲方因为个人原因无法出入境或提供的护照扫描件与在机场登记护照信息不符，责任自负，乙方不承担责任。");
                break;
            default:
                detailMap.put("notice_item5", "");
                break;
        }
        
        switch (noticeItem6IsSelect) {
            case "0":
                detailMap.put("notice_item6", "");
                break;
            case "1":
                detailMap.put("notice_item6", "特别提醒：此线路团款中不包含甲方所在地到出境城市的往返交通费及住宿费用，如产生此部分费用，请客人自理。建议旅游者在获悉此团队已送签证后再着手预订国内段交通及住宿。");
                break;
            default:
                detailMap.put("notice_item6", "");
                break;
        }
        
        switch (noticeItem7IsSelect) {
            case "0":
                detailMap.put("notice_item7", "");
                break;
            case "1":
                detailMap.put("notice_item7", "联运航班不保证当天航班，去程可能会提前一天，回程可能会晚一天。若产生住宿费由客人自理。最终以实际出票情况为准。");
                break;
            default:
                detailMap.put("notice_item7", "");
                break;
        }
        
        switch (noticeItem8IsSelect) {
            case "0":
                detailMap.put("notice_item8", "");
                break;
            case "1":
                detailMap.put("notice_item8", "甲方认可：当甲方面试出签之后临时退团时，甲方同意缴纳旅游担保金的，乙方退还客人护照；甲方不缴纳旅游担保金的，则乙方有权保留护照直到签证过期。");
                break;
            default:
                detailMap.put("notice_item8", "");
                break;
        }
        
        switch (preOrderAddOnsIsSelect) {
            case "0":
                detailMap.put("notice_append", "");
                break;
            case "1":
                StringBuilder notice_append = new StringBuilder("");
                for (String s : preOrderAddOns) {
                    notice_append.append(s + "&");
                }
                detailMap.put("notice_append", notice_append);
                break;
            default:
                detailMap.put("notice_append", "");
                break;
        }
        detailMap.put("preOrderNoticeInfo", preOrderNoticeInfo);
        return detailMap;
    }
}
