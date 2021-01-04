package com.mashibing.dp.spring.v2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// 这个注解表示这是要往里切的类
// 比在注释文件更方便，但是要求
@Aspect
public class TimeProxy {

    @Before("execution (void com.mashibing.dp.spring.v2.Tank.move())")
    public void before() {
        System.out.println("method start.." + System.currentTimeMillis());
    }

    @After("execution (void com.mashibing.dp.spring.v2.Tank.move())")
    public void after() {
        System.out.println("method stop.." + System.currentTimeMillis());
    }

}
