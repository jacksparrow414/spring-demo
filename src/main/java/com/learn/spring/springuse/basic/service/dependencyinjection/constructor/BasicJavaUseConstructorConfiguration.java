package com.learn.spring.springuse.basic.service.dependencyinjection.constructor;

import com.learn.spring.springuse.basic.examples.dependencyinjection.constructor.DependencyInjectionWithConstructorAnnotationExample;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-java-dependencies">在Java配置中的Bean依赖</a>
 * 其实就是使用构造器进行属性的注入,加深理解
 * @author jacksparrow414
 * @date 2021/1/14 10:43
 */
@Configuration
@Import(value = DependencyInjectiondContructorService.class)
public class BasicJavaUseConstructorConfiguration {

    /**
     * 在configuration中配置bean时,当做xml中的<bean></bean> 标签一样.
     * 以同样的思路来理解即可.为什么有的bean可以接收参数，<b>因为其构造方案有这个参数</b>，如下面的例子
     * 或者换句话说，当使用Java配置类的形式配置时，如果该bean的实例需要其他参数，则可以，直接在这个方法上加参数，然后调用构造方法new 即可
     * 当然前提和依赖注入一样，其依赖的属性bean，此时已经在容器中了,这里使用@Import注解，将依赖的类当做bean加到spring容器中
     * 如果是正常使用，依赖的属性应该会被@ComponentScan扫描到，就不用手动@Import，这里是因为在{@link DependencyInjectionWithConstructorAnnotationExample}中只加载了当前类，所以需要手动引入
     */
    @Bean
    public DependencyInjectionWithConstructorService dependencyInjectionWithConstructorService(DependencyInjectiondContructorService dependencyInjectiondContructorService) {
        return new DependencyInjectionWithConstructorService(dependencyInjectiondContructorService);
    }
}
