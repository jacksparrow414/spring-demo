package com.learn.spring.springuse.basic.examples.dependencyinjection.constructor;

import com.learn.spring.springuse.basic.service.dependencyinjection.constructor.BasicJavaUseConstructorConfiguration;
import com.learn.spring.springuse.basic.service.dependencyinjection.constructor.DependencyInjectionWithConstructorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 在Java配置类中使用构造方法注入属性的例子.
 *
 * 类似的还有spring的DataSourceTransactionManager的构造方法，很多很多.
 *
 * @author jacksparrow414
 * @date 2021/1/14 10:51
 */
public class DependencyInjectionWithConstructorAnnotationExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BasicJavaUseConstructorConfiguration.class);
        DependencyInjectionWithConstructorService dependencyInjectionWithConstructorService = (DependencyInjectionWithConstructorService) applicationContext.getBean("dependencyInjectionWithConstructorService");
        System.out.println(dependencyInjectionWithConstructorService.callInjectionClassMethod());
    }
}
