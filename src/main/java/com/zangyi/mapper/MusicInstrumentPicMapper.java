package com.zangyi.mapper;

import com.zangyi.common.MusicInstrumentPic;
import com.zangyi.common.MusicInstrumentPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MusicInstrumentPicMapper {
    long countByExample(MusicInstrumentPicExample example);

    int deleteByExample(MusicInstrumentPicExample example);

    int insert(MusicInstrumentPic record);

    int insertSelective(MusicInstrumentPic record);

    List<MusicInstrumentPic> selectByExample(MusicInstrumentPicExample example);

    int updateByExampleSelective(@Param("record") MusicInstrumentPic record, @Param("example") MusicInstrumentPicExample example);

    int updateByExample(@Param("record") MusicInstrumentPic record, @Param("example") MusicInstrumentPicExample example);
}