package com.learn.spring.springuse.basic.examples.beannaming.oneclassmoreinstances;

import com.learn.spring.springuse.basic.service.beannaming.oneclassmoreinstances.BeanNameWithClassConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jacksparrow414
 * @date 2020/10/25
 */
public class BeanNameWithOneClassExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanNameWithClassConfiguration.class);
        applicationContext.getBean("firstBean");
        applicationContext.getBean("secondBean");
    }
}
