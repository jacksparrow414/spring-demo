package com.learn.spring.springuse.advanced.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 前提：监听者注册到Spring容器中
 * 自定义监听者.发布了事件、就要有对应的接收的.有两种方式实现接收事件。
 * 实现ApplicationListener或者不实现该接口，直接使用@EventListener,如{@link CustomAnnotationListener}
 *
 * 1、实现ApplicationListener接口，其泛型的具体类型是要接收的事件类
 * 2、在onApplicationEvent中处理接收到的事件
 */
@Slf4j
@Component
public class CustomListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        log.info("接收到事件,事件中的名字为{}", customEvent.getName());
    }
}
