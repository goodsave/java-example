package com.goodsave.example.spring.jpatemplate;

import com.alibaba.fastjson.JSON;

/**
 * User
 * Created by web on 2017/7/26.
 */
public class User {

    private Integer id;
    private String userName;
    private String passWord;
    private String email;

    public User(){}

    public User(Integer id,String userName,String passWord,String email){
        this.id=id;
        this.userName=userName;
        this.passWord=passWord;
        this.email=email;
    }

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
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}