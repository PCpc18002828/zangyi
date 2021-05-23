package com.zangyi.mapper;

import com.zangyi.common.MusicPersonList;
import com.zangyi.common.MusicPersonListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MusicPersonListMapper {
    long countByExample(MusicPersonListExample example);

    int deleteByExample(MusicPersonListExample example);

    int insert(MusicPersonList record);

    int insertSelective(MusicPersonList record);

    List<MusicPersonList> selectByExample(MusicPersonListExample example);

    int updateByExampleSelective(@Param("record") MusicPersonList record, @Param("example") MusicPersonListExample example);

    int updateByExample(@Param("record") MusicPersonList record, @Param("example") MusicPersonListExample example);
}