package com.learn.spring.springuse.basic.service.dependencyinjection.setter;

/**
 * 被依赖的类
 *
 * @see DependencyInjectionWithSetService
 * @author jacksparrow414
 * @date 2020/10/25
 */
public class DependencyInjectionedService {
    
    public String injection() {
        return "injection successful with set";
    }
}
