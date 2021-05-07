package com.tandem.payments.aop.example2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Pointcut("within(com.tandem.payments.aop.example2..*)")
    public void logFunction(){}

    @Around("logFunction()")
    public void logging(ProceedingJoinPoint proceedingJoinPoint) {
        Signature signature = proceedingJoinPoint.getSignature();
        System.out.println("Method: " + signature.getDeclaringTypeName() + signature.getName() );

        Object[] args = proceedingJoinPoint.getArgs();
        for (Object object: args) {
            System.out.println("Parameter received:" + object);
        }
        try {
            Object returnObject = proceedingJoinPoint.proceed();
            System.out.println(" Returned: "+returnObject);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
