package com.learn.spring.springuse.advanced.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 和{@link CustomListener}不同，不需要实现ApplicationListener接口，直接使用@EventListener注解即可
 */
@Slf4j
@Component
public class CustomAnnotationListener {

    @EventListener
    public void receiveEvent(CustomEvent customEvent) {
        log.info("注解监听者收到事件,事件内容{}", customEvent.getName());
    }

    /**
     *
     * 使用注解时，还可以使用condition条件来选择有条件接收，condition使用的是SPEL表达式
     * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#expressions">Spel官方文档</a>
     */
    @EventListener(condition = "#customEvent.name.equals('jack')")
    public void receiveEventDealSpel(CustomEvent customEvent) {
        log.info("spel接收到的名字为{}", customEvent.getName());
    }
}
