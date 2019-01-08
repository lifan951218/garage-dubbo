package com.lifan.garage.service;

import com.lifan.garage.mapper.GarageInfoMapper;
import com.lifan.garage.pojo.GarageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author LIFAN
 * 2018/12/24 16:33
 */
//@com.alibaba.dubbo.config.annotation.Service
@Service("garageInfoService")
public class GarageInfoServiceImpl implements GarageInfoService{
    @Autowired
    private GarageInfoMapper garageInfoMapper;

    @Override
    public List<GarageInfo> getAllGarage(){
        return garageInfoMapper.selectAll();
    }

    @Override
    public GarageInfo getGarageInfo(int garageId){
        return garageInfoMapper.selectById(garageId);
    }

    @Override
    public int getFreeNum(int garageId){
        GarageInfo garageInfo = garageInfoMapper.selectById(garageId);
        return garageInfo.getFreeNum();
    }

    @Override
    public void reduceFreeNum(int garageId,int num){
        garageInfoMapper.reduceFreeNum(garageId,num);
    }

    @Override
    public void addFreeNum(int garageId){
        garageInfoMapper.addFreeNum(garageId);
    }

}
