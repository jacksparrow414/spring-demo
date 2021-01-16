package com.learn.spring.springuse.advanced.spel;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * SpelEntity.
 */
@Getter
@Setter
public class SpelEntity {

    private Integer age;

    private String name;

    private Boolean child;

    private List<String> list;

    private Map<Integer, Integer> map;

    private SpelAnotherEntity anotherEntity;

    private List<SpelAnotherEntity> objectList;

    private Map<String, SpelAnotherEntity> objectMap;
}
