package com.zangyi.mapper;

import com.zangyi.common.ZangXiVideo;
import com.zangyi.common.ZangXiVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZangXiVideoMapper {
    long countByExample(ZangXiVideoExample example);

    int deleteByExample(ZangXiVideoExample example);

    int insert(ZangXiVideo record);

    int insertSelective(ZangXiVideo record);

    List<ZangXiVideo> selectByExample(ZangXiVideoExample example);

    int updateByExampleSelective(@Param("record") ZangXiVideo record, @Param("example") ZangXiVideoExample example);

    int updateByExample(@Param("record") ZangXiVideo record, @Param("example") ZangXiVideoExample example);
}