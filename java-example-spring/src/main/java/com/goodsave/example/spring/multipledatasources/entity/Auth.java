package com.goodsave.example.spring.multipledatasources.entity;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * Auth
 * Created by Joker on 2017/8/4.
 */
public class Auth implements Serializable {

    private static final long serialVersionUID = -1086790711293440255L;
    private Integer id;

    private String type;

    private String authValue;

    private String category;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthValue() {
        return authValue;
    }

    public void setAuthValue(String authValue) {
        this.authValue = authValue;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
