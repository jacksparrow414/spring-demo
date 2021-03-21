package com.learn.spring.springuse.basic.service.beaninstantiation.instancefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jacksparrow414
 * @date 2021/3/21
 */
@Slf4j
public class InstanceBeanImpl implements InstancedBean{
    @Override
    public String getInfo() {
        String info = "this is InstanceBeanImpl";
        log.info(info);
        return info;
    }
}
