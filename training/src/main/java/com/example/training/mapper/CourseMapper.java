package com.example.training.mapper;

import com.example.training.domain.Course;
import com.example.training.domain.CourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMapper {
    long countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(Integer courseid);

    int insert(Course row);

    int insertSelective(Course row);

    List<Course> selectByExample(CourseExample example);

    int updateByExampleSelective(@Param("row") Course row, @Param("example") CourseExample example);

    int updateByExample(@Param("row") Course row, @Param("example") CourseExample example);
}