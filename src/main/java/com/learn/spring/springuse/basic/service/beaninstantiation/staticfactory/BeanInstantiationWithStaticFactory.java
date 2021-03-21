package com.learn.spring.springuse.basic.service.beaninstantiation.staticfactory;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author jacksparrow414
 * @date 2021/3/21
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BeanInstantiationWithStaticFactory {
    
    private static BeanInstantiationWithStaticFactory bean = new BeanInstantiationWithStaticFactory();
    
    // 使用NoArgsConstructor注解并标注access为private，和下面的写法是一样的
//    private BeanInstantiationWithStaticFactory(){};
    
    public static BeanInstantiationWithStaticFactory getInstance() {
        return bean;
    }
}
