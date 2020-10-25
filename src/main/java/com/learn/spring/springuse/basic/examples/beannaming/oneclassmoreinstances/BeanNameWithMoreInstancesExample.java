package com.learn.spring.springuse.basic.examples.beannaming.oneclassmoreinstances;

import com.learn.spring.springuse.basic.service.beannaming.oneclassmoreinstances.BeanNameComponent;
import com.learn.spring.springuse.basic.service.beannaming.oneclassmoreinstances.BeanNameWithClassConfiguration;
import com.learn.spring.springuse.basic.service.beannaming.oneinterfacemoreimpls.BeanNameInterfaceComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 和接口{@link BeanNameInterfaceComponent}一样,
 * 对于返回的bean的类型是具体类的时候，如果有多个该类的对象，则必须指明调用的是哪一个，
 * 否则依旧会报expected single matching bean but found 2 错误
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */
public class BeanNameWithMoreInstancesExample {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanNameComponent.class, BeanNameWithClassConfiguration.class);
        applicationContext.getBean("firstBean");
    }
}
