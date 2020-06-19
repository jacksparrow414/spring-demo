package com.learn.spring.spring01.common;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author duhongbo
 * @date 2020/6/19 17:14
 */
@SpringBootTest
public class JavaCopyTest {

    @Test
   public void testBasicTypeCopy(){
        int basicInt1 = 78;
        int basicInt2 = basicInt1;
        basicInt2 = 99;
        String basicStr1 = "basicStr1";
        String basicStr2 = basicStr1;
        basicStr2 = "basicStr2";

        Integer basicInte1 = new Integer(11);
        Integer basciInte2 = basicInte1;
        basciInte2 = 789;
        System.out.println(basicInt1);
        System.out.println(basicInt2);
        System.out.println(basicStr1);
        System.out.println(basicStr2);
        System.out.println(basicInte1);
        System.out.println(basciInte2);
    }

    @Test
    public void testArrayAndListCopy(){

    }
}
