package com.zangyi.mapper;

import com.zangyi.common.CalligraphyVideo;
import com.zangyi.common.CalligraphyVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CalligraphyVideoMapper {
    long countByExample(CalligraphyVideoExample example);

    int deleteByExample(CalligraphyVideoExample example);

    int insert(CalligraphyVideo record);

    int insertSelective(CalligraphyVideo record);

    List<CalligraphyVideo> selectByExample(CalligraphyVideoExample example);

    int updateByExampleSelective(@Param("record") CalligraphyVideo record, @Param("example") CalligraphyVideoExample example);

    int updateByExample(@Param("record") CalligraphyVideo record, @Param("example") CalligraphyVideoExample example);
}