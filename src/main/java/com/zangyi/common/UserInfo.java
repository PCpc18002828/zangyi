package com.zangyi.common;

import java.util.Date;

public class UserInfo {
    private String openid;

    private String nickname;

    private Integer gender;

    private String city;

    private String country;

    private String province;

    private String avatarurl;

    private Date setTime;

    private Date lastSign;

    private Integer signSum;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    public Date getSetTime() {
        return setTime;
    }

    public void setSetTime(Date setTime) {
        this.setTime = setTime;
    }

    public Date getLastSign() {
        return lastSign;
    }

    public void setLastSign(Date lastSign) {
        this.lastSign = lastSign;
    }

    public Integer getSignSum() {
        return signSum;
    }

    public void setSignSum(Integer signSum) {
        this.signSum = signSum;
    }

    public UserInfo(String openid, String nickname, Integer gender, String city, String country, String province, String avatarurl, Date setTime, Date lastSign, Integer signSum) {
        this.openid = openid;
        this.nickname = nickname;
        this.gender = gender;
        this.city = city;
        this.country = country;
        this.province = province;
        this.avatarurl = avatarurl;
        this.setTime = setTime;
        this.lastSign = lastSign;
        this.signSum = signSum;
    }

    public UserInfo() {
    }

}