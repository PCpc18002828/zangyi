package com.zangyi.mapper;

import com.zangyi.common.MusicVideo;
import com.zangyi.common.MusicVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MusicVideoMapper {
    long countByExample(MusicVideoExample example);

    int deleteByExample(MusicVideoExample example);

    int insert(MusicVideo record);

    int insertSelective(MusicVideo record);

    List<MusicVideo> selectByExample(MusicVideoExample example);

    int updateByExampleSelective(@Param("record") MusicVideo record, @Param("example") MusicVideoExample example);

    int updateByExample(@Param("record") MusicVideo record, @Param("example") MusicVideoExample example);
}