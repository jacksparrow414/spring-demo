package com.learn.spring.springuse.common;

import com.learn.spring.springuse.basic.entity.User;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.SneakyThrows;
import org.junit.Test;

/**
 *
 * Java中浅拷贝、深拷贝
 * @author duhongbo
 * @date 2020/6/19 17:14
 */
public final class JavaCopyTest {

    /**
     * 对于Java的8种基本类型及其包装类(int、byte、short、long、float、char、double、boolean)
     * 1、一个变量A直接赋值给另外一个变量B
     * 2、修改变量B不会影响变量A
     * 3、因为基本类型声明的时候是在内存中新建内存地址来存储，
     * 4、A、B属于不同的内存空间
     *
     * 注：String类型通过常量赋值时相当于基本数据类型，通过new关键字创建对象时便是引用数据类型
     * <a href = "https://www.cnblogs.com/genggeng/p/10065885.html"/>
     */
    @org.junit.Test
   public void testBasicTypeCopy(){
        int basicInt1 = 78;
        int basicInt2 = basicInt1;
        basicInt2 = 99;
        String basicStr1 = "basicStr1";
        String basicStr2 = basicStr1;
        basicStr2 = "basicStr2";

        String basicStr3 = new String("basicStr3");
        String basicStr4 = new String();
        basicStr4 = basicStr3;
        basicStr4 = "basicStr4";

        Integer basicInte1 = new Integer(11);
        Integer basciInte2 = basicInte1;
        basciInte2 = 789;
        System.out.println(basicInt1);
        System.out.println(basicInt2);
        System.out.println(basicStr1);
        System.out.println(basicStr2);
        System.out.println(basicInte1);
        System.out.println(basciInte2);
        System.out.println(basicStr3);
        System.out.println(basicStr4);
    }

    /**
     * 对于引用类型:数组、集合
     * 1、new 两个对象A、B
     * 2、将A赋值给B B = A
     * 3、改变B的值会影响A
     * 4、因为两个对象是对应的是同一块地址空间，所以改变B会改变A
     * 5、Debug发现两个List对象和Array对象都是同一个对象
     *
     */
    @Test
    public void testArrayAndListCopy(){
        List<Integer> basicList1 = new ArrayList<>();
        basicList1.add(12);
        List<Integer> basicList2 = new ArrayList<>();
        basicList2 = basicList1;
        basicList2.add(15);
        basicList1.forEach(System.out::println);
        System.out.println(basicList1.equals(basicList2));
        Integer[] basicArray1 = {1,2,3};
        Integer[] basicArray2 = new Integer[3];
        basicArray2 = basicArray1;
        basicArray2[2] = 4;
        Arrays.stream(basicArray1).forEach(System.out::println);
    }

    /**
     * 对于Java对象而言，新建两个User类的实例user1、user2，两个对象均通过new 新建
     * 把user1复制给user2 user2 = user1
     * 此时如果User类中的属性中包括引用类型的属性，如：String、List、数组
     * 那么改变user2中这些属性的值会同时改变user1中的值.
     * 对于基本类型则不会互相影响
     *
     * 由此引出Java中浅拷贝和深拷贝
     * 对于引用类型：默认都是浅拷贝，【即两个不同的对象的引用是相同的，都是指向内存中同一块内存空间】
     * 对于类
     * <pre>
     * class A {
     *
     *     private List<E> list;
     *     // B是另外一个类
     *     private B b;
     * }
     *</pre>
     * 那么此时类A的对象A1、A2所拿到的list和b是同样的
     *
     * 对于实际业务中，如何实现对象的深拷贝【序列化的方式】、
     * 数组/集合的深拷贝【只有新建，并且把集合中每个元素放到另外一个集合中去，这样才是深拷贝，其他方式都是浅拷贝】
     *
     * 一个对象的深拷贝可以通过序列化实现{@link JavaCopyTest#testObjectDeepCopy()}
     *
     * 关于深拷贝、浅拷贝可参考
     * <a href = "https://segmentfault.com/a/1190000018646675?utm_source=tag-newest#item-5"/>
     *
     * */
    @org.junit.Test
    public void testObjectCopy(){
        User user1 = new User();
        user1.setId(1);
        user1.setName("jack");
        user1.setAge(11);
        User user3 = new User();
        User user2 = new User();
        user2 = user1;
        user2.setName("sparrow");
        user2.setAge(111);
        System.out.println(user1.getName());
        System.out.println(user1.getAge());
    }
    
    /**
     * 使用序列化的形式进行深拷贝.深拷贝的对象必须实现Serializable接口
     */
    @org.junit.Test
    @SneakyThrows
    public void testObjectDeepCopy() {
        User source = new User();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(source);
        objectOutputStream.flush();
        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        User target = (User) objectInputStream.readObject();
        byteArrayOutputStream.close();
        objectOutputStream.close();
        objectInputStream.close();
    }
}
