package com.lifan.dubbo.consumer.controller;

import com.alibaba.dubbo.common.json.JSON;
import com.lifan.common.utils.JSONResult;
import com.lifan.dubbo.consumer.lock.impl.JedisLock;
import com.lifan.garage.pojo.GarageInfo;
import com.lifan.garage.service.GarageInfoService;
import com.lifan.member.pojo.Member;
import com.lifan.member.service.MemberService;
import com.lifan.order.pojo.OrderInfo;
import com.lifan.order.pojo.ParkingInfo;
import com.lifan.order.service.OrderService;
import com.lifan.order.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LIFAN
 * 2019/1/2 15:01
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private MemberService memberService;

    @Autowired
    private GarageInfoService garageInfoService;

    @Autowired
    private ParkingService parkingService;

    private static final String LOCK_NO = "redis_lock_no_";

    //预约
    @RequestMapping(value = "/add_order",method = {RequestMethod.POST})
    public String addOrder(@RequestParam("username") String username,
                           @RequestParam("garageNum") int garageNum,
                           @RequestParam("startTime") String startTime) {
        if(orderService.getOrderByUsername(username) == null) {
            JedisLock lock = new JedisLock(LOCK_NO + "add");
            if (lock.acquire()) {
                try{
                    if (garageInfoService.getFreeNum(garageNum) > 0) {
                        Member member = memberService.getMemberByUsername(username);
                        OrderInfo orderInfo = new OrderInfo();
                        orderInfo.setUsername(username);
                        orderInfo.setCarNum(member.getCarNum());
                        orderInfo.setStartTime(startTime);
                        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式
                        orderInfo.setActionTime(df.format(new Date()));
                        orderInfo.setGarageNum(garageNum);
                        orderService.createOrder(orderInfo);
                        garageInfoService.reduceFreeNum(garageNum);
                        return "1";
                    }
                    return "0";
                } finally {
                    lock.release();
                }
            }

        }
        return "0";
    }

    //获得预约信息
    @RequestMapping(value = "/get_order",method = {RequestMethod.GET})
    public JSONResult getOrder(@RequestParam("username") String username) {

        OrderInfo orderInfo = orderService.getOrderByUsername(username);
        if(orderInfo ==null){
            return JSONResult.errorMsg("您还没有预约");
        }
        GarageInfo garageInfo = garageInfoService.getGarageInfo(orderInfo.getGarageNum());
        Map<String, Object> info = new HashMap<>();
        info.put("order_info",orderInfo);
        info.put("garage_info",garageInfo);
        return JSONResult.ok(info);
    }

    //取消预约
    @RequestMapping(value = "/delete_order",method = {RequestMethod.POST})
    public String deleteOrder(@RequestParam("orderId") int orderId,
                              @RequestParam("garageNum") int garageNum) {
        JedisLock lock = new JedisLock(LOCK_NO + "delete");
        if (lock.acquire()) {
            try{
                orderService.deleteOrder(orderId);
                garageInfoService.addFreeNum(garageNum);
                return "1";
            } finally {
                lock.release();
            }
        }
        return "1";
    }

    //获得停车订单信息
    @RequestMapping(value = "/get_parking_info",method = {RequestMethod.GET})
    public JSONResult getPakingInfo(@RequestParam("username") String username) {

        ParkingInfo parkingInfo = parkingService.getParkingByUsername(username);
        if(parkingInfo == null){
            return JSONResult.errorMsg("您还没有停车订单");
        }
        GarageInfo garageInfo = garageInfoService.getGarageInfo(parkingInfo.getGarageNum());
        Map<String, Object> info = new HashMap<>();
        info.put("parking_info",parkingInfo);
        info.put("garage_info",garageInfo);
        return JSONResult.ok(info);
    }

    //已停好车处理
    @RequestMapping(value = "/finish_parking",method = {RequestMethod.POST})
    public JSONResult finishParking(@RequestParam("username") String username) {
        parkingService.finishParking(username);
        return JSONResult.ok();
    }

    //支付界面
    @RequestMapping(value = "/pay_money",method = {RequestMethod.POST})
    public JSONResult payMoney(@RequestParam("username") String username) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式
        String leaveTime = df.format(new Date());
        float money = 0.01f;
        parkingService.payMoney(username,leaveTime,money);
        Map<String, Object> info = new HashMap<>();
        info.put("leaveTime",leaveTime);
        info.put("money",money);
        return JSONResult.ok(info);
    }
}
