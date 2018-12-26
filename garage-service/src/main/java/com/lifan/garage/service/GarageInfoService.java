package com.lifan.garage.service;

import com.lifan.garage.pojo.GarageInfo;

/**
 * @author LIFAN
 * 2018/12/25 13:22
 */
public interface GarageInfoService {

    GarageInfo getGarageInfo(int garageId);

    int getFreeNum(int garageId);

    void reduceFreeNum(int garageId,int num);

    void addFreeNum(int garageId);
}
