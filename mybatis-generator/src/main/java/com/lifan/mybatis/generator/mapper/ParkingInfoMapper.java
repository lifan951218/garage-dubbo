package com.lifan.mybatis.generator.mapper;

import com.lifan.mybatis.generator.entity.ParkingInfo;
import com.lifan.mybatis.generator.entity.ParkingInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParkingInfoMapper {
    long countByExample(ParkingInfoExample example);

    int deleteByExample(ParkingInfoExample example);

    int deleteByPrimaryKey(Integer parkingId);

    int insert(ParkingInfo record);

    int insertSelective(ParkingInfo record);

    List<ParkingInfo> selectByExample(ParkingInfoExample example);

    ParkingInfo selectByPrimaryKey(Integer parkingId);

    int updateByExampleSelective(@Param("record") ParkingInfo record, @Param("example") ParkingInfoExample example);

    int updateByExample(@Param("record") ParkingInfo record, @Param("example") ParkingInfoExample example);

    int updateByPrimaryKeySelective(ParkingInfo record);

    int updateByPrimaryKey(ParkingInfo record);
}