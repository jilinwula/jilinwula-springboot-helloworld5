package com.jilinwula.springboot.helloworld.Repository;

import com.jilinwula.springboot.helloworld.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Long> {
    UserInfoEntity findByUsernameAndRoleId(String usenrame, Long roleId);
}
