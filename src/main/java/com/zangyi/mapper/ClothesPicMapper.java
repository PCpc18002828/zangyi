package com.zangyi.mapper;

import com.zangyi.common.ClothesPic;
import com.zangyi.common.ClothesPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClothesPicMapper {
    long countByExample(ClothesPicExample example);

    int deleteByExample(ClothesPicExample example);

    int insert(ClothesPic record);

    int insertSelective(ClothesPic record);

    List<ClothesPic> selectByExample(ClothesPicExample example);

    int updateByExampleSelective(@Param("record") ClothesPic record, @Param("example") ClothesPicExample example);

    int updateByExample(@Param("record") ClothesPic record, @Param("example") ClothesPicExample example);
}