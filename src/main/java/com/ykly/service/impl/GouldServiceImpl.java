package com.ykly.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ykly.annotation.LogAnalysis;
import com.ykly.common.enums.ERetCode;
import com.ykly.common.enums.OptType;
import com.ykly.common.logs.FightOpty;
import com.ykly.common.utils.RedisUtil;
import com.ykly.common.utils.YklyRestTemplate;
import com.ykly.entity.ResMsg;
import com.ykly.entity.request.geocoding.GeoCoding;
import com.ykly.entity.request.pathplanning.DistanceMeasurement;
import com.ykly.service.GouldService;
import org.apache.commons.beanutils.PropertyUtilsBean;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by huangmingjie on 2017/12/1.
 */
@Service
public class GouldServiceImpl implements GouldService {
    
    private static final Logger logger = LoggerFactory.getLogger(GouldServiceImpl.class);
    
    @Autowired
    private RedisUtil redisUtil;
    
    private YklyRestTemplate restTemplate;
    
    @Override
    public ResMsg getDistanceMeasurement(DistanceMeasurement distanceMeasurement, BindingResult bindingResult) {
        String distance = StringUtils.EMPTY;
        ResMsg resMsg = checkParam(bindingResult);
        if (resMsg != null) {
            return resMsg;
        }
        Map requestMap = beanToMap(distanceMeasurement);
        String url = "http://restapi.amap.com/v3/distance";
        String response = restTemplate.lGet(url, null, requestMap, new FightOpty(OptType.GOULD_DISTANCE_MEASUREMENT, ""));
        JSONObject responseJ = JSON.parseObject(response);
        if (responseJ.getString("infocode").equals("10000")) {
            distance = responseJ.getJSONArray("results").getJSONObject(0).getString("distance");
        }
//        Type type = new TypeToken<GouldResult>() {
//        }.getType();
//        GouldResult gouldResult = new Gson().fromJson(response, type);
        return ResMsg.succWithData(distance);
    }
    
    @Override
    public ResMsg getGeoCoding(GeoCoding geoCoding) {
        String location = StringUtils.EMPTY;
        Map requestMap = beanToMap(geoCoding);
        String url = "http://restapi.amap.com/v3/geocode/geo";
        String response = restTemplate.lGet(url, null, requestMap, new FightOpty(OptType.GOULD_GEO_CODING, ""));
        JSONObject responseJ = JSON.parseObject(response);
        if (responseJ.getString("infocode").equals("10000")) {
            if (responseJ.getIntValue("count") > 0) {
                location = responseJ.getJSONArray("geocodes").getJSONObject(0).getString("location");
            }
        }
        return ResMsg.succWithData(location);
    }
    
    @Override
    @LogAnalysis
    public ResMsg getString(String name) {
        logger.info("=====>" + name);
        String forObject = restTemplate.lGet("https://www.baidu.com/", null, null, new FightOpty(OptType.GOULD_DISTANCE_MEASUREMENT, ""));
        return ResMsg.succWithData(forObject);
    }
    
    @Override
    public String setRedis(String key, String value) {
        String response;
        redisUtil.set(key,value,1000);
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        response = (String) redisUtil.get(key);
        return response;
    }
    
    private ResMsg checkParam(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                return ResMsg.fail(ERetCode.CHECKOUT_FAILURE, ERetCode.CHECKOUT_FAILURE.toMsg(), error.getDefaultMessage());
            }
        }
        return null;
    }
    
    private Map<String, Object> beanToMap(Object obj) {
        Map<String, Object> params = new HashMap();
        try {
            PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
            PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(obj);
            for (int i = 0; i < descriptors.length; i++) {
                String name = descriptors[i].getName();
                Object value = propertyUtilsBean.getNestedProperty(obj, name);
                if (!"class".equals(name)) {
                    if (value != null) {
                        params.put(name, value);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return params;
    }
    
    @Override
    public String redisLock(String key, String value) {
        int flag = redisUtil.setnx(key, value);
        if(flag == 1){
            logger.info("redisUtil setnx:{}", key);
            redisUtil.del(key);
            logger.info("redisUtil del key:{}", key);
            return "succ";
        }
        return "fail";
    }
    
    public YklyRestTemplate getRestTemplate() {
        return restTemplate;
    }
    
    public void setRestTemplate(YklyRestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
