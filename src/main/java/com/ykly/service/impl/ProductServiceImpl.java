package com.ykly.service.impl;

import com.google.gson.Gson;
import com.ykly.common.enums.ERetCode;
import com.ykly.common.logs.SyncException;
import com.ykly.common.utils.MapKeyComparator;
import com.ykly.common.utils.StringUtil;
import com.ykly.entity.ResMsg;
import com.ykly.entity.product.*;
import com.ykly.mapper.ProductMapper;
import com.ykly.service.ProductService;
import org.apache.commons.collections.CollectionUtils;
import org.hibernate.validator.constraints.NotBlank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import javax.validation.constraints.NotNull;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by huangmingjie on 2018/2/2.
 */
@Service
public class ProductServiceImpl implements ProductService {
    private static final Logger logger = LoggerFactory.getLogger("ProductServiceImpl");
    
    @Autowired
    private ProductMapper productMapper;
    
    /**
     * Bom同步Tdm产品接口
     *
     * @param requestId
     * @param timeStamp      时间戳
     * @param authentication 认证信息
     * @param product        产品入参
     * @param bindingResult  校验绑定
     * @return
     */
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = {Exception.class, RuntimeException.class, SyncException.class})
    @Override
    public ResMsg insertProductInfo(String requestId, long timeStamp, String authentication, Product product, BindingResult bindingResult) {
        ResMsg resMsg;
        //验证入参
        checkParams(product, bindingResult);
        //认证验证
        verificationAuth(requestId, timeStamp, authentication, product);
        try {
            //操作产品基础信息表
            ProductInfo info = product.getProductInfo();
            int flag = productMapper.insertProductInfo(info);
            if (flag == 0) {
                resMsg = ResMsg.fail(ERetCode.ENV_ERROR_MYSQL, "", "产品基础信息添加失败");
                throw new SyncException(resMsg);
            }
            int productId = info.getProduct_id();
            //操作产品图片
            ProductPic pic = product.getProductPic();
            if (pic != null) {
                pic.setProduct_id(productId);
                productMapper.insertProductPic(pic);
            }
            //操作线路行程
            ProductDT dt = product.getProductDT();
            if (dt != null) {
                dt.setProduct_id(productId);
                productMapper.insertProductDT(dt);//行程
                List<ProductTrip> tripList = dt.getProductTripList();
                if (CollectionUtils.isNotEmpty(tripList)) {
                    for (ProductTrip trip : tripList) {
                        trip.setProduct_id(productId);
                        productMapper.insertProductTrip(trip);//天
                        int tripId = trip.getTrip_id();
                        List<ProductDTC> dtcList = trip.getProductDTCList();
                        if (CollectionUtils.isNotEmpty(dtcList)) {
                            for (ProductDTC dtc : dtcList) {
                                dtc.setTrip_id(tripId);
                                productMapper.insertProductDTC(dtc);//每天行程段
                                ProductDTI dti = dtc.getProductDTI();
                                dti.setChip_id(dtc.getChip_id());
                                productMapper.insertProductDTI(dti);//行程段图片信息
                            }
                        }
                    }
                }
            }
            //添加产品详情信息
            ProductDetail detail = product.getProductDetail();
            if (detail != null) {
                detail.setProduct_id(productId);
                productMapper.insertProductDetail(detail);
            }
            //产品特殊人群限制-地域限制
            List<ProductDA> daList = product.getProductDAList();
            if (CollectionUtils.isNotEmpty(daList)) {
                for (ProductDA da : daList) {
                    da.setProduct_id(productId);
                }
                productMapper.insertProductDA(daList);
            }
            //包含-住宿
            List<ProductDH> dhList = product.getProductDHList();
            if (CollectionUtils.isNotEmpty(dhList)) {
                for (ProductDH dh : dhList) {
                    dh.setProduct_id(productId);
                }
                productMapper.insertProductDH(dhList);
            }
            //包含-交通
            List<ProductDetailTraffic> pdtList = product.getProductDetailTrafficList();
            if (CollectionUtils.isNotEmpty(pdtList)) {
                for (ProductDetailTraffic pdt : pdtList) {
                    pdt.setProduct_id(productId);
                }
                productMapper.insertProductDetailTraffic(pdtList);
            }
            //活动与推荐
            List<ProductActivity> activityList = product.getProductActivityList();
            if (CollectionUtils.isNotEmpty(activityList)) {
                for (ProductActivity activity : activityList) {
                    activity.setProduct_id(productId);
                }
                productMapper.insertProductActivity(activityList);
            }
            List<ProductDS> dsList = product.getProductDSList();
            if (CollectionUtils.isNotEmpty(dsList)) {
                for (ProductDS ds : dsList) {
                    ds.setProduct_id(productId);
                }
                productMapper.insertProductDS(dsList);
            }
            //基础信息中目的地是外国才会在（其他）中有签证信息
            List<ProductDV> dvList = product.getProductDVList();
            if (CollectionUtils.isNotEmpty(dvList)) {
                for (ProductDV dv : dvList) {
                    dv.setProduct_id(productId);
                }
                productMapper.insertProductDV(dvList);
            }
            //团期库存
            List<ProductGO> goList = product.getProductGOList();
            for (ProductGO go : goList) {
                go.setProduct_id(productId);
            }
            productMapper.insertProductGO(goList);//团期
            List<ProductBenefit> benefitList = product.getProductBenefitList();
            if (CollectionUtils.isNotEmpty(benefitList)) {
                for (ProductBenefit benefit : benefitList) {
                    benefit.setProductid(productId);
                }
                productMapper.insertProductBenefit(benefitList);//特殊客户优惠
            }
            List<ProductSM> smList = product.getProductSMList();
            for (ProductSM sm : smList) {
                sm.setProductid(productId);
            }
            productMapper.insertProductSM(smList);//库存
            List<ProductGP> gpList = product.getProductGPList();
            if (CollectionUtils.isNotEmpty(gpList)) {
                for (ProductGP gp : gpList) {
                    gp.setProductid(productId);
                }
                productMapper.insertProductGP(gpList);//特殊人群
            }
            //封装返回值
            resMsg = ResMsg.succWithData(productId);
        } catch (Exception e) {
            resMsg = ResMsg.fail(ERetCode.UNKNOWN, "", e.toString());
            throw new SyncException(resMsg);
        }
        return resMsg;
    }
    
    /**
     * 校验入参信息
     *
     * @param product       产品入参
     * @param bindingResult 校验绑定
     */
    private void checkParams(Product product, BindingResult bindingResult) {
        ResMsg resMsg = null;
        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                resMsg = ResMsg.fail(ERetCode.INPUT_ERROR, "", error.getDefaultMessage());
                break;
            }
            throw new SyncException(resMsg);
        }
    }
    
    /**
     * 认证方法
     *
     * @param requestId
     * @param timeStamp      时间戳
     * @param authentication 认证信息
     * @param product        产品信息
     */
    private void verificationAuth(String requestId, long timeStamp, String authentication, Product product) {
        HashMap<String, Object> requestMap = new HashMap();
        ProductInfo info = product.getProductInfo();
        Field[] fields = info.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Annotation annotation1 = field.getAnnotation(NotBlank.class);
            Annotation annotation2 = field.getAnnotation(NotNull.class);
            if (annotation1 != null || annotation2 != null) {
                try {
                    requestMap.put(field.getName(), field.get(info));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
//        System.out.println("=====>"+new Gson().toJson(requestMap));
        //按Key排序Map后依次获取Map的Value值拼接最后拼接时间戳再转MD5值作为验证
        String account = "YKLY-Xiamen0001";
        String password = "zipEb7ohu8BYmmnikmah89OTGgcN2NEO";
        String auth = getAuthString(account, password, sortMapByKey(requestMap), timeStamp);
        if (!authentication.equals(auth)) {
            throw new SyncException(ResMsg.fail(ERetCode.CERTIFICATION_NOT_PASS, "", "认证没有通过!"));
        }
    }
    
    /**
     * 按Key排序Map
     *
     * @param map 入参Map
     * @return
     */
    private Map<String, Object> sortMapByKey(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            throw new SyncException(ResMsg.fail(ERetCode.INPUT_ERROR, "", "入参错误"));
        }
        Map<String, Object> sortMap = new TreeMap<>(
                new MapKeyComparator());
        sortMap.putAll(map);
        return sortMap;
    }
    
    /**
     * 生成认证信息
     *
     * @param account   给第三方的账号
     * @param password  给第三方的密码
     * @param map       排序后的入参Map
     * @param timestamp 时间戳
     * @return
     */
    private String getAuthString(String account, String password, Map<String, Object> map, long timestamp) {
        logger.info("=======>" + new Gson().toJson(map));
        StringBuilder builder = new StringBuilder(account + ",");
        for (Map.Entry entry : map.entrySet()) {
            builder.append(entry.getKey()).append("=").append(entry.getValue()).append(",");
        }
        builder.append(String.valueOf(timestamp)).append(",").append(password);
        return StringUtil.md5(builder.toString());
    }
}
