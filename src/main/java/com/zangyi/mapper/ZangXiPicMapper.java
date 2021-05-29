package com.zangyi.mapper;

import com.zangyi.common.ZangXiPic;
import com.zangyi.common.ZangXiPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZangXiPicMapper {
    long countByExample(ZangXiPicExample example);

    int deleteByExample(ZangXiPicExample example);

    int insert(ZangXiPic record);

    int insertSelective(ZangXiPic record);

    List<ZangXiPic> selectByExample(ZangXiPicExample example);

    int updateByExampleSelective(@Param("record") ZangXiPic record, @Param("example") ZangXiPicExample example);

    int updateByExample(@Param("record") ZangXiPic record, @Param("example") ZangXiPicExample example);
}