package com.learn.spring.springuse.advanced.spel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 *
 * 对于集合的初始化,使用{}表示，如果是map{:}表示空map,<a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#expressions-inline-lists">文档地址</a>
 *
 * 直接使用@Value注解，在里面直接写spel表达式即可，关于@Value相关可参考{@link SpelContentEntity}相关注释
 * @author jacksparrow414
 * @date 2021/1/18 14:32
 */
@Slf4j
@Component
public class SpelSetValueContextEntity {

    @Value("#{ {'jack', 'jan'} }")
    private List<String> integerList;

    @Value("#{ {1, 2,3} }")
    private List<Integer> stringList;

    @Value("#{ {'china':1, 'usa':2, 'japan':3} }")
    private Map<String, Integer> map;


    @Value("${jack.sparrow.name:noexist}")
    private String name;

    /**
     * 调用某个类的构造方法.
     */
    @Value("#{ new com.learn.spring.springuse.advanced.spel.SpelEntity() }")
    private SpelEntity spelEntity;

    /**
     * 调用静态方法.
     */
    @Value("#{ T(com.google.common.collect.Lists).newArrayList() }")
    private List<Integer> initListByGuava;

    @PostConstruct
    public void init() {
        integerList.forEach(System.out::println);
        stringList.forEach(System.out::println);
        map.forEach((k,v) -> {
            System.out.println(k);
            System.out.println(v);
        });
        log.info("初始化的spelEntity为{}", spelEntity);
        log.info("初始化guava的list大小为{}", initListByGuava.size());
        log.info("获取属性文件中不存在的属性默认值为{}", name);
    }
}
