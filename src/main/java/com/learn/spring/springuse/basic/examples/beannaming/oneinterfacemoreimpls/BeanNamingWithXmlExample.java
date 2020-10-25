package com.learn.spring.springuse.basic.examples.beannaming.oneinterfacemoreimpls;

import com.learn.spring.springuse.basic.service.beannaming.oneinterfacemoreimpls.BeanNameInterfaceWithXml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * xml标签<qualifier value="xxx/>结合注解@Qualifier一起使用
 * 使用见{@link BeanNameInterfaceWithXml}
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */
public class BeanNamingWithXmlExample {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic/beannaming/oneinterfacemoreimpls/OneInterfaceMoreImpls.xml");
        applicationContext.getBean("xmlComponent");
    }
}
