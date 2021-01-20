package com.learn.spring.springuse.advanced.examples.conditional;

import com.learn.spring.springuse.advanced.conditional.ConditionalOnPropertyConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ConditionalOnProperty注解生效条件示例.
 * 因为此示例没有加载spring的application.yml文件，测不出来.
 *
 * 详细注释可参考{@link ConditionOnBeanExample}
 * @author jacksparrow414
 * @date 2021/1/20 10:45
 */
public class ConditionalOnPropertyExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionalOnPropertyConfiguration.class);
        // 手动注册bean
//        ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
//        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
//        genericBeanDefinition.setBeanClass(ConditionalOnPropertyConfiguration.class);
//        genericBeanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
//        beanFactory.registerSingleton("conditionalOnPropertyConfiguration", genericBeanDefinition);
        applicationContext.getBean("conditionalOnBeanComponent");
    }
}
