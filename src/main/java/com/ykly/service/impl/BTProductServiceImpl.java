package com.ykly.service.impl;

import com.ykly.common.enums.ERetCode;
import com.ykly.common.logs.SyncException;
import com.ykly.entity.ResMsg;
import com.ykly.entity.product.detail.BTProductDetail;
import com.ykly.entity.product.group.BTProductGroup;
import com.ykly.entity.product.info.*;
import com.ykly.mapper.BTProductMapper;
import com.ykly.service.BTProductService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * Created by huangmingjie on 2018/3/8.
 */
@Service
public class BTProductServiceImpl implements BTProductService {
    
    @Autowired
    private BTProductMapper btProductMapper;
    
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = {Exception.class, RuntimeException.class, SyncException.class})
    @Override
    public ResMsg insertProductMainInfo(String requestId, Long timeStamp, String authentication, BTProductInfo product, BindingResult bindingResult) {
        ResMsg resMsg;
        //验证入参
        //checkParams(product, bindingResult);
        //认证验证
        //verificationAuth(requestId, timeStamp, authentication, product);
        try {
            //操作产品基础信息表
            BTProductMainInfo info = product.getMainInfo();
            int flag = btProductMapper.insertProductMainInfo(info);
            if (flag == 0) {
                resMsg = ResMsg.fail(ERetCode.ENV_ERROR_MYSQL, "", "产品基础信息添加失败");
                throw new SyncException(resMsg);
            }
            int productId = info.getId();
            BTProductSupplementaryInfo supplementaryInfo = product.getSupplementaryInfo();
            supplementaryInfo.setProduct_id(productId);
            btProductMapper.insertProductSupplementaryInfo(supplementaryInfo);
            //操作线路行程
            BTProductTrip trip = product.getTrip();
            if (trip != null) {
                trip.setProduct_id(productId);
                //行程
                btProductMapper.insertProductTrip(trip);
                int tripId = trip.getId();
                List<BTProductTripDays> tripList = trip.getTripDaysList();
                if (CollectionUtils.isNotEmpty(tripList)) {
                    for (BTProductTripDays day : tripList) {
                        day.setProduct_id(productId);
                        day.setTrip_id(tripId);
                        //天
                        btProductMapper.insertProductTripDays(day);
                        int dayId = day.getDay_id();
                        List<BTProductTripChips> chipsList = day.getTripChipsList();
                        if (CollectionUtils.isNotEmpty(chipsList)) {
                            for (BTProductTripChips chip : chipsList) {
                                chip.setDay_id(dayId);
                            }
                            btProductMapper.insertProductTripChips(chipsList);
                        }
                        
                        List<BTProductTripShops> shopsList = day.getTripShopsList();
                        if (CollectionUtils.isNotEmpty(shopsList)) {
                            for (BTProductTripShops shop : shopsList) {
                                shop.setDay_id(dayId);
                            }
                            btProductMapper.insertProductTripShops(shopsList);
                        }
                    }
                }
            }
            resMsg = ResMsg.succWithData(productId);
        } catch (Exception e) {
            resMsg = ResMsg.fail(ERetCode.UNKNOWN, "", e.toString());
            throw new SyncException(resMsg);
        }
        return resMsg;
    }
    
    @Override
    public ResMsg insertProductDetailInfo(String requestId, Long timeStamp, String authentication, BTProductDetail product, BindingResult bindingResult) {
        ResMsg resMsg;
        //验证入参
        //checkParams(product, bindingResult);
        //认证验证
        //verificationAuth(requestId, timeStamp, authentication, product);
        try {
            //新增产品推荐
            btProductMapper.insertProductDetailRecommend(product.getDetailRecommend());
            //产品详情——重要信息,费用包含,费用不包含,特殊人群
            btProductMapper.insertProductDeatilInfo(product.getDetailInfo());
            //产品详情——活动推荐,预定须知,其他等
            btProductMapper.insertProductDetailOther(product.getDetailOther());
            resMsg = ResMsg.succWithData("succ");
        } catch (Exception e) {
            resMsg = ResMsg.fail(ERetCode.UNKNOWN, "", e.toString());
            throw new SyncException(resMsg);
        }
        return resMsg;
    }
    
    @Override
    public ResMsg insertProductGroupOffer(String requestId, Long timeStamp, String authentication, BTProductGroup group, BindingResult bindingResult) {
        ResMsg resMsg;
        //验证入参
        //checkParams(product, bindingResult);
        //认证验证
        //verificationAuth(requestId, timeStamp, authentication, product);
        try {
            //团期库存表
            btProductMapper.insertProductGroupOffer(group.getGroupOfferList());
            //特殊人群报价
            btProductMapper.insertProductSpecialPrice(group.getSpecialPriceList());
            resMsg = ResMsg.succWithData("succ");
        } catch (Exception e) {
            resMsg = ResMsg.fail(ERetCode.UNKNOWN, "", e.toString());
            throw new SyncException(resMsg);
        }
        return resMsg;
    }
}
