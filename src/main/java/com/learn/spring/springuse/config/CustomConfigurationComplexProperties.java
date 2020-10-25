package com.learn.spring.springuse.config;

import java.util.HashMap;
import java.util.Map;
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
@ConfigurationProperties(prefix = "jack.sparrow.name")
public class CustomConfigurationComplexProperties {

    private Map<String,String> nameMap = new HashMap<>();
}
