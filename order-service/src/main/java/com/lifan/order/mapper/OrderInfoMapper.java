package com.lifan.order.mapper;

import com.lifan.order.pojo.OrderInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderInfoMapper {
    String TABLE_NAME = " order_info ";
    String INSERT_FIELDS = " username, car_num, garage_num, action_time, start_time";
    String SELECT_FIELDS = " order_id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{username},#{carNum},#{garageNum},#{actionTime},#{startTime})"})
    int addOrder(OrderInfo orderInfo);

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where order_id=#{id}"})
    OrderInfo selectById(int id);

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where username=#{username}"})
    OrderInfo selectByUsername(String username);

    @Select({"select * from ", TABLE_NAME})
    List<OrderInfo> selectAll();

    @Delete({"delete from ", TABLE_NAME, " where order_id=#{id}"})
    void deleteById(int id);

}
