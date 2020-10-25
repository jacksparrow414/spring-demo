package com.learn.spring.springuse.basic.examples.dependencyinjection.importinjection;

import com.learn.spring.springuse.basic.service.dependencyinjection.importinjection.DependencyInjectionFirstBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 历史原因，一开始使用Spring的时候，每个有属性依赖的类的XML文件都要在xml文件中定义对应的bean，
 * 为了定义的bean可以重复利用。
 * 为每个bean都定义一个xml文件。
 * 需要的时候，通过<import resource="文件路径"/>导入所需要的类的xml文件即可即可使用
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */
public class DependencyInjectionWithImportExample {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic/dependencyinjection/importinjection/DependencyInjectionBeansWithImport.xml");
        applicationContext.getBean("dependencyInjectionFirstBean", DependencyInjectionFirstBean.class);
    }
}
