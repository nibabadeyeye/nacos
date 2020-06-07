package com.cheer.service;

import com.cheer.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient("spring-cloud-alibaba-nacos-user-server")
public interface UserService extends UserDefaultService{


    @GetMapping("/addUser")
    void addUser(User user);

    @GetMapping("/delUserById")
    void delUserById(int id);

    @PostMapping("/getOne")
    User getOne(int id);

    @PostMapping("/getList")
    List<User> getList();

    @GetMapping("/updateUser")
    void updateUser();

    @GetMapping("/test")
     String test() ;
}
