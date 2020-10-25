package com.learn.spring.springuse.basic.service.beannaming.oneclassmoreinstances;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 当注入的类有多个
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */
@Component
public class BeanNameComponent {
    
    @Autowired
    private BeanNameService beanNameService;
}
