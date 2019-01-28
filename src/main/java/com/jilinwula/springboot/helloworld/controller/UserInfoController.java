package com.jilinwula.springboot.helloworld.controller;

import com.jilinwula.springboot.helloworld.Repository.UserInfoRepository;
import com.jilinwula.springboot.helloworld.entity.UserInfoEntity;
import com.jilinwula.springboot.helloworld.query.UserInfoQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/userinfo")
public class UserInfoController {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @GetMapping("/query")
    public Object list(UserInfoQuery userInfo) {
        if (StringUtils.isEmpty(userInfo.getUsername())) {
            return "账号不能为空";
        }
        if (StringUtils.isEmpty(userInfo.getRoleId()) || userInfo.getRoleId() > 100 || userInfo.getRoleId() < 1) {
            return "权限不能为空,并且范围为[1-99]";
        }
        UserInfoEntity userInfoEntity = userInfoRepository.findByUsernameAndRoleId(userInfo.getUsername(), userInfo.getRoleId());
        return userInfoEntity;
    }
}
