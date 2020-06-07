package com.cheer.service;

import com.cheer.entity.User;

import java.util.List;

public interface UserDefaultService {

    public String test();

    public void addUser(User user);

    public void delUserById(int id);

    public User getOne(int id);

    public List<User> getList();

    public void updateUser();

}
