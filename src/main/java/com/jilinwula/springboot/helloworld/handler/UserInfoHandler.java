package com.jilinwula.springboot.helloworld.handler;

import com.jilinwula.springboot.helloworld.exception.UserInfoException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class UserInfoHandler {


    /**
     * 校验错误拦截处理
     *
     * @param e 错误信息集合
     * @return 错误信息
     */
    @ExceptionHandler(UserInfoException.class)
    public Object handle(UserInfoException e) {
        return e.getR();
    }
}
