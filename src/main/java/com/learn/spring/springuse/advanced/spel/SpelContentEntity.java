package com.learn.spring.springuse.advanced.spel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * 在spring容器中使用Spel表达式，通过类引用获得其对应的属性或者调用对应的方法.
 * 在@Value中使用#{}表示这是一个Spel表达式，里面就是Spel表达式的内容
 * <b>访问Spring容器中的类的属性或方法：@beanName.属性/方法</b>
 * 如下面的:要想访问SpelEntity这个bean的属性或者方法直接通过@spelEntity
 * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#expressions-bean-references">Spel关于访问Bean引用的文档</a>
 *
 * 同时注意:@Value有两种形式
 * 1、@Value("#{spel expression}") 这种#{}里面写的是Spel 表达式
 * 2、@Value("${spring.datasource.url}") 这种${}里面写的是具体属性文件(application.yml)中的属性名字，通过该属性名字获得其对应的值
 * 更多@Value注解见<a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-value-annotations">官方关于@Value部分</a>
 * @author jacksparrow414
 * @date 2021/1/17
 */
@Slf4j
@Component
public class SpelContentEntity {
    
    @Value("#{@spelEntity.age}")
    private Integer contentAge;
    
    @Value("#{@spelEntity.name}")
    private String contentName;
    
    @Value("#{@spelEntity.myDate()}")
    private Date contentDate;

    /**
     * 当@Value取值为属性文件时，如果属性值不存在，可以给一个默认值,属性:不存在时的默认值
     */
    @Value("${jack.sparrow.name:noexist}")
    private String name;
    
    /**
     * 通过三目运算符判断.
     */
    @Value("#{@spelEntity.list != null and !@spelEntity.list.isEmpty() ? @spelEntity.list[0] : 'unKnown'}")
    private String contentString;
    
    @PostConstruct
    public void init() {
        log.info("获取SpelEntity类的age是{}", contentAge);
        log.info("获取SpelEntity类的name是{}", contentName);
        log.info("调用SpelEntity类的实例方法myDate()返回值是{}", contentDate);
        log.info("调用SpelEntity类的list属性返回{}", contentString);
    }
}
