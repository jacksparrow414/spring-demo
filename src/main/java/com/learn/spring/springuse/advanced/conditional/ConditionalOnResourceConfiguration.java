package com.learn.spring.springuse.advanced.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 当外部某些属性文件存在时,是当前配置生效
 *
 * @author jacksparrow414
 * @date 2021/1/20 11:16
 */
@Configuration
@ConditionalOnResource(resources = {"customConfig.properties"})
public class ConditionalOnResourceConfiguration {

    @Bean
    public ConditionComponent conditionComponent() {
        return new ConditionComponent();
    }
}
