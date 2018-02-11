package com.ykly.entity.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * Created by huangmingjie on 2018/2/2.
 */
@Data
@ApiModel(value = "产品入参类")
public class Product implements Serializable {
    private static final long serialVersionUID = -1482093487510356514L;
    
    private long timestamp;
    
    @ApiModelProperty(value = "产品主要信息")
    @NotNull(message = "产品主要信息不能为空")
    @Valid
    private ProductInfo productInfo;
    
    @ApiModelProperty(value = "产品详情")
    @NotNull(message = "产品详情不能为空")
    @Valid
    private ProductDetail productDetail;
    
    @ApiModelProperty(value = "产品特殊人群限制-地域限制")
    private List<ProductDA> productDAList;
    
    @ApiModelProperty(value = "产品包含酒店信息")
    private List<ProductDH> productDHList;
    
    @ApiModelProperty(value = "产品交通")
    @Valid
    private List<ProductDetailTraffic> productDetailTrafficList;
    
    @ApiModelProperty(value = "产品活动信息")
    @Valid
    private List<ProductActivity> productActivityList;
    
    @ApiModelProperty(value = "产品推荐信息")
    @Valid
    private List<ProductDS> productDSList;
    
    @ApiModelProperty(value = "产品行程详情信息")
    @NotNull(message = "产品行程详情信息不能为空")
    @Valid
    private ProductDT productDT;
    
    @ApiModelProperty(value = "签证产品详情")
    @Valid
    private List<ProductDV> productDVList;
    
    @ApiModelProperty(value = "产品图片信息")
    @Valid
    private ProductPic productPic;
    
    @ApiModelProperty(value = "团期表信息")
    @Valid
    @NotEmpty(message = "团期表信息不能为空")
    private List<ProductGO> productGOList;
    
    @ApiModelProperty(value = "团期-特殊客户优惠")
    private List<ProductBenefit> productBenefitList;
    
    @ApiModelProperty(value = "特殊人群团期信息")
    @Valid
    private List<ProductGP> productGPList;
    
    @ApiModelProperty(value = "库存表信息")
    @Valid
    @NotEmpty(message = "库存表信息不能为空")
    private List<ProductSM> productSMList;
}
