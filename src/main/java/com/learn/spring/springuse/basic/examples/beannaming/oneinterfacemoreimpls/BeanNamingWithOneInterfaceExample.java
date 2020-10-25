package com.learn.spring.springuse.basic.examples.beannaming.oneinterfacemoreimpls;

import com.learn.spring.springuse.basic.service.beannaming.oneinterfacemoreimpls.BeanNameConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 一个接口多个实现的bean加载.
 *
 * spring会根据配置文件xml中指定的id、@Bean注解指定的name，
 * 如果注解没有name指定，则会默认为一个bean生成一个名字。
 * 默认名字为当前@Bean注解标注的方法的名字
 *
 * 其他注解例如@Component、@Service注解,默认都是类的驼峰命名法，例如类叫AkName,则默认bean的名字为akName,也可以通过value指定
 * 自定义的名字
 *
 * spring官方文档：<a href="https://docs.spring.io/spring-framework/docs/5.3.0-SNAPSHOT/spring-framework-reference/core.html#beans-beanname"/>
 * Every bean has one or more identifiers.
 * These identifiers must be unique within the container that hosts the bean.
 * A bean usually has only one identifier.
 * However, if it requires more than one, the extra ones can be considered aliases
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */
public class BeanNamingWithOneInterfaceExample {
    
    public static void main(String[] args) {
        //1、接收一个使用或者多个使用了spring注解的类
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
        //2、获取bean
        applicationContext.getBean("First");
        applicationContext.getBean("Second");
    }
}
