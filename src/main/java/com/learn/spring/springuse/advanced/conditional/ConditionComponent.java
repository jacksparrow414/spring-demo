package com.learn.spring.springuse.advanced.conditional;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author jacksparrow414
 * @date 2021/1/20 10:00
 */
@Slf4j
@Component
public class ConditionComponent {

    public ConditionComponent() {
        log.info("ConditionComponent进行初始化");
    }
}
