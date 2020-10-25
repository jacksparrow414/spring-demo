package com.learn.spring.springuse.basic.service.beannaming.oneclassmoreinstances;

import com.learn.spring.springuse.basic.service.beannaming.oneinterfacemoreimpls.BeanNameConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 这里实例化Bean返回的不再是接口类型{@link BeanNameConfiguration}，
 * 而是具体的类的类型
 *
 * @author jacksparrow414
 * @date 2020/10/25
 */
@Configuration
public class BeanNameWithClassConfiguration {
    
    @Bean
    public BeanNameService firstBean() {
        return new BeanNameService();
    }
    
    @Bean BeanNameService secondBean() {
        return new BeanNameService();
    }
}
