package com.learn.spring.springuse.basic.examples.beaninstantiation.instancefactory;

import com.learn.spring.springuse.basic.service.beaninstantiation.instancefactory.InstancedBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jacksparrow414
 * @date 2021/3/21
 */
public class BeanInstantiationWithInstanceFactoryExample {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic/beaninstantiation/instancefactory/BeanInstantiationWithInstancefactory.xml");
        InstancedBean instanceBean = (InstancedBean) applicationContext.getBean("instanceBean");
        instanceBean.getInfo();
    }
}
