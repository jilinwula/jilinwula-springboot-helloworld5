package com.jilinwula.springboot.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/jilinwula")
public class JilinwulaController {

    @Autowired
    private EmailProperties emailProperties;

    @RequestMapping("/helloworld")
    public Object helloWorld() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", emailProperties.getUsername());
        map.put("password", emailProperties.getPassword());
        return map;
    }

}
