package com.learn.spring.springuse.basic.examples.beanlifecycle;

import com.learn.spring.springuse.basic.service.beanlifecycle.BeanLifeCycleWithCustomMethod;
import com.learn.spring.springuse.basic.service.beanlifecycle.BeanLifeCycleWithInterface;
import com.learn.spring.springuse.basic.service.beanlifecycle.BeanLifeCycleWithPostAnnotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 当要做的一些操作在Bean初始化之后，或者销毁之前.为什么会有这种操作呢，比如各大框架的AutoConfig类，一般都在核心类实例化之后开始坐一些配置操作.
 * 如Druid数据源的DruidDataSourceAutoConfigure
 * 有三种方式
 * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-lifecycle-combined-effects">官方文档</a>
 *
 * 1、使用@PostConstruct和@PreDestroy注解
 * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-postconstruct-and-predestroy-annotations">官方文档</a>
 *
 * 2、实现 InitializingBean 和 DisposableBean
 * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-lifecycle-initializingbean">整体文档</a>
 * 使用示例{@link BeanLifeCycleWithInterface}
 *
 * 3、自定义init方法和destroy方法，然后在操作的位置调用
 * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-lifecycle-initializingbean">官方文档</a>
 * 使用示例{@link BeanLifeCycleWithCustomMethod} xml的使用示例见{@link BeanLifeCycleWithCustomMethodByXmlExample}
 *
 * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-nature">整体文档</a>
 * @author duhongbo
 * @date 2021/1/19 15:07
 */
public class BeanLifeCycleWithPostAnnotationExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanLifeCycleWithPostAnnotation.class);
        annotationConfigApplicationContext.close();
    }
}
