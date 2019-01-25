package com.jilinwula.springboot.helloworld;

import com.jilinwula.springboot.helloworld.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JilinwulaSpringbootHelloworldApplicationTests {

    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void save() {
        try {
            userInfoService.save();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void contextLoads() {
    }

}

