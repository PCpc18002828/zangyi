package com.zangyi.mapper;

import com.zangyi.common.MusicPersonMusics;
import com.zangyi.common.MusicPersonMusicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MusicPersonMusicsMapper {
    long countByExample(MusicPersonMusicsExample example);

    int deleteByExample(MusicPersonMusicsExample example);

    int insert(MusicPersonMusics record);

    int insertSelective(MusicPersonMusics record);

    List<MusicPersonMusics> selectByExample(MusicPersonMusicsExample example);

    int updateByExampleSelective(@Param("record") MusicPersonMusics record, @Param("example") MusicPersonMusicsExample example);

    int updateByExample(@Param("record") MusicPersonMusics record, @Param("example") MusicPersonMusicsExample example);
}