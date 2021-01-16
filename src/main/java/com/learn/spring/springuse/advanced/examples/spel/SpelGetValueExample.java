package com.learn.spring.springuse.advanced.examples.spel;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.learn.spring.springuse.advanced.spel.SpelAnotherEntity;
import com.learn.spring.springuse.advanced.spel.SpelEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * Spel表达式使用示例.
 * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#expressions">Sprl官方文档</a>
 *
 * 重点阅读4.1到4.1.1之间的部分和4.3这一部分
 */
@Slf4j
public class SpelGetValueExample {

    public static void main(String[] args) {
        SpelEntity spelEntity = new SpelEntity();
        // 普通属性
        spelEntity.setAge(1);
        spelEntity.setName("jack");
        spelEntity.setChild(Boolean.FALSE);

        // 集合属性
        List<String> list = Lists.newArrayList("china", "usa");
        spelEntity.setList(list);
        Map<Integer, Integer> map = Maps.newHashMap();
        map.put(1, 100);
        spelEntity.setMap(map);

        // 对象属性
        SpelAnotherEntity anotherEntity = new SpelAnotherEntity();
        anotherEntity.setDate(Calendar.getInstance().getTime());
        spelEntity.setAnotherEntity(anotherEntity);

        // 带有对象的集合属性
        List<SpelAnotherEntity> objectList = Lists.newArrayList(anotherEntity);
        spelEntity.setObjectList(objectList);

        Map<String, SpelAnotherEntity> objectMap = Maps.newHashMap();
        objectMap.put("objectKey", anotherEntity);
        spelEntity.setObjectMap(objectMap);

        ExpressionParser parser = new SpelExpressionParser();
        // 访问对象中具体属性时，直接通过【属性名】访问即可
        log.info("获取name属性的值为{}", parser.parseExpression("name").getValue(spelEntity));
        log.info("获取age属性的值为{}", parser.parseExpression("age").getValue(spelEntity));
        log.info("获取child属性的值为{}", parser.parseExpression("child").getValue(spelEntity));
        // 访问集合时，list直接通过index访问，map直接通过【key】访问，如果key是字符串，则通过【'key'】访问
        log.info("获取list第一项的值为{}", parser.parseExpression("list[0]").getValue(spelEntity));
        log.info("获取map属性中key为1的值为{}", parser.parseExpression("map[1]").getValue(spelEntity));
        // 获取属性或对象时，在getValue中需【设置返回的类型】是什么
        SpelAnotherEntity spelAnotherEntity = parser.parseExpression("anotherEntity").getValue(spelEntity, SpelAnotherEntity.class);
        log.info("获取spelEntity中的对象属性{}", spelAnotherEntity);
        log.info("获取spelEntity中的对象属性的属性{}", parser.parseExpression("anotherEntity.date").getValue(spelEntity));
        // 获取对象List的属性时，和正常一样list[index]获取到的是里面对象,访问对象的属性通过【.属性】
        log.info("访问对象List集合的属性{}", parser.parseExpression("objectList[0].date").getValue(spelEntity));
        // 获取对象Map属性时，返回类型设置为Map，用具体的Map<K, V>接收即可
        Map<String, SpelAnotherEntity> objectMap1 = parser.parseExpression("objectMap").getValue(spelEntity, Map.class);
        // 获取对象map中的value为对象时，访问具体属性，依旧通过【.属性】访问
        log.info("访问对象Map集合的属性{}", parser.parseExpression("objectMap['objectKey'].date").getValue(spelEntity));
    }
}
