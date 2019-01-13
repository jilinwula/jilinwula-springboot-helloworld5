package com.jilinwula.springboot.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jilinwula")
public class JilinwulaController {

    @RequestMapping("/helloworld")
    public Object helloWorld() {
        return "吉林乌拉";
    }

}
