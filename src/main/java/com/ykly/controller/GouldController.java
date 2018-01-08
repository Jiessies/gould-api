package com.ykly.controller;

import com.ykly.entity.ResMsg;
import com.ykly.entity.request.geocoding.GeoCoding;
import com.ykly.entity.request.pathplanning.DistanceMeasurement;
import com.ykly.service.GouldService;
import com.ykly.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by huangmingjie on 2017/12/2.
 */
@RestController
@RequestMapping("/gould")
public class GouldController {
    
    @Autowired
    private GouldService gouldService;
    
    @Autowired
    private TestService testService;
    
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
    
    @RequestMapping(value = "/redis/{key}/{value}", method = RequestMethod.GET)
    public String setRedis(@PathVariable String key, @PathVariable String value) {
        return gouldService.setRedis(key, value);
    }
    
    @GetMapping("/findorder/{orderNo}")
    public String findOrder(@PathVariable String orderNo) {
        return testService.findOrder(orderNo);
    }
}
