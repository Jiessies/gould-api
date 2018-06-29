package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel("费用不包含——单房差")
public class NotInpriceSingleroomVo implements ProductMontageDetail {
	
	@ApiModelProperty(value = "单房差,是否勾选 0否 1是",example = "费用不包含——单房差-单房差,是否勾选 0否 1是(String)")
	private String notInpriceSingleroomIsSelect = "0";
	@ApiModelProperty(value = "单房差",example = "费用不包含——单房差-单房差(String)")
	private String notInpriceSingleroom = "";
	
	
	public String getNotInpriceSingleroomIsSelect() {
		return notInpriceSingleroomIsSelect;
	}
	public void setNotInpriceSingleroomIsSelect(String notInpriceSingleroomIsSelect) {
		this.notInpriceSingleroomIsSelect = notInpriceSingleroomIsSelect;
	}
	public String getNotInpriceSingleroom() {
		return notInpriceSingleroom;
	}
	public void setNotInpriceSingleroom(String notInpriceSingleroom) {
		this.notInpriceSingleroom = notInpriceSingleroom;
	}
	
	@Override
	public Map<String, Object> getMontageDetai() {
		Map<String,Object> detailMap = new HashMap<>();
		StringBuilder notInpriceSingleroomInfo = new StringBuilder("");
		switch (notInpriceSingleroomIsSelect){
			case "0":
				break;
			case "1":
				notInpriceSingleroomInfo.append("单房差("+notInpriceSingleroom+")");
				break;
			default:
				break;
		}
		detailMap.put("notInpriceSingleroomInfo",notInpriceSingleroomInfo);
		return detailMap;
	}
}
