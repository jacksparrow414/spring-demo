package com.learn.spring.springuse.basic.service.beannaming.oneinterfacemoreimpls;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 【配置说明】
 * 此Java配置类等同于XML文件中的配置.@Configuration 和 @Bean结合使用
 * <beans>
 *     <bean id="firstBean" class="com.learn.spring.springuse.basic.service.beannaming.oneinterfacemoreimpls.FirstBeanNameServiceImpl"/>
 *     <bean id="secondBean" class="com.learn.spring.springuse.basic.service.beannaming.oneinterfacemoreimpls.SecondBeanNameServiceImpl"/>
 * </beans>
 *
 * 【返回类型说明】
 * Spring官方建议使用接口作为返回类型比较安全.
 * 	If you consistently refer to your types by a declared service interface,
 * 	your @Bean return types may safely join that design decision.
 * 	However, for components that implement several interfaces
 * 	or for components potentially referred to by their implementation type,
 * 	it is safer to declare the most specific return type possible
 * 	(at least as specific as required by the injection points that refer to your bean).
 *
 * 文档<a href="https://docs.spring.io/spring-framework/docs/5.3.0-SNAPSHOT/spring-framework-reference/core.html#beans-java-bean-annotation"/>
 *
 * 当然也可以返回具体的类的类型。比如这里可以直接返回FirstBeanNameServiceImpl、SecondBeanNameServiceImpl
 *
 * 【@Bean注解说明】
 * 对于@Bean注解，默认的bean的名字是方法的名字,这里默认的Bean的名字就是firstBean、secondBean
 *
 * By default, the bean name is the same as the method name.
 *
 * 文档<a href="https://docs.spring.io/spring-framework/docs/5.3.0-SNAPSHOT/spring-framework-reference/core.html#beans-java-declaring-a-bean"/>
 *
 * 【加载@Bean注解说明】
 * 如果两个@Bean注解上标注的name一样，则会按照编码顺序，第一个被找到的会被加载
 * @author jacksparrow414
 * @date 2020/10/25
 */
@Configuration
public class BeanNameConfiguration {
    
    /**
     * 自定义bean的名字为First
     * @return FirstBeanNameServiceImpl
     */
    @Bean(name = "First")
    public BeanNameService firstBean() {
        return new FirstBeanNameServiceImpl();
    }
    
    /**
     * 自定义bean的名字为Second
     * @return SecondBeanNameServiceImpl
     */
    @Bean(name = "Second")
    public BeanNameService secondBean() {
        return new SecondBeanNameServiceImpl();
    }
}
