package com.zangyi.service;

import com.zangyi.common.UserInfo;
import com.zangyi.common.extend.UserInfoBase;

import java.util.Map;

public interface UserService {
    Map<String, Object> wxLogin(String encryptedData, String iv, String code, UserInfoBase userInfoBase);

    public boolean findUser(String openid, Map map);

    public void insertUser(UserInfo userInfo);

    Integer signIn(String nickName);

    Map<String, Object> getSignIn(String nickName);
}
