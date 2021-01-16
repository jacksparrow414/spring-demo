package com.learn.spring.springuse.advanced.event;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author jacksparrow414
 * @date 2021/1/16 11:11
 */
@Configuration
@Import(value = {CustomPublisher.class, CustomListener.class, CustomAnnotationListener.class})
public class CustomEventConfiguration {
}
