package com.learn.spring.springuse.advanced.examples.conditional;

import com.learn.spring.springuse.advanced.conditional.ConditionalOnResourceConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 详细注释可参考{@link ConditionOnBeanExample}
 * @author jacksparrow414
 * @date 2021/1/20 11:18
 */
public class ConditionalOnResourceExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionalOnResourceConfiguration.class);
        applicationContext.getBean("conditionComponent");
    }
}
