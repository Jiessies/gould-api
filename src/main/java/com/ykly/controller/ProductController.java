package com.ykly.controller;

import com.ykly.entity.ResMsg;
import com.ykly.entity.product.Product;
import com.ykly.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by huangmingjie on 2018/2/2.
 */
@Api(value = "product", description = "BOM自营产品入库接口")
@RestController
@RequestMapping(value = "/product")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @ApiOperation(value = "BOM自营产品入库接口", notes = "BOM自营产品入库接口", produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "/insertInfo")
    public ResMsg insertProductInfo(@RequestHeader(value = "X-Request-Id", required = false, defaultValue = "") String requestId,
                                    @RequestHeader(value = "X-TimeStamp", required = true) long timeStamp,
                                    @RequestHeader(value = "X-Authentication", required = true) String authentication,
                                    @Valid @RequestBody Product product,
                                    BindingResult bindingResult) {
        ResMsg resMsg = productService.insertProductInfo(requestId, timeStamp, authentication, product, bindingResult);
        return resMsg;
    }
}
