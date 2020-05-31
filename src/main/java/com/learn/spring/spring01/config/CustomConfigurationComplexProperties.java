package com.learn.spring.spring01.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jacksparrow414
 * @date 2020-05-31
 * @description: TODO
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "jack.sparrow.name")
public class CustomConfigurationComplexProperties {

    private Map<String,String> nameMap = new HashMap<>();
}
