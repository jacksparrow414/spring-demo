package com.learn.spring.springuse.basic.examples.dependencyinjection.importinjection;

import com.learn.spring.springuse.basic.service.dependencyinjection.importinjection.DependencyInjectionBeansImportWithJava;
import com.learn.spring.springuse.basic.service.dependencyinjection.importinjection.DependencyInjectionFirstBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 通过@Import注解导入
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */
public class DependencyInjectionWithJavaImportExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionBeansImportWithJava.class);
        applicationContext.getBean("com.learn.spring.springuse.basic.service.dependencyinjection.importinjection.DependencyInjectionFirstBean", DependencyInjectionFirstBean.class);
    }
}
