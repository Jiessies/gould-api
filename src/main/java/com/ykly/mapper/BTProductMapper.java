package com.ykly.mapper;

import com.ykly.entity.product.detail.BTProductDetailInfo;
import com.ykly.entity.product.detail.BTProductDetailOther;
import com.ykly.entity.product.detail.BTProductDetailRecommend;
import com.ykly.entity.product.group.BTProductGroupOffer;
import com.ykly.entity.product.group.BTProductSpecialPrice;
import com.ykly.entity.product.info.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@Repository
public interface BTProductMapper {
    int insertProductMainInfo(BTProductMainInfo info);
    
    int insertProductSupplementaryInfo(BTProductSupplementaryInfo supplementaryInfo);
    
    int insertProductTrip(BTProductTrip trip);
    
    int insertProductTripDays(BTProductTripDays day);
    
    int insertProductTripChips(List<BTProductTripChips> chipsListt);
    
    int insertProductTripShops(List<BTProductTripShops> shopsList);
    
    int insertProductDetailRecommend(BTProductDetailRecommend detailRecommend);
    
    int insertProductDeatilInfo(BTProductDetailInfo detailInfo);
    
    int insertProductDetailOther(BTProductDetailOther detailOther);
    
    int insertProductGroupOffer(List<BTProductGroupOffer> groupOfferList);
    
    int insertProductSpecialPrice(List<BTProductSpecialPrice> specialPriceList);
    
}
