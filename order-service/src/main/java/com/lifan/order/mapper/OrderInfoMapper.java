package com.lifan.order.mapper;

import com.lifan.order.pojo.OrderInfo;
import com.lifan.order.pojo.OrderInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderInfoMapper {
    long countByExample(OrderInfoExample example);

    int deleteByExample(OrderInfoExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    List<OrderInfo> selectByExample(OrderInfoExample example);

    OrderInfo selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
}