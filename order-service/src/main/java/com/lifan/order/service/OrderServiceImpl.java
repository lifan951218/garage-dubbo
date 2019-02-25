package com.lifan.order.service;

import com.lifan.order.mapper.OrderInfoMapper;
import com.lifan.order.pojo.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LIFAN
 * 2018/12/24 19:54
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderInfoMapper orderInfoMapper;

    @Override
    public OrderInfo getOrderById(int orderId) {
        return orderInfoMapper.selectById(orderId);
    }

    @Override
    public OrderInfo getOrderByUsername(String username) {
        return orderInfoMapper.selectByUsername(username);
    }

    @Override
    public boolean createOrder(OrderInfo order) {
        boolean result = false;
        if(orderInfoMapper.addOrder(order)>0){
            result = true;
        }
        return result;
    }

    @Override
    public boolean deleteOrder(int orderId) {
        orderInfoMapper.deleteById(orderId);
        return true;
    }




}
