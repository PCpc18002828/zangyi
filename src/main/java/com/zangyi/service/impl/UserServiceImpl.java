package com.zangyi.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zangyi.common.UserInfo;
import com.zangyi.common.UserInfoExample;
import com.zangyi.mapper.UserInfoMapper;
import com.zangyi.service.UserService;
import com.zangyi.utils.AesCbcUtil;
import com.zangyi.utils.HttpRequest;
import com.zangyi.utils.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class  UserServiceImpl implements UserService {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public Map<String, Object> wxLogin(String encryptedData, String iv, String code) {
        System.out.println("this is encry:" + encryptedData + "\n This is iv:" + iv);
        Map map = new HashMap();

        //登录凭证不能为空
        if (code == null || code.length() == 0) {
            map.put("status", 0);
            map.put("msg", "code 不能为空");
            return map;
        }
        System.out.println("This is code:" + code);
        //1.向微信服务器 使用微信登录凭证code获取session_key和openid
        //请求参数
        String appid = "wxebe558f7fd21181c";
        String secret = "12f5e023bd74e11dddccfd051e249130";
        String url = "https://api.weixin.qq.com/sns/jscode2session?" +
                "appid=" + appid + "" +
                "&secret=" + secret + "" +
                "&js_code=" + code + "&grant_type=authorization_code";
        //发送请求
        String str = HttpRequest.sendGet(url);
        //解析内容·
        JSONObject json = JSONObject.parseObject(str);
        //获取会话密钥（session_key）
        String session_key = json.get("session_key").toString();
        //用户的唯一标识
        String openid = (String) json.get("openid");
//        System.out.println("This is openid:"+openid+"    This is session_key:"+session_key);
        //自定义token
        String token = openid + Time.getNow();
        //对openid进行查询，是否存在
        if (findUser(openid, map)) {
            map.put("token", token);
            map.put("status", 1);
//            map.put("userInfo", wUserInformation);在findUser中已执行
            return map;

        } else {
            //2.对encryptedData加密数据进行AES解密
            try {
                System.out.println("——————————————————解密————————————————————————");
                Map<String, String> result = AesCbcUtil.decrypt(encryptedData, session_key, iv);
                if (null != result && result.size() > 0) {
                    map.put("status", 1);
                    map.put("mag", "解密成功");
                    JSONObject userInfoJSON = JSONObject.parseObject(JSONObject.toJSONString(result));
                    UserInfo userInfo = new UserInfo();

                    userInfo.setOpenid(userInfoJSON.get("openId").toString());
                    userInfo.setNickname(userInfoJSON.get("nickName").toString());
                    userInfo.setGender(Integer.parseInt(userInfoJSON.get("gender").toString()));
                    userInfo.setCity(userInfoJSON.get("city").toString());
                    userInfo.setCountry(userInfoJSON.get("country").toString());
                    userInfo.setProvince(userInfoJSON.get("province").toString());
                    userInfo.setProvince(userInfoJSON.get("avatarUrl").toString());
                    //数据库中添加用户相关信息
                    insertUser(userInfo);
                    map.put("userInfo", userInfo);
                    map.put("token", token);
                    //记录token
                    return map;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        map.put("status", 0);
        map.put("msg", "解密失败");
        return map;
    }

    @Override
    public boolean findUser(String openid, Map map) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andOpenidEqualTo(openid);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        //找到用户，map中加入用户信息
        if (userInfos.size() != 0) {
            UserInfo userInfo = new UserInfo();
            userInfo.setOpenid(userInfos.get(0).getOpenid());
            userInfo.setNickname(userInfos.get(0).getNickname());
            userInfo.setGender(userInfos.get(0).getGender());
            userInfo.setCity(userInfos.get(0).getCity());
            userInfo.setCountry(userInfos.get(0).getCountry());
            userInfo.setProvince(userInfos.get(0).getProvince());
            userInfo.setProvince(userInfos.get(0).getProvince());
            //数据库中添加用户相关信息
            insertUser(userInfo);
            map.put("userInfo", userInfo);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void insertUser(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }
}
