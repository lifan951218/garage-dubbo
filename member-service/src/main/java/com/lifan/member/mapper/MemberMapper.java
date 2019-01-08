package com.lifan.member.mapper;

import com.lifan.member.pojo.Member;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author LIFAN
 * 2018/12/26 16:11
 */
@Mapper
public interface MemberMapper {
    String TABLE_NAME = " member ";
    String INSERT_FIELDS = " username, password, car_num, car_type, status";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{username},#{password},#{carNum},#{carType},#{status})"})
    int addUser(Member member);

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where id=#{id}"})
    Member selectById(int id);

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where username=#{username}"})
    Member selectByUsername(String username);

    @Select({"select * from ", TABLE_NAME})
    List<Member> selectAll();

    @Update({"update ", TABLE_NAME, " set password=#{password} where id=#{id}"})
    void changePassword(String password , int id);

    @Update({"update ", TABLE_NAME, " set car_num=#{carNum}, car_type=#{carType} where username=#{username}"})
    void changeCarInfo(@Param("username") String username, @Param("carType") String carType, @Param("carNum") String carNum);

    @Delete({"delete from ", TABLE_NAME, " where id=#{id}"})
    void deleteById(int id);



}
