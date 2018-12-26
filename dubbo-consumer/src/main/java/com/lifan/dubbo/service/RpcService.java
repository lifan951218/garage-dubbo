package com.lifan.dubbo.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.lifan.garage.pojo.GarageInfo;
import com.lifan.garage.service.GarageInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LIFAN
 * 2018/12/25 14:34
 */
@Service
public class RpcService {
    @Reference()
    private GarageInfoService garageInfoService;

    public GarageInfo getGarageInfo(int garageId) {
        return garageInfoService.getGarageInfo(garageId);
    }
}
