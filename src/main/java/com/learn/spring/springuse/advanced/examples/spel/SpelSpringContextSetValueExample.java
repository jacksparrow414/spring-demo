package com.learn.spring.springuse.advanced.examples.spel;

import com.learn.spring.springuse.advanced.spel.SpelSetValueContextEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jacksparrow414
 * @date 2021/1/18 14:38
 */
public class SpelSpringContextSetValueExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpelSetValueContextEntity.class);
    }
}
