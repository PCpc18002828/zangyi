package com.zangyi.mapper;

import com.zangyi.common.musicInstrumentVideo;
import com.zangyi.common.musicInstrumentVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface musicInstrumentVideoMapper {
    long countByExample(musicInstrumentVideoExample example);

    int deleteByExample(musicInstrumentVideoExample example);

    int insert(musicInstrumentVideo record);

    int insertSelective(musicInstrumentVideo record);

    List<musicInstrumentVideo> selectByExample(musicInstrumentVideoExample example);

    int updateByExampleSelective(@Param("record") musicInstrumentVideo record, @Param("example") musicInstrumentVideoExample example);

    int updateByExample(@Param("record") musicInstrumentVideo record, @Param("example") musicInstrumentVideoExample example);
}