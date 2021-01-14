package com.learn.spring.springuse.basic.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * EqualsAndHashCode 注解是重写equals和hashCode方法，of代表的是对哪些属性进行重写
 * @author jacksparrow414
 * @date 2020/5/16 9:29
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"id","name"})
public class User implements Serializable {

    private Integer id;
    private String name;

    private Integer age;

}
