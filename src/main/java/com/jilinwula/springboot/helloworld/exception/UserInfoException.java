package com.jilinwula.springboot.helloworld.exception;

import com.jilinwula.springboot.helloworld.utils.Return;
import lombok.Data;

@Data
public class UserInfoException extends RuntimeException {
    private Return r;

    public UserInfoException(Return r) {
        this.r = r;
    }
}
