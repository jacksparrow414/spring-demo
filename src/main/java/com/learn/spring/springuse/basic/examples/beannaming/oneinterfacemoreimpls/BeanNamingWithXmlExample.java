package com.learn.spring.springuse.basic.examples.beannaming.oneinterfacemoreimpls;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jacksparrow414
 * @date 2020/10/25
 */
public class BeanNamingWithXmlExample {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic/beannaming/oneinterfacemoreimpls/OneInterfaceMoreImpls.xml");
        applicationContext.getBean("xmlComponent");
    }
}
