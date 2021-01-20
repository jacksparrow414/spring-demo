package com.learn.spring.springuse.advanced.examples.conditional;

import com.learn.spring.springuse.advanced.conditional.ConditionComponent;
import com.learn.spring.springuse.advanced.conditional.ConditionalOnBeanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 当@ConditionalOnBean的注解的value属性的类有实例时，配置或者方法生效.</br>
 *
 * 对于@CondtionalXXX各种注解，一般使用场景是自动配置中使用
 * <a href="https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-condition-annotations">Condition整体文档</a>
 *
 * <pre>涉及到的注解都有
 * <ul>
 *     <li>@ConditionalOnBean(Spring容器中【存在】对应的bean，注解标注的类或者方法生效)</li>
 *     <li>@ConditionalOnMissingBean(Spring容器中【不存在】对应的bean，注解标注的类或者方法生效)</li>
 *     <li>@ConditionalOnClass(简单理解为项目依赖的jar包中【有】这个注解的属性的类，注解标注的类或者方法生效)</li>
 *     <li>@ConditionalOnMissingClass(简单理解为项目依赖的jar包中【没有】这个注解的属性的类，注解标注的类或者方法生效)</li>
 *     <li>@ConditionalOnProperty(Spring配置文件中对应的属性存在，并且和设置的值一样，注解标注的类或者方法生效)</li>
 *     <li>@ConditionalOnResource(外部配置文件存在时，注解标注的类或者方法生效)</li>
 * </ul>
 * </pre>
 * 具体各个注解的作用及说明可参考其他示例的注释
 * @author jacksparrow414
 * @date 2021/1/20 10:17
 */
public class ConditionOnBeanExample {

    public static void main(String[] args) {
        // 注意：这里ConditionalOnBeanConfiguration是依赖ConditionComponent的，特意将ConditionComponent的顺序放在后面，最终结果是不受影响的
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionalOnBeanConfiguration.class, ConditionComponent.class);
        // 由于具有ConditionComponent的实例，所以可以拿到依赖此条件实例的beanconditionalOnBeanComponent
        applicationContext.getBean("conditionalOnBeanComponent");
    }
}
