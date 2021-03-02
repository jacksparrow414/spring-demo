package com.learn.spring.springuse.advanced.examples.aop;

import com.learn.spring.springuse.advanced.aop.AopComponent;
import com.learn.spring.springuse.advanced.aop.CustomAspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jacksparrow414
 * @date 2021/3/2 10:33
 */
public class AopUseExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopComponent.class, CustomAspect.class);
        AopComponent aopComponent = (AopComponent) applicationContext.getBean("aopComponent");
        aopComponent.executeMethod("info");
    }
}
