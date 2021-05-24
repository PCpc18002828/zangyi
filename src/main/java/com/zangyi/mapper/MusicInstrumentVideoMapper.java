package com.zangyi.mapper;

import com.zangyi.common.MusicInstrumentVideo;
import com.zangyi.common.MusicInstrumentVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MusicInstrumentVideoMapper {
    long countByExample(MusicInstrumentVideoExample example);

    int deleteByExample(MusicInstrumentVideoExample example);

    int insert(MusicInstrumentVideo record);

    int insertSelective(MusicInstrumentVideo record);

    List<MusicInstrumentVideo> selectByExample(MusicInstrumentVideoExample example);

    int updateByExampleSelective(@Param("record") MusicInstrumentVideo record, @Param("example") MusicInstrumentVideoExample example);

    int updateByExample(@Param("record") MusicInstrumentVideo record, @Param("example") MusicInstrumentVideoExample example);
}