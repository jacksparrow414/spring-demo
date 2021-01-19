package com.learn.spring.springuse.basic.examples.beanlifecycle;

import com.learn.spring.springuse.basic.service.beanlifecycle.BeanLifeCycleWithCustomMethodConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jacksparrow414
 * @date 2021/1/19 15:36
 */
public class BeanLifeCycleWithCustomMethodExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanLifeCycleWithCustomMethodConfiguration.class);
        applicationContext.close();
    }
}
