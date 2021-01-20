package com.learn.spring.springuse.advanced.examples.conditional;

import com.learn.spring.springuse.advanced.conditional.ConditionOnMissingBeanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 当ConditionComponent在Spring容器中没有对应的bean时候，去初始化conditionalOnBeanComponent.
 *
 * 详细注释可参考{@link ConditionOnBeanExample}
 * @author jacksparrow414
 * @date 2021/1/20 10:24
 */
public class ConditionalOnMissingBeanExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionOnMissingBeanConfiguration.class);
        applicationContext.getBean("conditionalOnBeanComponent");
    }
}
