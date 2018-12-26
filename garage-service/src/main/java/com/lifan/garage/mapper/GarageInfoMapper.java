package com.lifan.garage.mapper;

import com.lifan.garage.pojo.GarageInfo;
import com.lifan.garage.pojo.GarageInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface GarageInfoMapper {
    long countByExample(GarageInfoExample example);

    int deleteByExample(GarageInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GarageInfo record);

    int insertSelective(GarageInfo record);

    List<GarageInfo> selectByExample(GarageInfoExample example);

    GarageInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GarageInfo record, @Param("example") GarageInfoExample example);

    int updateByExample(@Param("record") GarageInfo record, @Param("example") GarageInfoExample example);

    int updateByPrimaryKeySelective(GarageInfo record);

    int updateByPrimaryKey(GarageInfo record);

    @Update({"update garage_info set free_num=#{num} where id=#{garageId}"})
    int reduceFreeNum(@Param("garageId") int garageId, @Param("num") int num);

    int addFreeNum(@Param("garageId") int garageId);
}