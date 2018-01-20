package com.ykly.controller;

import com.ykly.entity.ResMsg;
import com.ykly.entity.request.geocoding.GeoCoding;
import com.ykly.entity.request.pathplanning.DistanceMeasurement;
import com.ykly.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;

/**
 * Created by huangmingjie on 2017/12/2.
 */
@RestController
@RequestMapping(value = "/gould")
@Api(value = "高德信息", description = "高德信息")
@Validated
public class GouldController {
    
    private static final Logger logger = LoggerFactory.getLogger(GouldController.class);
    
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
    
    @ApiOperation(value = ">_<")
    @ApiIgnore
    @GetMapping("/")
    public String hello() {
        return String.join(" ", "Hello", "!");
    }
    
    @PostMapping(value = "/distance")
    @ApiOperation(value = "查询坐标点距离", notes = "查询坐标点距离")
    public ResMsg getDistanceMeasurement(@RequestBody @Valid DistanceMeasurement distanceMeasurement, BindingResult bindingResult) {
        return gouldService.getDistanceMeasurement(distanceMeasurement, bindingResult);
    }
    
    @PostMapping("/geo")
    @ApiOperation(value = "坐标", notes = "坐标")
    public ResMsg getGeoCoding(GeoCoding geoCoding) {
        return gouldService.getGeoCoding(geoCoding);
    }
    
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名字", required = true, paramType = "query"),
            @ApiImplicitParam(name = "userId", value = "用户ID", required = true, paramType = "query"),
            @ApiImplicitParam(name = "cinemaNo", value = "影院名称", required = true, paramType = "query"),
            @ApiImplicitParam(name = "cinemaLinkId", value = "影院ID", required = true, paramType = "query")
    })
    @RequestMapping(value = "/get/{name}")
    public ResMsg getString(@RequestHeader(value = "X-Request-Id", required = false, defaultValue = "") String requestId,
                            @PathVariable String name,
                            @RequestParam(value = "userId", required = true) String userId,
                            @NotNull(message = "Required String parameter 'cinemaNo' is not present") String cinemaNo,
                            String cinemaLinkId) {
        logger.info(requestId + name + userId + cinemaNo + cinemaLinkId);
        return gouldService.getString(name);
    }
    
    @RequestMapping(value = "/get1/{name}")
    public ResMsg getString1(@RequestHeader(value = "X-Request-Id", required = false, defaultValue = "") String requestId,
                             @PathVariable String name,
                             @RequestParam(value = "userId") String userId,
                             String cinemaNo,
                             String cinemaLinkId) {
        logger.info(requestId + name + userId + cinemaNo + cinemaLinkId);
        return ResMsg.succWithData("succ");
    }
    
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "key", required = true, paramType = "query"),
            @ApiImplicitParam(name = "value", value = "value", required = true, paramType = "query")
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
    //@Validated 单参数校验不正确
}
