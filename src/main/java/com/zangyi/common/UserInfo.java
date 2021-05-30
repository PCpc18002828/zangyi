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

    @Override
    public String toString() {
        return "UserInfo{" +
                "openid='" + openid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", gender=" + gender +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", avatarurl='" + avatarurl + '\'' +
                ", setTime=" + setTime +
                ", lastSign=" + lastSign +
                ", signSum=" + signSum +
                '}';
    }
}