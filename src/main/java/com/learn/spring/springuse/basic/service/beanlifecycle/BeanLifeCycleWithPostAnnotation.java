package com.learn.spring.springuse.basic.service.beanlifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 下面两个注解的<a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-postconstruct-and-predestroy-annotations">官方文档</a>
 *
 * 关于bean的生命周期控制见{@link com.learn.spring.springuse.basic.examples.beanlifecycle.BeanLifeCycleWithPostAnnotationExample}
 * @author duhongbo
 * @date 2021/1/19 15:00
 */
@Slf4j
@Component
public class BeanLifeCycleWithPostAnnotation {

    public BeanLifeCycleWithPostAnnotation() {
        log.info("bean被初始化");
    }

    @PostConstruct
    public void init() {
        log.info("bean执行初始化之后执行");
    }

    @PreDestroy
    public void cleanUp() {
        log.info("bean销毁之前执行");
    }
}
