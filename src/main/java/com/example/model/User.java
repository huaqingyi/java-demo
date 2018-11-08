package com.example.model;

public class User {
    private String userName;
    private String password;
    private int userId;
    private String phone;

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(Integer id) {
        this.userId = id;
    }
}
