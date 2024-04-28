package com.example.training.mapper;

import com.example.training.domain.Base;
import com.example.training.domain.BaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMapper {
    long countByExample(BaseExample example);

    int deleteByExample(BaseExample example);

    int deleteByPrimaryKey(Integer baseid);

    int insert(Base row);

    int insertSelective(Base row);

    List<Base> selectByExample(BaseExample example);

    Base selectByPrimaryKey(Integer baseid);

    int updateByExampleSelective(@Param("row") Base row, @Param("example") BaseExample example);

    int updateByExample(@Param("row") Base row, @Param("example") BaseExample example);

    int updateByPrimaryKeySelective(Base row);

    int updateByPrimaryKey(Base row);
}