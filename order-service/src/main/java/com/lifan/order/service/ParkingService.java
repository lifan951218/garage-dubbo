package com.lifan.order.service;

import com.lifan.order.pojo.ParkingInfo;

/**
 * @author LIFAN
 * 2019/1/3 17:25
 */
public interface ParkingService {
    /**
     * @Description: 根据停车id查询停车信息
     */
    public ParkingInfo getParkingById(int parkingId);

    /**
     * @Description: 根据用户名查询停车信息
     */
    public ParkingInfo getParkingByUsername(String username);

    /**
     * @Description: 创建停车信息
     */
    public boolean createParking(ParkingInfo parkingInfo);

    /**
     * @Description: 已停好车
     */
    public boolean finishParking(String username);

    /**
     * @Description: 删除订单
     */
    public boolean deleteParking(int parkingId);

    /**
     * @Description: 计算停车费用
     */
    public void payMoney( String username,String leaveTime,float money);
}
