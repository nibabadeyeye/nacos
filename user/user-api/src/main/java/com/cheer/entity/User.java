package com.cheer.entity;

import java.io.Serializable;

public class User implements Serializable {

    private Long id;

    private String name;

    private String sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public User(Long id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }
}
