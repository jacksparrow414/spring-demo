package com.learn.spring.springuse.advanced.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 当需要Spring容器中存在某些Bean才使某些配置生效时，使用{@code @ConditionalOnBean}注解来控制，
 * 如下面这个配置，当ConditionComponent这个bean的示例存在时，才会使配置文件生效
 * <a href="https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-bean-conditions">官方文档</a>
 *
 * 此注解可以用在类上，也可以用在某个方法上.
 * @author jacksparrow414
 * @date 2021/1/20 9:56
 */
@Configuration
@ConditionalOnBean(value = ConditionComponent.class)
public class ConditionalOnBeanConfiguration {

    @Bean
    @ConditionalOnBean(value = ConditionComponent.class)
    public ConditionalOnBeanComponent conditionalOnBeanComponent() {
        return new ConditionalOnBeanComponent();
    }
}
