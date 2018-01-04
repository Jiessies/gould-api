package com.ykly.controller;

import com.ykly.entity.ResMsg;
import com.ykly.entity.request.geocoding.GeoCoding;
import com.ykly.entity.request.pathplanning.DistanceMeasurement;
import com.ykly.service.GouldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by huangmingjie on 2017/12/2.
 */
@RestController
@RequestMapping("/gould")
public class GouldController {
    
    @Autowired
    private GouldService gouldService;
    
    @PostMapping("/distance")
    public ResMsg getDistanceMeasurement(@Valid DistanceMeasurement distanceMeasurement, BindingResult bindingResult) {
        return gouldService.getDistanceMeasurement(distanceMeasurement, bindingResult);
    }
    
    @PostMapping("/geo")
    public ResMsg getGeoCoding(GeoCoding geoCoding) {
        return gouldService.getGeoCoding(geoCoding);
    }
    
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getString() {
        return gouldService.getString();
    }
}
