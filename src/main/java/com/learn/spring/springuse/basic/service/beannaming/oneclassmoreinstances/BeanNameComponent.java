package com.learn.spring.springuse.basic.service.beannaming.oneclassmoreinstances;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 当注入的类有多个,同样要指定具体的bean的名字
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */
@Component
public class BeanNameComponent {
    
    @Autowired
    @Qualifier(value = "firstBean")
    private BeanNameService beanNameService;
}
