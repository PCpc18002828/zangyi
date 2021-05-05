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

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
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
        this.city = city == null ? null : city.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl == null ? null : avatarurl.trim();
    }

    public Date getSetTime() {
        return setTime;
    }

    public void setSetTime(Date setTime) {
        this.setTime = setTime;
    }

    public UserInfo() {
    }

    public UserInfo(String openid, String nickname, Integer gender, String city, String country, String province, String avatarurl, Date setTime) {
        this.openid = openid;
        this.nickname = nickname;
        this.gender = gender;
        this.city = city;
        this.country = country;
        this.province = province;
        this.avatarurl = avatarurl;
        this.setTime = setTime;
    }
}