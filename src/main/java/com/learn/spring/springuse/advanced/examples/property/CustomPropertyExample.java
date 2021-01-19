package com.learn.spring.springuse.advanced.examples.property;

import com.learn.spring.springuse.advanced.property.CustomPropertySource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jacksparrow414
 * @date 2021/1/19 11:10
 */
@Slf4j
public class CustomPropertyExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CustomPropertySource.class);
        CustomPropertySource customPropertySource = (CustomPropertySource) applicationContext.getBean("customPropertySource");
        log.info("获取外部属性配置文件的属性值为{}", customPropertySource.getName());
    }
}
