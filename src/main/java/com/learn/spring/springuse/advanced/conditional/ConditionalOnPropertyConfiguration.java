package com.learn.spring.springuse.advanced.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <a href="https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-property-conditions">官方文档</a>
 * 当Spring的配置文件application.yml，并且满足havingValue中的值，进行初始化ConditionalOnBeanComponent.
 * @author jacksparrow414
 * @date 2021/1/20 10:42
 */
@Configuration
public class ConditionalOnPropertyConfiguration {

    /**
     * prefix是配置文件中具体属性的前几级
     * name是要匹配的属性名
     * havingValue是要匹配属性名的属性值
     * matchIfMissing当不匹配时是否继续使当前注解标注的方法生效
     *
     * 在test单元测试中测试是否生效，使用方法见{@link com.learn.spring.springuse.SpringApplicationTests}
     * @return com.learn.spring.springuse.advanced.conditional.ConditionalOnBeanComponent
     */
    @Bean
    @ConditionalOnProperty(prefix = "jack.sparrow", name = {"code"}, havingValue = "3", matchIfMissing = false)
    public ConditionalOnBeanComponent conditionalOnBeanComponent() {
        return new ConditionalOnBeanComponent();
    }
}
