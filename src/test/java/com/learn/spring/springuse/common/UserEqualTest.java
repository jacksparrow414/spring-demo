package com.learn.spring.springuse.common;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.learn.spring.springuse.basic.entity.User;
import org.junit.Test;

import java.util.List;

/**
 * @author jacksparrow414
 * @date 2020-06-02
 * @description: TODO
 */
public final class UserEqualTest {

    /**
     * 判断同一个 类 的 两个 对象 是不是相等，分几种情况
     * 1、User没有重写equals和hashCode方法，此时User类的两个对象，userOne.equals(userTwo) 为false.
     * 因为，Java中所有的类都默认继承Object类，这里使用的Object类的equals方法，this == object,比较两个对象的地址，这肯定是不一样的
     *
     * 那么此时向Set、Map中添加将会是两条数据，而不是一条数据，同时，如果将这两个对象放到JDK 8 List里进行distinct，最终也是两条
     *
     * 2、重写了equals方法，但是却没有重写hashCode方法，那么此时 userOne.equals(userTwo) 为true.
     * 但是，向Set、Map中添加同样会是两条数据，同理对于List也是，因为这些集合底层是根据hashCode的值判断是不是相等
     *
     * 会先判断hashCode是不是一样的，如果一致，再去判断equals,因为有可能出现hash冲突的场景
     * 为什么会先判断hashCode呢？
     * 因为hashCode的操作要比equals快，hashCode就是个数字
     *
     * 3、同时重写equals和hashCode方法后，此时 userOne.equals(userTwo) 为true
     * 同时Set、Map中添加的数据将是一条，对于List也是，distinct之后将是一条
     *
     * 4、重写了equals和hashCode方法之后，一个类的两个对象初始是相等的，即刚刚new 出来的对象，还未设置任何属性时
     * userOne.equals(userTwo) 为true
     *
     * 一旦为这两个对象的属性设置值之后，如果设置属性相同，则为true；如果设置属性不同，则为false。
     * 前提是，设置的属性，是在equals、hashCode中的属性
     *
     * 例如：下面的age是没有在equals方法和hashCode中的，所以，即使age不同，最后判断两个对象也是相同的
     *
     */
    @Test
    public void assertEqual() {
        
        User userOne = new User();
        userOne.setAge(12);
      //  userOne.setId(1);
      //  userOne.setName("ok");
        User userTwo = new User();
      //  userTwo.setId(1);
      //  userTwo.setName("ok");
        userTwo.setAge(13);
        System.out.println(userOne.equals(userTwo));
    }

    /**
     * 关于guava新集合类型使用示例见<a href="https://github.com/google/guava/wiki/CollectionUtilitiesExplained#multimaps">官方文档</a>
     */
    @Test
    public void assertObjectEqual() {
        User first = new User();
        first.setId(1);
        first.setName("ok");
        User second = new User();
        second.setId(1);
        second.setName("ok");
        // 普通list是不具有过滤重复元素的性质的
        List<User> list = Lists.newArrayList(first, second);
        System.out.println(list.size());
        // 对于两个相同的对象， HashMultimap只会有一个
        Multimap<Integer, User> multimap = HashMultimap.create();
        multimap.put(1, first);
        multimap.put(1, second);
        System.out.println(multimap.values().size());
    }
}
