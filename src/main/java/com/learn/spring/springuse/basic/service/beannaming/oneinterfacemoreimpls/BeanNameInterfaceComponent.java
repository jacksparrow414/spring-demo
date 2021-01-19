package com.learn.spring.springuse.basic.service.beannaming.oneinterfacemoreimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 注入属性时，使用Autowired注入
 *
 * 也可以使用@Resource(name ="beanName")进行注入.其中的name为bean的名字
 *
 * 还可以使用@Autowired和@Primary一起使用进行注入
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */
@Component
public class BeanNameInterfaceComponent {
    
    /**
     * 当Autowired注入的类型是接口类型，如果此时该接口有多个实现，
     * 必须使用@Qualifier指定其具体的实现的bean的名字.
     * 否则会报 No qualifying bean of type,expected single matching bean but found 2
     */
//    @Autowired
//    @Qualifier(value = "First")
//    private BeanNameService beanNameService;

    /**
     * 可以直接通过bean的name指定要注入的哪个实现类.
     */
//     @Resource(name = "First")
//     private BeanNameService beanNameService;

    /**
     * 当一个接口有多个实现类时,还可以采取第三种方法，即在多个实现类中选取一个主要的.
     */
    @Autowired
    private BeanNameService beanNameService;
}
