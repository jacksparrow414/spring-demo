package com.learn.spring.springuse.basic.examples.beanlifecycle;

import com.learn.spring.springuse.basic.service.beanlifecycle.BeanLifeCycleWithInterface;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jacksparrow414
 * @date 2021/1/19 15:27
 */
public class BeanLifeCycleWithInterfaceExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanLifeCycleWithInterface.class);
        applicationContext.close();
    }
}
