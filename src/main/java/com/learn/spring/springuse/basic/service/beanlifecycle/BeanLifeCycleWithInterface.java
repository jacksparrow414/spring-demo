package com.learn.spring.springuse.basic.service.beanlifecycle;

import com.learn.spring.springuse.basic.examples.beanlifecycle.BeanLifeCycleWithPostAnnotationExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * InitializingBean提供了当一个bean初始化成功之后要做的操作的接口
 * DisposableBean 提供了当一个bean要被销毁时要做的操作的接口
 * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-lifecycle-initializingbean">整体文档</a>
 *
 * 关于bean的生命周期控制见{@link BeanLifeCycleWithPostAnnotationExample}
 * @author jacksparrow414
 * @date 2021/1/19 15:16
 */
@Slf4j
@Component
public class BeanLifeCycleWithInterface implements InitializingBean, DisposableBean {

    public BeanLifeCycleWithInterface() {
        log.info("bean进行初始化");
    }

    @Override
    public void destroy() throws Exception {
        log.info("DisposableBean接口的destroy方法执行的是bean被销毁之前要做的操作");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("InitializingBean接口的afterPropertiesSet方法执行的是bean初始化之后要做的操作");
    }
}
