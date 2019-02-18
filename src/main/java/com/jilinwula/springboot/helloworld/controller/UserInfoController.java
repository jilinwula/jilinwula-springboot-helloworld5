package com.jilinwula.springboot.helloworld.controller;

import com.jilinwula.springboot.helloworld.Repository.UserInfoRepository;
import com.jilinwula.springboot.helloworld.entity.UserInfoEntity;
import com.jilinwula.springboot.helloworld.query.UserInfoQuery;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("/userinfo")
public class UserInfoController {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @GetMapping("/query")
    public Object list(@Valid UserInfoQuery userInfo, BindingResult result) {
        UserInfoEntity userInfoEntity = userInfoRepository.findByUsernameAndRoleId(userInfo.getUsername(), userInfo.getRoleId());
        return userInfoEntity;
    }
}
