package com.zangyi.service;

import java.util.Map;

public interface UserService {
    Map<String, Object> wxLogin(String encryptedData, String iv, String code);

    public boolean findUser(String openid, Map map);

    public void insertUser(UserInfo userInfo);

    Integer signIn(String nickName);
}
