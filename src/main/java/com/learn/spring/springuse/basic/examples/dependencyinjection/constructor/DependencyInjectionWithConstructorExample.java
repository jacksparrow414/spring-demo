package com.learn.spring.springuse.basic.examples.dependencyinjection.constructor;

import com.learn.spring.springuse.basic.service.dependencyinjection.constructor.DependencyInjectionWithConstructorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用构造器进行属性的注入
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */
public class DependencyInjectionWithConstructorExample {
    
    public static void main(String[] args) {
        //1、加载xml文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic/dependencyinjection/constructor/DependencyInjectionWithConstructor.xml");
        //2、获得DependencyInjectionWithConstructorService类的实例
        DependencyInjectionWithConstructorService dependencyInjectionWithConstructorService =
            applicationContext.getBean("dependencyInjectionWithConstructorService", DependencyInjectionWithConstructorService.class);
        //3、调用依赖对象的方法
        String injectionClassMethod = dependencyInjectionWithConstructorService.callInjectionClassMethod();
        System.out.println(injectionClassMethod);
    }
}
