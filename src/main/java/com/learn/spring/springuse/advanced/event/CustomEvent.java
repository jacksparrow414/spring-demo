package com.learn.spring.springuse.advanced.event;

import org.springframework.context.ApplicationEvent;

/**
 * 发布/监听机制的自定义事件.<br/>
 * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#context-functionality-events">Spring官方关于Event以及Spring的Event类型文档</a>
 *
 * 一般自定义事件继承ApplicationEvent，并且要有构造方法.构造方法一般是事件类的属性+Object source,并且使用父类的构造方法super(source)
 */
public class CustomEvent extends ApplicationEvent {

    private final String name;

    public CustomEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
