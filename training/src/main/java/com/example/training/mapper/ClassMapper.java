package com.example.training.mapper;

import com.example.training.domain.Class;
import com.example.training.domain.ClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassMapper {
    long countByExample(ClassExample example);

    int deleteByExample(ClassExample example);

    int deleteByPrimaryKey(Integer classid);

    int insert(Class row);

    int insertSelective(Class row);

    List<Class> selectByExample(ClassExample example);

    int updateByExampleSelective(@Param("row") Class row, @Param("example") ClassExample example);

    int updateByExample(@Param("row") Class row, @Param("example") ClassExample example);
}