package com.learn.spring.springuse.basic.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author jacksparrow414
 * @date 2021/1/1
 */
@Getter
@Setter
@ToString
public class UserItem {
    /**
     * 1个字节.默认值0
     */
    private byte basicByte;
    
    /**
     * 2个字节。默认值0
     */
    private short basicShort;
    
    /**
     * 4个字节.默认值0
     */
    private int basicInt;
    
    /**
     * 4个字节。默认值0.0f
     */
    private float basicFloat;
    
    /**
     * 8个字节.默认值-0
     */
    private long basicLong;
    
    /**
     * 8个字节.默认值-0.0
     */
    private double basicDouble;
    
    /**
     * 1个字节.默认值-false
     */
    private boolean basicBoolean;
    
    /**
     * 2个字节
     */
    private char basicChar;
    
    /**
     * 所有包装类都属于引用类型，引用类型都是4个字节。默认值-null
     */
    private Integer warpInt;
    
    /**
     * 数组也属于引用类型，引用类型都是4个字节。默认值-null
     */
    private int[] arrays;
}
