package com.ykly.service;

import com.ykly.entity.ResMsg;
import com.ykly.entity.request.geocoding.GeoCoding;
import com.ykly.entity.request.pathplanning.DistanceMeasurement;
import org.springframework.validation.BindingResult;

/**
 * Created by huangmingjie on 2017/12/28.
 */
public interface GouldService {
    ResMsg getDistanceMeasurement(DistanceMeasurement distanceMeasurement, BindingResult bindingResult);
    
    ResMsg getGeoCoding(GeoCoding geoCoding);
    
    String getString();
    
    String setRedis(String key, String value);
}
