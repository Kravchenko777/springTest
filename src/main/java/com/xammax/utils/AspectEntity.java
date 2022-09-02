package com.xammax.utils;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectEntity {

    @Pointcut("@annotation(com.xammax.local.TestAOP)")
    public void pointcut(){};


    @Before("pointcut()")
    public void test(){
        System.out.println("Я сделал это");
    }
}
