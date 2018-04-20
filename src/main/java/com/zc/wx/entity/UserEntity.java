package com.zc.wx.entity;

/**
 * 用户实体类
 *
 * @author zoco
 * @creat 2018-04-20-11:54
 */
public class UserEntity {
    private int id;
    private String email;
    private String password;
    private String username;
    private String role;
    private int status;
    private String regTime;

    public UserEntity() {
    }

    public UserEntity(int id, String email, String password, String username, String role, int status, String regTime, String regIp) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
        this.role = role;
        this.status = status;
        this.regTime = regTime;
        this.regIp = regIp;
    }

    private String regIp;

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public int getId() {

        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public int getStatus() {
        return status;
    }

    public String getRegTime() {
        return regTime;
    }

    public String getRegIp() {
        return regIp;
    }
}
