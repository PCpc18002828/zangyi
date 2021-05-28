package com.zangyi.common;

import java.util.Date;

public class SignIn {
    private Integer id;

    private String nickname;

    private Date days;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Date getDays() {
        return days;
    }

    public void setDays(Date days) {
        this.days = days;
    }
}