package com.ykly.entity.product.json;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("活动推荐——购物推荐")
public class ShopRecommendVo {
	
	@ApiModelProperty(value = "购物店名称",example = "活动推荐——购物推荐-购物店名称(String)")
	private String shopName = "";
	@ApiModelProperty(value = "营业产品",example = "活动推荐——购物推荐-营业产品(String)")
	private String mainProduct = "";
	@ApiModelProperty(value = "说明",example = "活动推荐——购物推荐-说明(String)")
	private String shopInfo = "";
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getMainProduct() {
		return mainProduct;
	}
	public void setMainProduct(String mainProduct) {
		this.mainProduct = mainProduct;
	}
	public String getShopInfo() {
		return shopInfo;
	}
	public void setShopInfo(String shopInfo) {
		this.shopInfo = shopInfo;
	}

}
