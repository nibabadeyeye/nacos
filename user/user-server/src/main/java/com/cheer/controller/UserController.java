package com.cheer.controller;

import com.cheer.entity.User;
import com.cheer.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Vector;

@RestController
public class UserController implements UserService {

    @Override
    public void addUser(User user) {

    }

    @Override
    public void delUserById(int id) {

    }

    @Override
    public User getOne(@RequestParam("id")int id) {
        return new User("to be better","男");
    }

    @Override
    public List<User> getList() {
        List<User>list=new Vector<>();
        list.add(new User("to be better","男"));
        return  list;
    }

    @Override
    public void updateUser() {

    }

    @Override
    public String test() {
        return "hello world";
    }
}
