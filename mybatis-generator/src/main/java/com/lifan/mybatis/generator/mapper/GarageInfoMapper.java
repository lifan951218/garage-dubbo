package com.lifan.mybatis.generator.mapper;

import com.lifan.mybatis.generator.entity.GarageInfo;
import com.lifan.mybatis.generator.entity.GarageInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}