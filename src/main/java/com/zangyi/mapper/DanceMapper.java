package com.zangyi.mapper;

import com.zangyi.common.Dance;
import com.zangyi.common.DanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DanceMapper {
    long countByExample(DanceExample example);

    int deleteByExample(DanceExample example);

    int insert(Dance record);

    int insertSelective(Dance record);

    List<Dance> selectByExample(DanceExample example);

    int updateByExampleSelective(@Param("record") Dance record, @Param("example") DanceExample example);

    int updateByExample(@Param("record") Dance record, @Param("example") DanceExample example);
}