package com.learn.spring.springuse.basic.examples.beaninstantiation.staticfactory;

import com.learn.spring.springuse.basic.service.beaninstantiation.staticfactory.BeanInstantiationWithStaticFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jacksparrow414
 * @date 2021/3/21
 */
public class BeanInstantiationWithStaticFactoryExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic/beaninstantiation/staticfactory/BeanInstantiationWithStaticFactory");
        BeanInstantiationWithStaticFactory bean = applicationContext.getBean(BeanInstantiationWithStaticFactory.class);
    }
}
