package com.lifan.order.mapper;

import com.lifan.order.pojo.OrderInfo;
import com.lifan.order.pojo.ParkingInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author LIFAN
 * 2019/1/3 17:11
 */
@Mapper
public interface ParkingInfoMapper {
    String TABLE_NAME = " parking_info ";
    String INSERT_FIELDS = " username, car_num, garage_num, cp_num, finish_parking, confirm_parking, " +
            "action_time, order_time, start_time, leave_time, money, pay_status, confirm_out ";
    String SELECT_FIELDS = " parking_id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{username},#{carNum},#{garageNum},#{cpNum},#{finishParking},#{confirmParking}," +
              "#{actionTime},#{orderTime},#{startTime},#{leaveTime},#{money},#{payStatus},#{confirmOut})"})
    int addPakingInfo(ParkingInfo parkingInfo);

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where parking_id=#{id}"})
    ParkingInfo selectById(int id);

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where username=#{username}"})
    ParkingInfo selectByUsername(String username);

    @Select({"select * from ", TABLE_NAME})
    List<ParkingInfo> selectAll();

    @Update({"update ", TABLE_NAME, " set finish_parking=1, confirm_parking=1 where username=#{username}"})
    void finishParking(String username);

    @Update({"update ", TABLE_NAME, " set leave_time=#{leaveTime}, money=#{money} where username=#{username}"})
    void payMoney(@Param("username") String username,@Param("leaveTime") String leaveTime,@Param("money") float money);

    @Delete({"delete from ", TABLE_NAME, " where parking_id=#{id}"})
    void deleteById(int id);

}
