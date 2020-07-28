package com.bril.test.entity;

public class Person {

    private Integer id;
    private String u_login_id;
    private String u_login_pwd;
    private String u_username;

    public String getU_login_id() {
        return u_login_id;
    }

    public void setU_login_id(String u_login_id) {
        this.u_login_id = u_login_id;
    }

    public String getU_login_pwd() {
        return u_login_pwd;
    }

    public void setU_login_pwd(String u_login_pwd) {
        this.u_login_pwd = u_login_pwd;
    }

    public String getU_username() {
        return u_username;
    }

    public void setU_username(String u_username) {
        this.u_username = u_username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}