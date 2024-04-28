package com.example.training.mapper;

import com.example.training.domain.ClassCourseExample;
import com.example.training.domain.ClassCourseKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassCourseMapper {
    long countByExample(ClassCourseExample example);

    int deleteByExample(ClassCourseExample example);

    int deleteByPrimaryKey(ClassCourseKey key);

    int insert(ClassCourseKey row);

    int insertSelective(ClassCourseKey row);

    List<ClassCourseKey> selectByExample(ClassCourseExample example);

    int updateByExampleSelective(@Param("row") ClassCourseKey row, @Param("example") ClassCourseExample example);

    int updateByExample(@Param("row") ClassCourseKey row, @Param("example") ClassCourseExample example);
}