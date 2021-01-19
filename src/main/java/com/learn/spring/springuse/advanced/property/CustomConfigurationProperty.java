package com.learn.spring.springuse.advanced.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ConfigurationProperties 用来直接映射spring自带的application.yml中的属性.
 * prefix要小写，多个单词可以a-b这种写法
 * 一般在使用的时候只用该注解对应的类即可，在使用的地方再进行激活，不建议直接在带有ConfigurationProperties注解类上直接激活
 * 在{@link CustomConfigurationPropertyConfiguration}处使用，在该类上进行激活
 * @author jacksparrow414
 * @date 2021/1/19 10:04
 */

@Component
@ConfigurationProperties(prefix = "dhb")
@Getter
@Setter
public class CustomConfigurationProperty {

    private String customStr;

}
