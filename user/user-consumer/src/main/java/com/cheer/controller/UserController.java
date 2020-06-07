package com.cheer.controller;

import com.cheer.entity.User;
import com.cheer.service.UserDefaultService;
import com.cheer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController implements UserDefaultService {




    @GetMapping("/addUser")
    public void addUser(User user) {
       userService.addUser(user);
    }

    @GetMapping("/delUserById")
    public void delUserById(int id) {
      userService.delUserById(id);
    }

    @PostMapping("/getOne")
    public User getOne(int id) {
        return userService.getOne(id);
    }

    @PostMapping("/getList")
    public List<User> getList() {
        return userService.getList();
    }

   // @GetMapping("/updateUser")
    public void updateUser() {
        userService.updateUser();
    }


    @GetMapping("/info")
    public Object getMemberServerInfo(){
        // 通过服务名称获取nacos上的服务信息        pitch-member:为会员的服务名称
        List<ServiceInstance> instances = discoveryClient.getInstances("spring-cloud-alibaba-nacos-user-server");
        return instances;
    }


    @GetMapping("/test")
    public String test() {
        return userService.test();
    }

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private UserService userService;
}
