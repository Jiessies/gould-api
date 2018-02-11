package com.ykly.mapper;

import com.ykly.entity.product.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by huangmingjie on 2018/2/2.
 */
@Repository
public interface ProductMapper {
    int insertProductInfo(ProductInfo productInfo);
    
    int insertProductPic(ProductPic productPic);
    
    int insertProductDT(ProductDT dt);
    
    int insertProductDTC(ProductDTC dtc);
    
    int insertProductDetail(ProductDetail detail);
    
    int insertProductActivity(List<ProductActivity> activityList);
    
    int insertProductDS(List<ProductDS> dsList);
    
    int insertProductDV(List<ProductDV> dvList);
    
    int insertProductTrip(ProductTrip trip);
    
    int insertProductGO(List<ProductGO> goList);
    
    int insertProductSM(List<ProductSM> smList);
    
    int insertProductGP(List<ProductGP> gpList);
    
    int insertProductDetailTraffic(List<ProductDetailTraffic> pdtList);
    
    int insertProductDTI(ProductDTI dti);
    
    int insertProductDH(List<ProductDH> productDHList);
    
    int insertProductDA(List<ProductDA> daList);
    
    int insertProductBenefit(List<ProductBenefit> benefitList);
}
