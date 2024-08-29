package org.example.app.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class RequestInfoAop {
    @After("execution(* org.example.app.controller.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("after");
    }
}
