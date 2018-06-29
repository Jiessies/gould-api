package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel("重要信息-附加信息vo")
public class ImportAddOnsVo implements ProductMontageDetail {
    @ApiModelProperty(value = "本行程与其他团队客人拼往返用车勾选状态", example = "重要信息-附加信息-本行程与其他团队客人拼往返用车勾选状态:0.未勾选 1.勾选(String)")
    private String ifHeadlineOneIsSelect = "0";
    
    @ApiModelProperty(value = "本行程与其他团队客人拼往返用车输入框", example = "重要信息-附加信息-本行程与其他团队客人拼往返用车输入框(String)")
    private String headlineOne = "";
    
    @ApiModelProperty(value = "根据发团需要，行程中将换当地用车或换当地导游勾选状态", example = "重要信息-附加信息-根据发团需要，行程中将换当地用车或换当地导游勾选状态:0.未勾选 1.勾选(String)")
    private String ifHeadlineTwoIsSelect = "0";
    
    @ApiModelProperty(value = "根据发团需要，行程中将换当地用车或换当地导游输入框", example = "重要信息-附加信息-根据发团需要，行程中将换当地用车或换当地导游输入框(String)")
    private String headlineTwo = "";
    
    @ApiModelProperty(value = "可根据需要选择某段行程或升级行程，在该行程段分开安排或统一协调行程勾选状态", example = "重要信息-附加信息-可根据需要选择某段行程或升级行程，在该行程段分开安排或统一协调行程勾选状态:0.未勾选 1.勾选(String)")
    private String ifHeadlineThreeIsSelect = "0";
    
    @ApiModelProperty(value = "可根据需要选择某段行程或升级行程，在该行程段分开安排或统一协调行程输入框", example = "重要信息-附加信息-可根据需要选择某段行程或升级行程，在该行程段分开安排或统一协调行程输入框(String)")
    private String headlineThree = "";

    public String getIfHeadlineOneIsSelect() {
        return ifHeadlineOneIsSelect;
    }

    public void setIfHeadlineOneIsSelect(String ifHeadlineOneIsSelect) {
        this.ifHeadlineOneIsSelect = ifHeadlineOneIsSelect;
    }

    public String getHeadlineOne() {
        return headlineOne;
    }

    public void setHeadlineOne(String headlineOne) {
        this.headlineOne = headlineOne;
    }

    public String getIfHeadlineTwoIsSelect() {
        return ifHeadlineTwoIsSelect;
    }

    public void setIfHeadlineTwoIsSelect(String ifHeadlineTwoIsSelect) {
        this.ifHeadlineTwoIsSelect = ifHeadlineTwoIsSelect;
    }

    public String getHeadlineTwo() {
        return headlineTwo;
    }

    public void setHeadlineTwo(String headlineTwo) {
        this.headlineTwo = headlineTwo;
    }

    public String getIfHeadlineThreeIsSelect() {
        return ifHeadlineThreeIsSelect;
    }

    public void setIfHeadlineThreeIsSelect(String ifHeadlineThreeIsSelect) {
        this.ifHeadlineThreeIsSelect = ifHeadlineThreeIsSelect;
    }

    public String getHeadlineThree() {
        return headlineThree;
    }

    public void setHeadlineThree(String headlineThree) {
        this.headlineThree = headlineThree;
    }
    
    @Override
    public Map<String, Object> getMontageDetai() {
        Map<String,Object> detailMap = new HashMap<>();
        StringBuilder importAddOnsInfo = new StringBuilder("");
        switch (ifHeadlineOneIsSelect){
            case "0":
                break;
            case "2":
                importAddOnsInfo.append("本行程与其他团队客人拼接往返用车,"+headlineOne+"\n");
                break;
            default:
                break;
        }
        switch (ifHeadlineTwoIsSelect){
            case "0":
                break;
            case "2":
                importAddOnsInfo.append("根据发团需要,行程中将换当地用车或换当地导游,"+headlineTwo+"\n");
                break;
            default:
                break;
        }
        switch (ifHeadlineThreeIsSelect){
            case "0":
                break;
            case "1":
                importAddOnsInfo.append("可根据需要选择某段行程或升级行程,在该行程段分开安排或统一协调行程"+headlineThree);
                break;
            default:
                break;
        }
        detailMap.put("importAddOnsInfo",importAddOnsInfo);
        return detailMap;
    }
}
