package com.learn.spring.springuse.basic.service.dependencyinjection.setter;

/**
 * 使用set方法进行依赖注入
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */
public class DependencyInjectionWithSetService {
    
    private DependencyInjectionedService injectionService;
    
    /**
     * 通过set方法注入依赖的属性
     * bean中的配置
     * <property name="injectionService" ref="injectionedService"/>
     * name属性是下面set方法去掉set的驼峰名字，必须可以对应的上，否则会找不到set方法
     * @param injectionService DependencyInjectionedService类的实例
     */
    public void setInjectionService(DependencyInjectionedService injectionService) {
        this.injectionService = injectionService;
    }
    
    /**
     * 调用注入对象的方法
     * @return string
     */
    public String callInjectionClassMethod() {
        return injectionService.injection();
    }
}
