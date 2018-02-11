package com.ykly.service;

import com.ykly.entity.ResMsg;
import com.ykly.entity.product.Product;
import org.springframework.validation.BindingResult;

/**
 * Created by huangmingjie on 2018/2/2.
 */
public interface ProductService {
    ResMsg insertProductInfo(String requestId, long timeStamp, String authentication, Product product, BindingResult bindingResult);
}
