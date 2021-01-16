package com.learn.spring.springuse.advanced.examples.event;

import com.learn.spring.springuse.advanced.event.CustomEventConfiguration;
import com.learn.spring.springuse.advanced.event.CustomPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 在Spring容器中获得到CustomPublisher的实例，调用发布事件方法.
 */
public class PublishEventExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CustomEventConfiguration.class);
        CustomPublisher bean = applicationContext.getBean(CustomPublisher.class);
        bean.publishCustomEvent();
        applicationContext.close();
    }
}
