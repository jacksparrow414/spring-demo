package com.learn.spring.springuse.advanced.examples.spel;

import com.learn.spring.springuse.advanced.spel.SpelContentEntity;
import com.learn.spring.springuse.advanced.spel.SpelEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 在Spring容器中使用Spel示例.
 * @author jacksparrow414
 * @date 2021/1/17
 */
public class SpelSpringContentGetValueExample {
    
    public static void main(String[] args) {
        ApplicationContext annotationContext = new AnnotationConfigApplicationContext(SpelEntity.class, SpelContentEntity.class);
    }
}
