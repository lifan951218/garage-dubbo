package com.lifan.order.service;

import com.lifan.order.mapper.ParkingInfoMapper;
import com.lifan.order.pojo.ParkingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LIFAN
 * 2019/1/8 15:23
 */
@Service("parkingService")
public class ParkingServiceImpl implements ParkingService{

    @Autowired
    ParkingInfoMapper parkingInfoMapper;

    @Override
    public ParkingInfo getParkingById(int parkingId) {
        return parkingInfoMapper.selectById(parkingId);
    }

    @Override
    public ParkingInfo getParkingByUsername(String username) {
        return parkingInfoMapper.selectByUsername(username);
    }

    @Override
    public boolean createParking(ParkingInfo parkingInfo) {
        boolean temp = false;
        if(parkingInfoMapper.addPakingInfo(parkingInfo) > 0){
            temp = true;
        }
        return temp;
    }

    @Override
    public boolean finishParking(String username) {
        parkingInfoMapper.finishParking(username);
        return true;
    }

    @Override
    public boolean deleteParking(int parkingId) {
         parkingInfoMapper.deleteById(parkingId);
         return true;
    }

    @Override
    public void payMoney(String username, String leaveTime, float money) {
        parkingInfoMapper.payMoney(username,leaveTime,money);
    }
}
