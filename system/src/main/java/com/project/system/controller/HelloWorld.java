package com.project.system.controller;

import com.project.system.mode.UserInfo;
import com.project.system.api.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/hello")
    public UserInfo hello(){
        UserInfo userInfo = userInfoService.selectByName("zzz");
        return userInfo;
    }

    @PutMapping("/put")
    public void put(@RequestBody UserInfo userInfo){
        System.out.println(userInfo.getName());
    }
}
