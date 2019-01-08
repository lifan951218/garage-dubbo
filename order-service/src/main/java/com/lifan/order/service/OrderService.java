package com.lifan.order.service;

import com.lifan.order.pojo.OrderInfo;

/**
 * @author LIFAN
 * 2018/12/24 19:47
 */
public interface OrderService {
    /**
     * @Description: 根据预约id查询预约信息
     */
    public OrderInfo getOrderById(int orderId);

    /**
     * @Description: 根据用户名查询预约信息
     */
    public OrderInfo getOrderByUsername(String username);

    /**
     * @Description: 创建预约信息
     */
    public boolean createOrder(OrderInfo order);

    /**
     * @Description: 取消预约
     */
    public boolean deleteOrder(int orderId);
}
