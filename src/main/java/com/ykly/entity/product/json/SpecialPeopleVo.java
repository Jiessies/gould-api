package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApiModel("特殊人群限制")
public class SpecialPeopleVo implements ProductMontageDetail {
	
	@ApiModelProperty(value = "单笔订单出游人数少于X人，需先询确认,是否勾选 0否 1是",example = "特殊人群限制-单笔订单出游人数少于X人，需先询确认,是否勾选 0否 1是(String)")
	private String peopleUnderNumIsSelect = "0";
	@ApiModelProperty(value = "单笔订单出游人数少于X人，需先询确认",example = "特殊人群限制-单笔订单出游人数少于X人，需先询确认(String)")
	private String peopleUnderNum = "";
	
	@ApiModelProperty(value = "单笔订单出游人数超过X人，需先询确认,是否勾选 0否 1是",example = "特殊人群限制-单笔订单出游人数超过X人，需先询确认,是否勾选 0否 1是(String)")
	private String peopleExceedNumIsSelect = "0";
	@ApiModelProperty(value = "单笔订单出游人数超过X人，需先询确认",example = "特殊人群限制-单笔订单出游人数超过X人，需先询确认")
	private String peopleExceedNum = "";
	
	@ApiModelProperty(value = "出游人年龄超过 X岁（含），不接收,是否勾选 0否 1是",example = "特殊人群限制-出游人年龄超过 X岁（含），不接收,是否勾选 0否 1是(String)")
	private String ageExceedNumIsSelect = "0";
	@ApiModelProperty(value = "出游人年龄超过 X岁（含），不接收",example = "特殊人群限制-出游人年龄超过 X岁（含），不接收(String)")
	private String ageExceedNum = "";
	
	@ApiModelProperty(value = "出游人年龄低于X岁（不含），不接收,是否勾选 0否 1是",example = "特殊人群限制-出游人年龄低于X岁（不含），不接收,是否勾选 0否 1是(String)")
	private String ageUnderNumNumIsSelect = "0";
	@ApiModelProperty(value = "出游人年龄低于X岁（不含），不接收",example = "特殊人群限制-出游人年龄低于X岁（不含），不接收(String)")
	private String ageUnderNum = "";
	
	@ApiModelProperty(value = "出游人年龄超过X岁（含），需要签署健康协议,是否勾选 0否 1是",example = "特殊人群限制-出游人年龄超过X岁（含），需要签署健康协议,是否勾选 0否 1是(String)")
	private String ageUnderProtocalNumIsSelect = "0";
	@ApiModelProperty(value = "出游人年龄超过X岁（含），需要签署健康协议",example = "特殊人群限制-出游人年龄超过X岁（含），需要签署健康协议(String)")
	private String ageUnderProtocalNum = "";
	
	@ApiModelProperty(value = "出游人年龄在min岁至max岁，可以正常在线预定,是否勾选 0否 1是",example = "特殊人群限制-出游人年龄在min岁至max岁，可以正常在线预定,是否勾选 0否 1是(String)")
	private String ageMinMaxIsSelect = "0";
	@ApiModelProperty(value = "出游人年龄在min岁",example = "特殊人群限制-出游人年龄在min岁(String)")
	private String ageMinNum = "";
	@ApiModelProperty(value = "出游人年龄在max岁",example = "特殊人群限制-出游人年龄在max岁(String)")
	private String ageMaxNum = "";
	
	@ApiModelProperty(value = "不接受外籍游客,是否勾选 0否 1是",example = "特殊人群限制-不接受外籍游客,是否勾选 0否 1是(String)")
	private String foreignNationalityTouristIsSelect = "0";
	
	@ApiModelProperty(value = "地域限制,是否勾选 0否 1是",example = "特殊人群限制-地域限制,是否勾选 0否 1是(String)")
	private String SpecialPeopleAreaIsSelect = "0";
	
	@ApiModelProperty(value = "1——以下户籍客人存在地域限制 2——非以下户籍客人存在地域限制",example = "特殊人群限制-1——以下户籍客人存在地域限制 2——非以下户籍客人存在地域限制(String)")
	private String SpecialPeopleAreaType = "";
	
	@ApiModelProperty("地域限制城市")
	private List<SpecialPeopleAreaCityVo> specialPeopleAreaCityVoList;
	
	public String getPeopleUnderNumIsSelect() {
		return peopleUnderNumIsSelect;
	}
	public void setPeopleUnderNumIsSelect(String peopleUnderNumIsSelect) {
		this.peopleUnderNumIsSelect = peopleUnderNumIsSelect;
	}
	public String getPeopleUnderNum() {
		return peopleUnderNum;
	}
	public void setPeopleUnderNum(String peopleUnderNum) {
		this.peopleUnderNum = peopleUnderNum;
	}
	public String getPeopleExceedNumIsSelect() {
		return peopleExceedNumIsSelect;
	}
	public void setPeopleExceedNumIsSelect(String peopleExceedNumIsSelect) {
		this.peopleExceedNumIsSelect = peopleExceedNumIsSelect;
	}
	public String getPeopleExceedNum() {
		return peopleExceedNum;
	}
	public void setPeopleExceedNum(String peopleExceedNum) {
		this.peopleExceedNum = peopleExceedNum;
	}
	public String getAgeExceedNumIsSelect() {
		return ageExceedNumIsSelect;
	}
	public void setAgeExceedNumIsSelect(String ageExceedNumIsSelect) {
		this.ageExceedNumIsSelect = ageExceedNumIsSelect;
	}
	public String getAgeExceedNum() {
		return ageExceedNum;
	}
	public void setAgeExceedNum(String ageExceedNum) {
		this.ageExceedNum = ageExceedNum;
	}
	public String getAgeUnderNumNumIsSelect() {
		return ageUnderNumNumIsSelect;
	}
	public void setAgeUnderNumNumIsSelect(String ageUnderNumNumIsSelect) {
		this.ageUnderNumNumIsSelect = ageUnderNumNumIsSelect;
	}
	public String getAgeUnderNum() {
		return ageUnderNum;
	}
	public void setAgeUnderNum(String ageUnderNum) {
		this.ageUnderNum = ageUnderNum;
	}
	public String getAgeUnderProtocalNumIsSelect() {
		return ageUnderProtocalNumIsSelect;
	}
	public void setAgeUnderProtocalNumIsSelect(String ageUnderProtocalNumIsSelect) {
		this.ageUnderProtocalNumIsSelect = ageUnderProtocalNumIsSelect;
	}
	public String getAgeUnderProtocalNum() {
		return ageUnderProtocalNum;
	}
	public void setAgeUnderProtocalNum(String ageUnderProtocalNum) {
		this.ageUnderProtocalNum = ageUnderProtocalNum;
	}
	public String getAgeMinMaxIsSelect() {
		return ageMinMaxIsSelect;
	}
	public void setAgeMinMaxIsSelect(String ageMinMaxIsSelect) {
		this.ageMinMaxIsSelect = ageMinMaxIsSelect;
	}
	public String getAgeMinNum() {
		return ageMinNum;
	}
	public void setAgeMinNum(String ageMinNum) {
		this.ageMinNum = ageMinNum;
	}
	public String getAgeMaxNum() {
		return ageMaxNum;
	}
	public void setAgeMaxNum(String ageMaxNum) {
		this.ageMaxNum = ageMaxNum;
	}
	public String getForeignNationalityTouristIsSelect() {
		return foreignNationalityTouristIsSelect;
	}
	public void setForeignNationalityTouristIsSelect(String foreignNationalityTouristIsSelect) {
		this.foreignNationalityTouristIsSelect = foreignNationalityTouristIsSelect;
	}
	public String getSpecialPeopleAreaIsSelect() {
		return SpecialPeopleAreaIsSelect;
	}
	public void setSpecialPeopleAreaIsSelect(String specialPeopleAreaIsSelect) {
		SpecialPeopleAreaIsSelect = specialPeopleAreaIsSelect;
	}
	public String getSpecialPeopleAreaType() {
		return SpecialPeopleAreaType;
	}
	public void setSpecialPeopleAreaType(String specialPeopleAreaType) {
		SpecialPeopleAreaType = specialPeopleAreaType;
	}
	public List<SpecialPeopleAreaCityVo> getSpecialPeopleAreaCityVoList() {
		return specialPeopleAreaCityVoList;
	}
	public void setSpecialPeopleAreaCityVoList(List<SpecialPeopleAreaCityVo> specialPeopleAreaCityVoList) {
		this.specialPeopleAreaCityVoList = specialPeopleAreaCityVoList;
	}
	
	
	@Override
	public Map<String, Object> getMontageDetai() {
		Map<String, Object> detailMap = new HashMap<>();
		StringBuilder specialPeopleInfo = new StringBuilder("");

		switch (peopleUnderNumIsSelect){
			case "0":
				detailMap.put("peopleUnderNumStr","");
				break;
			case "1":
				detailMap.put("peopleUnderNumStr"," 单笔订单出游人数少于"+peopleUnderNum+"人，需先询确认");
				break;
			default:
				detailMap.put("peopleUnderNumStr","");
				break;
		}

		switch (peopleExceedNumIsSelect){
			case "0":
				detailMap.put("peopleExceedNumStr","");
				break;
			case "1":
				detailMap.put("peopleExceedNumStr","单笔订单出游人数超过"+peopleExceedNum+"人，需先询确认");
				break;
			default:
				detailMap.put("peopleExceedNumStr","");
				break;
		}

		switch (ageExceedNumIsSelect){
			case "0":
				detailMap.put("ageExceedNumStr","");
				break;
			case "1":
				detailMap.put("ageExceedNumStr","出游人年龄超过"+ageExceedNum+"岁（含），不接收");
				break;
			default:
				detailMap.put("ageExceedNumStr","");
				break;
		}

		switch (ageUnderNumNumIsSelect){
			case "0":
				detailMap.put("ageUnderNumStr","");
				break;
			case "1":
				detailMap.put("ageUnderNumStr","出游人年龄低于"+ageUnderNum+"岁（含），不接收");
				break;
			default:
				detailMap.put("ageUnderNumStr","");
				break;
		}

		switch (ageUnderProtocalNumIsSelect){
			case "0":
				detailMap.put("ageUnderProtocalNumStr","");
				break;
			case "1":
				detailMap.put("ageUnderProtocalNumStr","出游人年龄超过"+ageUnderProtocalNum+"岁（含），需要签署健康协议");
				break;
			default:
				detailMap.put("ageUnderProtocalNumStr","");
				break;
		}

		switch (ageMinMaxIsSelect){
			case "0":
				detailMap.put("ageMinMaxNumStr","");
				break;
			case "1":
				detailMap.put("ageMinMaxNumStr","出游人年龄在"+ageMinNum+"岁至"+ageMaxNum+"岁，可以正常在线预定，年龄范围以外的出游人需先询确认");
				break;
			default:
				detailMap.put("ageMinMaxNumStr","");
				break;
		}

		switch (foreignNationalityTouristIsSelect){
			case "0":
				detailMap.put("foreignNationalityTourist","false");
				break;
			case "1":
				detailMap.put("foreignNationalityTourist","true");
				break;
			default:
				detailMap.put("foreignNationalityTourist","false");
				break;
		}

		switch (SpecialPeopleAreaIsSelect){
			case "0":
				detailMap.put("specialPeopleAreaIsSelect","0");
				break;
			case "1":
				detailMap.put("specialPeopleAreaIsSelect","1");
				detailMap.put("specialPeopleAreaType",SpecialPeopleAreaType);
				detailMap.put("specialPeopleAreaCityVoList",specialPeopleAreaCityVoList);
				break;
			default:
				detailMap.put("specialPeopleAreaIsSelect","0");
				break;
		}

		return detailMap;
	}
}
