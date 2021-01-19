package com.learn.spring.springuse.advanced.property;

import com.learn.spring.springuse.advanced.spel.SpelContentEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * 对于外部的自定义的属性文件，使用@PropertySource获取其属性的映射.
 * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-using-propertysource">官方文档</a>
 * 该注解的值为属性文件在项目中的位置,
 * 因为一般maven项目，属性文件都会放到resource文件夹下的某个路径下面，所以基本写法为 【classpath:属性文件的路径】
 * 对于其中的属性，不会像{@link CustomConfigurationProperty}自动映射，而是需要通过@Value注解进行取值
 * 形式为@Value("${}"),  ${} 为取属性的写法，关于@Value的相关信息可查看{@link SpelContentEntity}相关注释
 * @author jacksparrow414
 * @date 2021/1/19 11:05
 */

@PropertySource("classpath:customConfig.properties")
@Getter
@Setter
public class CustomPropertySource {

    /**
     * 如果hello属性不存在,返回默认值noexist
     */
    @Value("${hello:noexist}")
    private String name;
}
