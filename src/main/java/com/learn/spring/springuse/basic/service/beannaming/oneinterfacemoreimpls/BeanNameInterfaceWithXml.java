package com.learn.spring.springuse.basic.service.beannaming.oneinterfacemoreimpls;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author jacksparrow414
 * @date 2020/10/25
 */
public class BeanNameInterfaceWithXml {

    private BeanNameService beanNameService;
    
    /**
     * 搭配xml文件中的<qualifier value="First"/>使用
     * @param beanNameService
     */
    public BeanNameInterfaceWithXml(@Qualifier(value = "First") BeanNameService beanNameService) {
        this.beanNameService = beanNameService;
    }
}
