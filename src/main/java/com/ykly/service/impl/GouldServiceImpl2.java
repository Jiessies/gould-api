package com.ykly.service.impl;

import com.ykly.annotation.LogAnalysis;
import com.ykly.entity.ResMsg;
import com.ykly.entity.request.geocoding.GeoCoding;
import com.ykly.entity.request.pathplanning.DistanceMeasurement;
import com.ykly.service.GouldService;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

/**
 * Created by huangmingjie on 2018/1/17.
 */
@Service
public class GouldServiceImpl2 implements GouldService {
    @Override
    public ResMsg getDistanceMeasurement(DistanceMeasurement distanceMeasurement, BindingResult bindingResult) {
        return ResMsg.succWithData("getDistanceMeasurement Success");
    }
    
    @Override
    public ResMsg getGeoCoding(GeoCoding geoCoding) {
        return ResMsg.succWithData("getGeoCoding Success");
    }
    
    @Override
    @LogAnalysis
    public ResMsg getString(String name) {
        return ResMsg.succWithData("Success " + name);
    }
    
    @Override
    public String setRedis(String key, String value) {
        return "Success";
    }
    
    @Override
    public String redisLock(String key, String value) {
        return "Success";
    }
}
