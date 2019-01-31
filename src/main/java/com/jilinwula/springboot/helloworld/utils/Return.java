package com.jilinwula.springboot.helloworld.utils;

import com.jilinwula.springboot.helloworld.exception.UserInfoException;
import lombok.Data;

@Data
public class Return {
    private int code;
    private Object data;
    private String msg;

    public static void error(Object data, String msg) {
        Return r = new Return();
        r.setCode(-1);
        r.setData(data);
        r.setMsg(msg);
        throw new UserInfoException(r);
    }

    public static Return success() {
        Return r = new Return();
        r.setCode(0);
        return r;
    }
}
