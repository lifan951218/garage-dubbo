package com.lifan.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lifan.dubbo.service.RpcService;
import com.lifan.garage.pojo.GarageInfo;
import com.lifan.garage.service.GarageInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * @author LIFAN
 * 2018/12/20 16:44
 */
@RestController
@RequestMapping("/garage")
public class DubboConsumerController {

    @Autowired
    private GarageInfoService garageInfoService;

//    @Autowired
//    private RpcService rpcService;
    //车库总览
    @RequestMapping(value = "/get_garage_info",method = {RequestMethod.GET})
    public void getGarageInfo(@RequestParam("garageId") Integer garageId,
                              @RequestParam("num") int num) {
        garageInfoService.reduceFreeNum(garageId,num);
    }


}
