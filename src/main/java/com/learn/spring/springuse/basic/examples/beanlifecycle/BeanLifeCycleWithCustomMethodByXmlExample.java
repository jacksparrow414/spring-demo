package com.learn.spring.springuse.basic.examples.beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 在xml中使用自定义的init-method、destroy-method的示例
 *
 * 更详细解释见{@link BeanLifeCycleWithPostAnnotationExample}
 * @author jacksparrow414
 * @date 2021/1/19 15:50
 */
public class BeanLifeCycleWithCustomMethodByXmlExample {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic/beanlifecycle/BeanLifeCycleWithCustomMethod.xml");
        applicationContext.close();
    }
}
