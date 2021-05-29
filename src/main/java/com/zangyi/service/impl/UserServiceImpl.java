package com.zangyi.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zangyi.common.SignIn;
import com.zangyi.common.SignInExample;
import com.zangyi.common.UserInfo;
import com.zangyi.common.UserInfoExample;
import com.zangyi.mapper.SignInMapper;
import com.zangyi.mapper.UserInfoMapper;
import com.zangyi.service.UserService;
import com.zangyi.utils.AesCbcUtil;
import com.zangyi.utils.HttpRequest;
import com.zangyi.utils.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    SignInMapper signInMapper;

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
            map.put("msg", "用户已存在");
//            map.put("userInfo", wUserInformation);在findUser中已执行
            return map;

        } else {
            //2.对encryptedData加密数据进行AES解密
            try {
                System.out.println("——————————————————解密————————————————————————");
                Map<String, String> result = AesCbcUtil.decrypt(encryptedData, session_key, iv);
                if (null != result && result.size() > 0) {
                    map.put("status", 1);
                    map.put("msg", "解密成功");
                    JSONObject userInfoJSON = JSONObject.parseObject(JSONObject.toJSONString(result));
                    UserInfo userInfo = new UserInfo();
                    System.out.println("userJson" + userInfoJSON);
                    userInfo.setOpenid(userInfoJSON.get("openId").toString());
                    userInfo.setNickname(userInfoJSON.get("nickName").toString());
                    userInfo.setGender(Integer.parseInt(userInfoJSON.get("gender").toString()));
                    userInfo.setCity(userInfoJSON.get("city").toString());
                    userInfo.setCountry(userInfoJSON.get("country").toString());
                    userInfo.setProvince(userInfoJSON.get("province").toString());
                    userInfo.setAvatarurl(userInfoJSON.get("avatarUrl").toString());
                    userInfo.setSignSum(0);
                    userInfo.setSetTime(new Date());
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
            userInfo.setAvatarurl(userInfos.get(0).getAvatarurl());
            userInfo.setSetTime(new Date());
            map.put("userInfo", userInfo);
            System.out.println(userInfo);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void insertUser(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public Integer signIn(String nickName) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date nowDay = new Date();
        String sNowDay = simpleDateFormat.format(nowDay);
        String sLastDay = "";
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andNicknameEqualTo(nickName);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        sLastDay = simpleDateFormat.format(userInfos.get(0).getLastSign());
        if (sNowDay.equals(sLastDay)) {
            return 1;
        }
//      更新用户表签到记录
        UserInfo userInfo = new UserInfo();
        userInfo.setLastSign(nowDay);
        userInfo.setSignSum(userInfos.get(0).getSignSum() + 1);
        userInfoMapper.updateByExampleSelective(userInfo, userInfoExample);
//       签到表添加记录
        SignIn signIn = new SignIn();
        signIn.setNickname(nickName);
        signIn.setDays(nowDay);
        signInMapper.insertSelective(signIn);
        return 0;
    }

    @Override
    public Map<String, Object> getSignIn(String nickName) {
        Map<String,Object> map = new HashMap<String, Object>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormatd = new SimpleDateFormat("MM");
        int nowMonth =Integer.parseInt(simpleDateFormatd.format(new Date()));
        String[] sign = new String[31];
        SignInExample signInExample = new SignInExample();
        signInExample.createCriteria().andNicknameEqualTo(nickName);
        List<SignIn> signIns = signInMapper.selectByExample(signInExample);

        for (int i = signIns.size()-1, j = 31; i >= 0&&j>=0; i--,j--) {
            String signDay = simpleDateFormat.format(signIns.get(i).getDays());
            String[] split = signDay.split("-");
            int month = Integer.parseInt(split[1]);
            int day =Integer.parseInt(split[2]);
            if(month==nowMonth){
                sign[day-1] =signDay;
            }
        }
        map.put("signUp",sign);
        UserInfoExample userInfoExample =new UserInfoExample();
        userInfoExample.createCriteria().andNicknameEqualTo(nickName);
        UserInfo userInfo = userInfoMapper.selectByExample(userInfoExample).get(0);
        map.put("count",userInfo.getSignSum());
        return map;
    }
}
