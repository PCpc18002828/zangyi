package com.zangyi.mapper;

import com.zangyi.common.ClothesVideo;
import com.zangyi.common.ClothesVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClothesVideoMapper {
    long countByExample(ClothesVideoExample example);

    int deleteByExample(ClothesVideoExample example);

    int insert(ClothesVideo record);

    int insertSelective(ClothesVideo record);

    List<ClothesVideo> selectByExample(ClothesVideoExample example);

    int updateByExampleSelective(@Param("record") ClothesVideo record, @Param("example") ClothesVideoExample example);

    int updateByExample(@Param("record") ClothesVideo record, @Param("example") ClothesVideoExample example);
}