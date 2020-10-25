package com.learn.spring.springuse.basic.examples.setter;

import com.learn.spring.springuse.basic.service.setter.DependencyInjectionWithSetService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入使用set方法进行依赖注入
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */
public class DependencyInjectionWithSetExample {
    
    public static void main(String[] args) {
        //1、加载xml文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic/setter/DependencyInjectionWithSetter.xml");
        //2、获得DependencyInjectionWithSetService类的实例，其中名字就是xml中配置的<bean id="">的名字
        // 如果配置错误，会抛出NoSuchBeanDefinitionException: No bean named 'XXX' available异常。也就是没找到
        DependencyInjectionWithSetService dependencyInjectionWithSetService = applicationContext.getBean("dependencyInjectionWithSetService", DependencyInjectionWithSetService.class);
        //3、调用注入类的实例的方法
        String callInjectionClassMethod = dependencyInjectionWithSetService.callInjectionClassMethod();
        System.out.println(callInjectionClassMethod);
    }
}
