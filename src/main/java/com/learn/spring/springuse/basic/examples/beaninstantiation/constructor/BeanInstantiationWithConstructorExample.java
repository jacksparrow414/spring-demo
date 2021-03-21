package com.learn.spring.springuse.basic.examples.beaninstantiation.constructor;

import com.learn.spring.springuse.basic.service.beaninstantiation.constructor.BeanInstantiationWithConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 实例化类的三种方式
 * 1、构造方法
 * 2、静态工厂
 * 3、实例工厂
 * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-class-instance-factory-method">官方文档</a>
 * @author jacksparrow414
 * @date 2021/3/21
 */
public class BeanInstantiationWithConstructorExample {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic/beaninstantiation/constructor/BeanInstantiationWithConstructor.xml");
        BeanInstantiationWithConstructor bean = applicationContext.getBean(BeanInstantiationWithConstructor.class);
    }
}
