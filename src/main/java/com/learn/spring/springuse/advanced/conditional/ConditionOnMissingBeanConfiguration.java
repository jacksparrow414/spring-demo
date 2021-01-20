package com.learn.spring.springuse.advanced.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 当Spring容器中没有ConditionComponent这个bean时才会执行下面的方法.
 * ConditionalOnMissingBean一般用于自动配置中,当客户端没有配置对应属性时，框架配置默认属性以及所需的对应的bean
 * @author jacksparrow414
 * @date 2021/1/20 10:21
 */
@Configuration
public class ConditionOnMissingBeanConfiguration {

    @Bean
    @ConditionalOnMissingBean(ConditionComponent.class)
    public ConditionalOnBeanComponent conditionalOnBeanComponent() {
        return new ConditionalOnBeanComponent();
    }
}
