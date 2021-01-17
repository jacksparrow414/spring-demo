package com.learn.spring.springuse.advanced.spel;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

/**
 * SpelEntity.
 */
@Getter
@Setter
public class SpelEntity {

    private Integer age = new Integer(2021);

    private String name = "jacksparrow";

    private Boolean child;

    private List<String> list;

    private Map<Integer, Integer> map;

    private SpelAnotherEntity anotherEntity;

    private List<SpelAnotherEntity> objectList;

    private Map<String, SpelAnotherEntity> objectMap;
    
    /**
     * 实例方法.
     */
    public Date myDate() {
        return Calendar.getInstance().getTime();
    }
}
