package com.lifan.order.service;

import com.lifan.order.pojo.OrderInfo;

/**
 * @author LIFAN
 * 2018/12/24 19:47
 */
public interface OrderService {
    /**
     * @Description: 根据订单id查询订单
     */
    public OrderInfo getOrder(int orderId);

    /**
     * @Description: 创建订单
     */
    public boolean createOrder(OrderInfo order);
}
