package com.lifan.garage.controller;

import com.lifan.garage.pojo.GarageInfo;
import com.lifan.garage.service.GarageInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author LIFAN
 * 2018/12/20 16:44
 */
@RestController
@RequestMapping("/garage")
public class GarageController {

    /*@Autowired
    private GarageInfoService garageInfoService;

    //    @Autowired
//    private RpcService rpcService;
    //车库总览
    @RequestMapping(value = "/get_garage_info",method = {RequestMethod.GET})
    public GarageInfo getGarageInfo(@RequestParam("garageId") int garageId,
                                    @RequestParam("num") int num) {
        //garageInfoService.addFreeNum(garageId);
        return garageInfoService.getGarageInfo(garageId);
    }*/


}