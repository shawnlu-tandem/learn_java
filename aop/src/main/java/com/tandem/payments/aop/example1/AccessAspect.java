package com.tandem.payments.aop.example1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccessAspect {

    @Autowired AccessService accessService;

    @Pointcut("@annotation(com.tandem.payments.aop.example1.AcceccCheck)")
    public void accessCheck(){}

    @Before("accessCheck()")
    public void check(JoinPoint joinPoint) {
        accessService.isAdmin();
    }
}
