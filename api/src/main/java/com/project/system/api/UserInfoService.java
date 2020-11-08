package com.project.system.api;


import com.project.system.mode.UserInfo;

public interface UserInfoService {

    UserInfo selectByName(String name);

}
