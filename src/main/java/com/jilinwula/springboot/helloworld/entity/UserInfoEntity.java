package com.jilinwula.springboot.helloworld.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_info", indexes = @Index(columnList = "username"))
public class UserInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint(10)  comment '主键'")
    private Long id;

    @Column(name = "username", columnDefinition = "varchar(10) not null default '' comment '账号'")
    private String username;

    @Column(name = "password", columnDefinition = "varchar(10) not null default '' comment '密码'")
    private String password;

    @Column(name = "nickname", columnDefinition = "varchar(10) not null default '' comment '妮称'")
    private String nickname;

    @Column(name = "role_id", columnDefinition = "bigint(10) not null default 0 comment '角色'")
    private Long roleId;
}
