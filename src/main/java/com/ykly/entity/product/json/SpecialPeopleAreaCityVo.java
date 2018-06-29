package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

@ApiModel("特殊人群限制—地域限制城市")
public class SpecialPeopleAreaCityVo implements ProductMontageDetail {
	@ApiModelProperty(value = "城市省份",example = "特殊人群限制—地域限制城市-城市省份(String)")
	private String province = "";
	@ApiModelProperty(value = "城市名称",example = "特殊人群限制—地域限制城市-城市名称(String)")
	private String city = "";
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	public Map<String, Object> getMontageDetai() {
		return null;
	}
}
