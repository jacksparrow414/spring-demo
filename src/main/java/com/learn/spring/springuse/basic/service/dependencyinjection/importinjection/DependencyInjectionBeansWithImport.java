package com.learn.spring.springuse.basic.service.dependencyinjection.importinjection;

/**
 * 依赖多个属性。通过<import resource=""/>标签导入
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */

public class DependencyInjectionBeansWithImport {
    
    private DependencyInjectionFirstBean firstBean;
    
    private DependencyInjectionSecondBean secondBean;
    
    public DependencyInjectionBeansWithImport( DependencyInjectionFirstBean firstBean, DependencyInjectionSecondBean secondBean) {
        this.firstBean = firstBean;
        this.secondBean = secondBean;
    }
}
