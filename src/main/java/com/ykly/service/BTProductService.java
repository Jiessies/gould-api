package com.ykly.service;

import com.ykly.entity.ResMsg;
import com.ykly.entity.product.detail.BTProductDetail;
import com.ykly.entity.product.group.BTProductGroup;
import com.ykly.entity.product.info.BTProductInfo;
import org.springframework.validation.BindingResult;

/**
 * Created by huangmingjie on 2018/3/8.
 */
public interface BTProductService {
    ResMsg insertProductMainInfo(String requestId, Long timeStamp, String authentication, BTProductInfo product, BindingResult bindingResult);
    
    ResMsg insertProductDetailInfo(String requestId, Long timeStamp, String authentication, BTProductDetail product, BindingResult bindingResult);
    
    ResMsg insertProductGroupOffer(String requestId, Long timeStamp, String authentication, BTProductGroup group, BindingResult bindingResult);
}
