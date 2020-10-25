package com.learn.spring.springuse.basic.service.dependencyinjection.importinjection;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * 通过@Import注解达到和<import resource=""></>标签同样的效果
 *
 * 但是@Import可以导入一些普通的类，
 * 即一开始没有被component-scan扫到，没有@Component、@Service等注解.
 * 一开始没有被spring加载进容器里的bean。通过@Import注解导入，注入进来的bean的默认名字是类的全名
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */
@Component
@Import(value = {DependencyInjectionFirstBean.class, DependencyInjectionSecondBean.class})
public class DependencyInjectionBeansImportWithJava {
    
    private DependencyInjectionFirstBean firstBean;
    
    private DependencyInjectionSecondBean secondBean;
    
    public DependencyInjectionBeansImportWithJava(DependencyInjectionFirstBean firstBean, DependencyInjectionSecondBean secondBean) {
        this.firstBean = firstBean;
        this.secondBean = secondBean;
    }
}
