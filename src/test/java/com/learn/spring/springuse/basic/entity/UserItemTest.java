package com.learn.spring.springuse.basic.entity;

import org.junit.Test;
import org.openjdk.jol.info.ClassLayout;

/**
 * @author jacksparrow414
 * @date 2021/1/1
 */
public final class UserItemTest {
    
    
    @Test
    public void assertJavaBasicDataType() {
        UserItem userItem = new UserItem();
        System.out.println(ClassLayout.parseInstance(userItem).toPrintable());
        System.out.println(userItem);
    }
}