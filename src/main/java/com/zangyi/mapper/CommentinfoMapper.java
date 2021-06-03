package com.zangyi.mapper;

import java.util.List;

import com.zangyi.common.Commentinfo;
import com.zangyi.common.CommentinfoExample;
import org.apache.ibatis.annotations.Param;

public interface CommentinfoMapper {
    long countByExample(CommentinfoExample example);

    int deleteByExample(CommentinfoExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(Commentinfo record);

    int insertSelective(Commentinfo record);

    List<Commentinfo> selectByExampleWithBLOBs(CommentinfoExample example);

    List<Commentinfo> selectByExample(CommentinfoExample example);

    Commentinfo selectByPrimaryKey(Integer commentId);

    int updateByExampleSelective(@Param("record") Commentinfo record, @Param("example") CommentinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Commentinfo record, @Param("example") CommentinfoExample example);

    int updateByExample(@Param("record") Commentinfo record, @Param("example") CommentinfoExample example);

    int updateByPrimaryKeySelective(Commentinfo record);

    int updateByPrimaryKeyWithBLOBs(Commentinfo record);

    int updateByPrimaryKey(Commentinfo record);
}