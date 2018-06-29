package com.ykly.entity.product.detail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@ApiModel(value = "产品详情入参类")
public class BTProductDetail {
    
    @ApiModelProperty(value = "产品详情——重要信息,费用包含,费用不包含,特殊人群入参VO")
    private BTProductDetailInfo detailInfo;
    
    @ApiModelProperty(value = "产品详情-推荐入参VO")
    private BTProductDetailRecommend detailRecommend;
    
    @ApiModelProperty(value = "产品详情——活动推荐,预定须知,其他等入参VO")
    private BTProductDetailOther detailOther;
    
    public BTProductDetailInfo getDetailInfo() {
        return detailInfo;
    }
    
    public void setDetailInfo(BTProductDetailInfo detailInfo) {
        this.detailInfo = detailInfo;
    }
    
    public BTProductDetailRecommend getDetailRecommend() {
        return detailRecommend;
    }
    
    public void setDetailRecommend(BTProductDetailRecommend detailRecommend) {
        this.detailRecommend = detailRecommend;
    }
    
    public BTProductDetailOther getDetailOther() {
        return detailOther;
    }
    
    public void setDetailOther(BTProductDetailOther detailOther) {
        this.detailOther = detailOther;
    }
}
