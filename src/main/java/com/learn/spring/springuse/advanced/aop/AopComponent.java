package com.learn.spring.springuse.advanced.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author jacksparrow414
 * @date 2021/3/2 10:23
 */
@Slf4j
@Component
public class AopComponent {

    private static final String MESSAGE = "message";

    /**
     * 切点方法.
     * 如果符合切点表达式，方法上面有图标
     */
    public String executeMethod(String param) {
        String result = MESSAGE;
        if (!StringUtils.isEmpty(param)) {
            result = param;
        }
        int tmp = 1/0;
        return result;
    }
}
