package com.lifan.garage.mapper;

import com.lifan.garage.pojo.GarageInfo;
import com.lifan.garage.pojo.GarageInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface GarageInfoMapper {
    String TABLE_NAME = "garage_info";
    String INSERT_FIELDS = " latitude, longtitude, address, total_num, free_num, price_per_hour ";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    long countByExample(GarageInfoExample example);

    int deleteByExample(GarageInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GarageInfo record);

    int insertSelective(GarageInfo record);

    List<GarageInfo> selectByExample(GarageInfoExample example);

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where id=#{id}"})
    GarageInfo selectById(int id);

    int updateByExampleSelective(@Param("record") GarageInfo record, @Param("example") GarageInfoExample example);

    int updateByExample(@Param("record") GarageInfo record, @Param("example") GarageInfoExample example);

    int updateByPrimaryKeySelective(GarageInfo record);

    int updateByPrimaryKey(GarageInfo record);

    @Select({"select * from ", TABLE_NAME})
    List<GarageInfo> selectAll();

    @Update({"update" + TABLE_NAME  + " set free_num=free_num-1 where id=#{garageId}"})
    int reduceFreeNum(@Param("garageId") int garageId);

    @Update({"update" + TABLE_NAME  + " set free_num=free_num+1 where id=#{garageId}"})
    int addFreeNum(@Param("garageId") int garageId);
}