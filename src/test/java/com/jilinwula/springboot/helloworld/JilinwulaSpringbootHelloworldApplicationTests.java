package com.jilinwula.springboot.helloworld;

import com.jilinwula.springboot.helloworld.Repository.UserInfoRepository;
import com.jilinwula.springboot.helloworld.entity.UserInfoEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JilinwulaSpringbootHelloworldApplicationTests {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Test
    public void save() {
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        userInfoEntity.setUsername("阿里巴巴");
        userInfoEntity.setPassword("alibaba");
        userInfoEntity.setNickname("淘宝");
        userInfoEntity.setRoleId(2L);

        userInfoRepository.save(userInfoEntity);
    }

    @Test
    public void select() {
        UserInfoEntity userInfoEntity = userInfoRepository.findOne(1L);
        System.out.println(userInfoEntity);
    }

    @Test
    public void selectAll() {
        List<UserInfoEntity> userInfoEntitys = userInfoRepository.findAll();
        System.out.println(userInfoEntitys);
    }

    @Test
    public void update() {
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        userInfoEntity.setId(1L);
        userInfoEntity.setUsername("阿里巴巴");
        userInfoEntity.setPassword("alibaba");
        userInfoEntity.setNickname("淘宝");
        userInfoEntity.setRoleId(2L);

        userInfoRepository.save(userInfoEntity);
    }

    @Test
    public void delete() {
        userInfoRepository.delete(1L);
    }

    @Test
    public void contextLoads() {
    }

}

