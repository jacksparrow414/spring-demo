package com.learn.spring.spring01.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jacksparrow414
 * @date 2020-05-31
 * @description: TODO
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "jack.sparrow")
public class CustomConfigurationProperties {

    // private String name;
    private Integer code;
    private Boolean check;

}
