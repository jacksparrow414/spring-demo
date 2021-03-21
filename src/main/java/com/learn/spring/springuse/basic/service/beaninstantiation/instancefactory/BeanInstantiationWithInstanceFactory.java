package com.learn.spring.springuse.basic.service.beaninstantiation.instancefactory;

/**
 * @author jacksparrow414
 * @date 2021/3/21
 */
public class BeanInstantiationWithInstanceFactory {
    
    private static InstancedBean instanceBean= new InstanceBeanImpl();
    
    public InstancedBean getInstanceBean() {
        return instanceBean;
    }
}
