package com.zangyi.mapper;

import com.zangyi.common.Commentreplyinfo;
import com.zangyi.common.CommentreplyinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentreplyinfoMapper {
    long countByExample(CommentreplyinfoExample example);

    int deleteByExample(CommentreplyinfoExample example);

    int insert(Commentreplyinfo record);

    int insertSelective(Commentreplyinfo record);

    List<Commentreplyinfo> selectByExample(CommentreplyinfoExample example);

    int updateByExampleSelective(@Param("record") Commentreplyinfo record, @Param("example") CommentreplyinfoExample example);

    int updateByExample(@Param("record") Commentreplyinfo record, @Param("example") CommentreplyinfoExample example);
}