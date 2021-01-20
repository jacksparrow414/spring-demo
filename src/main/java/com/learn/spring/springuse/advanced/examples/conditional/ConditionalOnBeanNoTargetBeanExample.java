package com.learn.spring.springuse.advanced.examples.conditional;

import com.learn.spring.springuse.advanced.conditional.ConditionalOnBeanComponent;
import com.learn.spring.springuse.advanced.conditional.ConditionalOnBeanConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 当@ConditionalOnBean的注解的value属性的类没有实例时，不会进行此配置.
 *
 * 详细注释可参考{@link ConditionOnBeanExample}
 * @author jacksparrow414
 * @date 2021/1/20 10:03
 */
@Slf4j
public class ConditionalOnBeanNoTargetBeanExample {

    public static void main(String[] args) {
        // 当没有把ConditionComponent注入到spring容器时，那么此配置不生效
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionalOnBeanConfiguration.class);
        // 此时获取不到对应的bean,会抛出NoSuchBeanDefinitionException: No bean named 'conditionalOnBeanComponent' available 异常
        ConditionalOnBeanComponent conditionalOnBeanComponent = (ConditionalOnBeanComponent) applicationContext.getBean("conditionalOnBeanComponent");
    }
}
