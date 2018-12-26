package com.lifan.order.service;

import com.lifan.order.mapper.OrderInfoMapper;
import com.lifan.order.pojo.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LIFAN
 * 2018/12/24 19:54
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderInfoMapper orderInfoMapper;

    @Override
    public OrderInfo getOrder(int orderId) {
        return orderInfoMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public boolean createOrder(OrderInfo order) {
        boolean temp = false;
        if(orderInfoMapper.insert(order)>0){
            temp = true;
        }
        return temp;
    }
}
