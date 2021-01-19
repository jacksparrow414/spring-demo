package com.learn.spring.springuse.basic.service.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author duhongbo
 * @date 2021/1/19 15:35
 */
@Configuration
public class BeanLifeCycleWithCustomMethodConfiguration {

    /**
     * 指定bean初始化之后的方法，bean销毁之前的方法.
     * 小提示：如果方法名字配置正确,则可以通过ctrl+鼠标点击跳转到相应方法上
     */
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanLifeCycleWithCustomMethod beanLifeCycleWithCustomMethod() {
        return new BeanLifeCycleWithCustomMethod();
    }
}
