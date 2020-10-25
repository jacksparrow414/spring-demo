package com.learn.spring.springuse.config;

import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;

/**
 * 有时间可以研究下@Conditional注解，参考代码，是ShardingSphere-Springboot-stater下的SpringBootConfiguration
 * @author jacksparrow414
 * @date 2020-05-31
 * @description: TODO
 */
@Configuration
@ConditionalOnProperty(
        prefix = "jack.sparrow",
        name = {"enabled"},
        havingValue = "true",
        matchIfMissing = true
)
@AllArgsConstructor
public class CustomConfiguration implements EnvironmentAware {
    private final CustomConfigurationProperties properties;
    private final CustomConfigurationComplexProperties complexProperties;

    @Override
    public void setEnvironment(Environment environment) {
        String prefix = "jack.sparrow.";
        StandardEnvironment standardEnvironment = (StandardEnvironment) environment;
        this.getProValue(prefix,standardEnvironment);
    }


    private void getProValue(String prefix,Environment environment){
        String code = environment.getProperty(prefix + "code");
        System.out.println(code);
        Map<String, String> nameMap = complexProperties.getNameMap();
        nameMap.forEach((k,v) -> {
            System.out.println(k);
            System.out.println(v);
        });
        System.out.println(properties.getCheck());
    }
}
