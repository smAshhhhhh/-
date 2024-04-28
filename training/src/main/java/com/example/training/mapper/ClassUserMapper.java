package com.example.training.mapper;

import com.example.training.domain.ClassUserExample;
import com.example.training.domain.ClassUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassUserMapper {
    long countByExample(ClassUserExample example);

    int deleteByExample(ClassUserExample example);

    int deleteByPrimaryKey(ClassUserKey key);

    int insert(ClassUserKey row);

    int insertSelective(ClassUserKey row);

    List<ClassUserKey> selectByExample(ClassUserExample example);

    int updateByExampleSelective(@Param("row") ClassUserKey row, @Param("example") ClassUserExample example);

    int updateByExample(@Param("row") ClassUserKey row, @Param("example") ClassUserExample example);
}