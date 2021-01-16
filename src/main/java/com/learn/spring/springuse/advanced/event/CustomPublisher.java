package com.learn.spring.springuse.advanced.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * 定义好了事件{@link CustomEvent}，下面要做的就是发布事件.
 *
 * <b>前提</b>
 * 自定义的发布事件类必须要注册到Spring容器中，能够被Spring容器检测到.
 *
 * 文档原文为：
 * To publish a custom ApplicationEvent, call the publishEvent() method on an ApplicationEventPublisher.
 * Typically, this is done by creating a class that implements ApplicationEventPublisherAware and registering it as a Spring bean
 *
 * 发布事件：
 * 1、实现ApplicationEventPublisherAware接口，在当前发布类中加一个ApplicationEventPublisher属性，用来发布具体事件
 * 2、在setApplicationEventPublisher方法中，spring容器会自动将applicationEventPublisher设置进去
 * 文档原文为：
 * At configuration time, the Spring container detects that EmailService implements ApplicationEventPublisherAware
 * and automatically calls setApplicationEventPublisher().
 * In reality, the parameter passed in is the Spring container itself
 * 3、写自己的发布事件方法
 *
 * 以上所述都可以在官方文档中找到
 */
@Slf4j
@Component
public class CustomPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishCustomEvent() {
        String name = "jack";
        // 这里对于CustomEvent的构造方法的第一个参数，设置为当前类，this.可以在官方文档示例中找到
        CustomEvent event = new CustomEvent(this, name);
        applicationEventPublisher.publishEvent(event);
        log.info("发布自定义事件, 名字为{}", event.getName());
    }
}
