package com.zangyi.mapper;

import com.zangyi.common.SignIn;
import com.zangyi.common.SignInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignInMapper {
    long countByExample(SignInExample example);

    int deleteByExample(SignInExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SignIn record);

    int insertSelective(SignIn record);

    List<SignIn> selectByExample(SignInExample example);

    SignIn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SignIn record, @Param("example") SignInExample example);

    int updateByExample(@Param("record") SignIn record, @Param("example") SignInExample example);

    int updateByPrimaryKeySelective(SignIn record);

    int updateByPrimaryKey(SignIn record);
}