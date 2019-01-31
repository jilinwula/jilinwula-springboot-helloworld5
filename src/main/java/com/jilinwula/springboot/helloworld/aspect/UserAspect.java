package com.jilinwula.springboot.helloworld.aspect;

import com.jilinwula.springboot.helloworld.utils.Return;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@Slf4j
@Aspect
@Component
public class UserAspect {

    @Before("execution(public * com.jilinwula.springboot.helloworld.controller..*(..))")
    public void doBefore(JoinPoint joinPoint) {
        for (Object arg : joinPoint.getArgs()) {
            if (arg instanceof BindingResult) {
                BindingResult result = (BindingResult) arg;
                if (result.hasErrors()) {
                    FieldError error = result.getFieldError();
                    Return.error(error.getField(), error.getDefaultMessage());
                }
            }
        }
    }
}
