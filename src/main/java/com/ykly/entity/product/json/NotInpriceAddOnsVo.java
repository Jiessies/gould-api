package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel("费用不包含——补充")
public class NotInpriceAddOnsVo implements ProductMontageDetail {
	
	@ApiModelProperty(value = "出入境个人物品海关征税，超重行李的托运费、保管费,是否勾选 0否 1是",example = "费用不包含——补充-出入境个人物品海关征税，超重行李的托运费、保管费,是否勾选 0否 1是(String)")
	private String notInPriceSupply1IsSelect = "0";
	@ApiModelProperty(value = "因交通延阻、战争、政变、罢工、天气、飞机机器故障、航班取消或更改时间等不可抗力原因所引致的额外费用,是否勾选 0否 1是",example = "费用不包含——补充-因交通延阻、战争、政变、罢工、天气、飞机机器故障、航班取消或更改时间等不可抗力原因所引致的额外费用,是否勾选 0否 1是(String)")
	private String notInPriceSupply2IsSelect = "0";
	@ApiModelProperty(value = "酒店内洗衣、理发、电话、传真、收费电视、饮品、烟酒等个人消费,是否勾选 0否 1是",example = "费用不包含——补充-酒店内洗衣、理发、电话、传真、收费电视、饮品、烟酒等个人消费,是否勾选 0否 1是(String)")
	private String notInPriceSupply3IsSelect = "0";
	@ApiModelProperty(value = "当地参加的自费以及以上“费用包含”中不包含的其他项目,是否勾选 0否 1是",example = "费用不包含——补充-当地参加的自费以及以上“费用包含”中不包含的其他项目,是否勾选 0否 1是(String)")
	private String notInPriceSupply4IsSelect = "0";
	
	public String getNotInPriceSupply1IsSelect() {
		return notInPriceSupply1IsSelect;
	}
	public void setNotInPriceSupply1IsSelect(String notInPriceSupply1IsSelect) {
		this.notInPriceSupply1IsSelect = notInPriceSupply1IsSelect;
	}
	public String getNotInPriceSupply2IsSelect() {
		return notInPriceSupply2IsSelect;
	}
	public void setNotInPriceSupply2IsSelect(String notInPriceSupply2IsSelect) {
		this.notInPriceSupply2IsSelect = notInPriceSupply2IsSelect;
	}
	public String getNotInPriceSupply3IsSelect() {
		return notInPriceSupply3IsSelect;
	}
	public void setNotInPriceSupply3IsSelect(String notInPriceSupply3IsSelect) {
		this.notInPriceSupply3IsSelect = notInPriceSupply3IsSelect;
	}
	public String getNotInPriceSupply4IsSelect() {
		return notInPriceSupply4IsSelect;
	}
	public void setNotInPriceSupply4IsSelect(String notInPriceSupply4IsSelect) {
		this.notInPriceSupply4IsSelect = notInPriceSupply4IsSelect;
	}
	
	
	@Override
	public Map<String, Object> getMontageDetai() {
		Map<String,Object> detailMap = new HashMap<>();
		StringBuilder notInpriceAddOnsInfo = new StringBuilder("");
		switch (notInPriceSupply1IsSelect){
			case "0":
				break;
			case "1":
				notInpriceAddOnsInfo.append("出入境个人物品海关征税，超重行李的托运费、保管费;");
				break;
			default:
				break;
		}

		switch (notInPriceSupply2IsSelect){
			case "0":
				break;
			case "1":
				notInpriceAddOnsInfo.append("因交通延阻、战争、政变、罢工、天气、飞机机器故障、航班取消或更改时间等不可抗力原因所引致的额外费用;");
				break;
			default:
				break;
		}

		switch (notInPriceSupply3IsSelect){
			case "0":
				break;
			case "1":
				notInpriceAddOnsInfo.append("酒店内洗衣、理发、电话、传真、收费电视、饮品、烟酒等个人消费;");
				break;
			default:
				break;
		}

		switch (notInPriceSupply4IsSelect){
			case "0":
				break;
			case "1":
				notInpriceAddOnsInfo.append("当地参加的自费以及以上“费用包含”中不包含的其他项目。");
				break;
			default:
				break;
		}
		detailMap.put("notInpriceAddOnsInfo",notInpriceAddOnsInfo);
		return detailMap;
	}
}
