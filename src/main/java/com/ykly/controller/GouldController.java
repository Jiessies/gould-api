package com.ykly.controller;

import com.ykly.entity.ResMsg;
import com.ykly.entity.request.geocoding.GeoCoding;
import com.ykly.entity.request.pathplanning.DistanceMeasurement;
import com.ykly.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by huangmingjie on 2017/12/2.
 */
@RestController
@RequestMapping(value = "/gould")
@Api(value = "高德信息", description = "高德信息")
public class GouldController {
    
    @Autowired
    private GouldService gouldService;
    
    @Autowired
    private TestService testService;
    
    @Autowired
    private ProductSolrService productSolrService;
    
    @Autowired
    private TestMqService testMqService;
    
    @Autowired
    private ZookeeperService zookeeperService;
    
    @PostMapping(value = "/distance")
    @ApiOperation(value = "查询坐标点距离", notes = "查询坐标点距离")
    public ResMsg getDistanceMeasurement(@Valid DistanceMeasurement distanceMeasurement, BindingResult bindingResult) {
        return gouldService.getDistanceMeasurement(distanceMeasurement, bindingResult);
    }
    
    @PostMapping("/geo")
    @ApiOperation(value = "坐标", notes = "坐标")
    public ResMsg getGeoCoding(GeoCoding geoCoding) {
        return gouldService.getGeoCoding(geoCoding);
    }
    
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "名字", required = true, paramType = "query")
    })
    @RequestMapping(value = "/get/{name}", method = RequestMethod.GET)
    public ResMsg getString(@PathVariable String name) {
        return gouldService.getString(name);
    }
    
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key",value = "key", required = true, paramType = "query"),
            @ApiImplicitParam(name = "value",value = "value", required = true, paramType = "query")
    })
    @RequestMapping(value = "/redis/{key}/{value}", method = RequestMethod.GET)
    public String setRedis(@PathVariable String key, @PathVariable String value) {
        return gouldService.setRedis(key, value);
    }
    
    @GetMapping("/findorder/{orderNo}")
    public String findOrder(@PathVariable String orderNo) {
        return testService.findOrder(orderNo);
    }
    
    @GetMapping("/tx/{orderNo}")
    public String txTest(@PathVariable String orderNo) {
        return testService.txTest(orderNo);
    }
    
    @GetMapping("/querysolr/{orderNo}")
    public Map<String, Object> querySolrProduct(@PathVariable String orderNo) {
        return productSolrService.queryProductSolr(orderNo);
    }
    
    @GetMapping("/sendmq/{orderNo}")
    public String sendMessage(@PathVariable String orderNo) {
        return testMqService.sendMessage(orderNo);
    }
    
    @GetMapping("/sendmq1/{orderNo}")
    public String send1Message(@PathVariable String orderNo) {
        return testMqService.send1Message(orderNo);
    }
    
    @GetMapping("/zk/{serverId}")
    public String testZookeeper(@PathVariable String serverId) {
        return zookeeperService.testZookeeper(serverId);
    }
    
    @GetMapping("/redisLock/{key}/{value}")
    public String redisLock(@PathVariable String key, @PathVariable String value) {
        return gouldService.redisLock(key, value);
    }
}
