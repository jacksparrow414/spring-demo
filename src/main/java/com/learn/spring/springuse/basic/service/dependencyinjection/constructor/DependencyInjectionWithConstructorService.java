package com.learn.spring.springuse.basic.service.dependencyinjection.constructor;

/**
 * 通过构造方法注入依赖的属性
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */
public class DependencyInjectionWithConstructorService {
    
    private DependencyInjectiondContructorService injectiondContructorService;
    
    /**
     * 通过构造方法(构造器)注入依赖的属性
     * <constructor-arg ref="injectionedContructorService"/>
     * @param injectiondContructorService injectiondContructorService
     */
    public DependencyInjectionWithConstructorService(DependencyInjectiondContructorService injectiondContructorService) {
        this.injectiondContructorService = injectiondContructorService;
    }
    
    /**
     * 调用注入对象的方法
     * @return string
     */
    public String callInjectionClassMethod() {
        return injectiondContructorService.injection();
    }
}
