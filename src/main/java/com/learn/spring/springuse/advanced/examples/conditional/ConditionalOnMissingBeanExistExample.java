package com.learn.spring.springuse.advanced.examples.conditional;

import com.learn.spring.springuse.advanced.conditional.ConditionComponent;
import com.learn.spring.springuse.advanced.conditional.ConditionOnMissingBeanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 详细注释可参考{@link ConditionOnBeanExample}
 * @author jacksparrow414
 * @date 2021/1/20 10:31
 */
public class ConditionalOnMissingBeanExistExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionOnMissingBeanConfiguration.class, ConditionComponent.class);
        // 不满足条件，此时不会初始化conditionalOnBeanComponent，在容器中获取bean的时候会报错
        applicationContext.getBean("conditionalOnBeanComponent");
    }
}
