package com.learn.spring.springuse.advanced.property;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 在该配置类中使用, 激活{@link CustomConfigurationProperty}
 * @author jacksparrow414
 * @date 2021/1/19 10:10
 */
@Configuration
@EnableConfigurationProperties(value = {CustomConfigurationProperty.class})
public class CustomConfigurationPropertyConfiguration {

}
