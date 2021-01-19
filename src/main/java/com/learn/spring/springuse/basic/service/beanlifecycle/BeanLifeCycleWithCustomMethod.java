package com.learn.spring.springuse.basic.service.beanlifecycle;

import lombok.extern.slf4j.Slf4j;

/**
 * 可以自定义在bean初始化之前、之后的方法
 * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-lifecycle-initializingbean">官方文档</a>
 *
 * 在配置类{@link BeanLifeCycleWithCustomMethodConfiguration}中通过@Bean注解的init-method和destroy-method方法指定方法名字
 * @author duhongbo
 * @date 2021/1/19 15:34
 */
@Slf4j
public class BeanLifeCycleWithCustomMethod {

    public BeanLifeCycleWithCustomMethod() {
        log.info("bean进行初始化");
    }

    public void init() {
        log.info("bean初始化之后的操作");
    }

    public void destroy() {
        log.info("bean销毁之前的操作");
    }
}
