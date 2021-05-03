package com.zangyi.common;

public class User {
    private Integer id;

    private String userName;

    private String userPassword;

    private Integer userAge;

    private String userSer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserSer() {
        return userSer;
    }

    public void setUserSer(String userSer) {
        this.userSer = userSer == null ? null : userSer.trim();
    }

    public User() {
    }

    public User(Integer id, String userName, String userPassword, Integer userAge, String userSer) {
        this.id = id;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userAge = userAge;
        this.userSer = userSer;
    }
}