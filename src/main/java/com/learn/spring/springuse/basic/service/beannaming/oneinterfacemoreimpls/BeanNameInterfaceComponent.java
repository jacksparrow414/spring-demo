package com.learn.spring.springuse.basic.service.beannaming.oneinterfacemoreimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 注入属性时，使用Autowired注入
 *
 * 也可以使用@Resource(name ="beanName")进行注入.其中的name为bean的名字
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
    @Autowired
    @Qualifier(value = "First")
        
    //@Resource(name = "First")
    private BeanNameService beanNameService;
}
