package com.learn.spring.springuse.basic.examples.beannaming.oneinterfacemoreimpls;

import com.learn.spring.springuse.basic.service.beannaming.oneinterfacemoreimpls.BeanNameConfiguration;
import com.learn.spring.springuse.basic.service.beannaming.oneinterfacemoreimpls.BeanNameInterfaceComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 一个接口多个实现类，那么此时注入必须要明确注入的Bean的类型.
 * 1、要么通过@Autowired和@Qualifier(value="具体的bean的名字")
 * 2、要么通过@Resource(name="具体的bean的名字")
 * 3、要么通过@Autowired和@Primary结合，那么此时autowired的是@Primary标注的实现类
 *
 * 问：不知道具体的实现类的bean的名字，怎么办？
 * 答：默认bean的名字为类的驼峰写法。参见{@link BeanNamingWithOneInterfaceExample}的注释
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */
public class BeanNamingMoreImplExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanNameConfiguration.class,BeanNameInterfaceComponent.class);
        applicationContext.getBean("First");
    }
}
