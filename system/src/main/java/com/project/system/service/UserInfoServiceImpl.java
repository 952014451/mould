package com.project.system.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.project.system.api.UserInfoService;
import com.project.system.mapper.UserInfoMapper;
import com.project.system.mode.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectByName(String name) {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<UserInfo>();
        queryWrapper.select().eq("name",name);
        UserInfo userInfo = userInfoMapper.selectOne(queryWrapper);
        return userInfo;
    }
}
