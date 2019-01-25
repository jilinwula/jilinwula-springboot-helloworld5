package com.jilinwula.springboot.helloworld.service;

import com.jilinwula.springboot.helloworld.Repository.UserInfoRepository;
import com.jilinwula.springboot.helloworld.entity.UserInfoEntity;
import com.jilinwula.springboot.helloworld.exception.MyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class UserInfoService {
    @Autowired
    private UserInfoRepository userInfoRepository;

    /**
     * 保存用户信息
     */
    @Transactional()
    public void save() throws Exception {
        try {
            UserInfoEntity userInfoEntity = new UserInfoEntity();
            userInfoEntity.setUsername("小米");
            userInfoEntity.setPassword("xiaomi");
            userInfoEntity.setNickname("小米");
            userInfoEntity.setRoleId(0L);
            userInfoRepository.save(userInfoEntity);

            UserInfoEntity userInfoEntity2 = new UserInfoEntity();
            userInfoEntity2.setUsername("京东");
            userInfoEntity2.setPassword("jingdong");
            userInfoEntity2.setNickname("京东");
            userInfoEntity2.setRoleId(0L);
            userInfoRepository.save(userInfoEntity2);

            System.out.println(1 / 0);
        } catch (Exception e) {
            log.info("保存用户信息异常", e);
        }
        throw new MyException();
    }
}
