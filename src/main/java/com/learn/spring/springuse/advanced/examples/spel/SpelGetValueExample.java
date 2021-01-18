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
 * Spel表达式从Java 对象中获取其属性值使用示例.
 * <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#expressions">Sprl官方文档</a>
 *
 * 重点阅读4.1到4.1.1之间的部分和4.3这一部分
 *
 * <a href="https://cloud.tencent.com/developer/article/1676200">基础教程</a>
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
        List<String> list = Lists.newArrayList("china", "usa", "china");
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
        
        // 访问集合属性时元素不存在或者index过大应该怎么防止报错？使用三目运算，假设我要访问第4个元素，判断list的size是否小于4，如果小于4则返回null
        log.info("访问集合时判断是否超过集合值为{}", parser.parseExpression("list.size() < 4 ? null:list[3]").getValue(spelEntity));
        
        // 当访问对象为空时，访问具体属性，会报NPE，为了防止直接抛出NPE，
        // 则可以先判断是否为null，具体格式为【对象?.属性】如下面的示例，这是会返回null，而不是抛异常
        // 文档https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#expressions-operator-safe-navigation
        
        //log.info("获取map中不存在的对象的属性会报NPE(Null Pointer Exception)异常{}", parser.parseExpression("objectMap['objectKeys'].date").getValue(spelEntity));
        log.info("获取map中不存在的对象的属性防止NPE(Null Pointer Exception)异常{}", parser.parseExpression("objectMap['objectKeys']?.date").getValue(spelEntity));
       
        // 调用具体方法时直接通过【.方法名】调用即可
        log.info("调用toUpperCase方法值为{}", parser.parseExpression("list[0].toUpperCase()").getValue(spelEntity));
        
        // 调用静态方法时，如某些工具类的某些静态方法，则通过 T(类的完全限定名.方法()) 这种方式调用
        // 如下面的调用Spring的StringUtils方法，类的完全限定名是类的完整名字
        // <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#expressions-types">官方文档</a>
        log.info("调用静态方法的方法值为{}", parser.parseExpression("T(org.springframework.util.StringUtils).capitalize(list[1])").getValue(spelEntity));

        // 按照过滤条件找出集合中符合条件的元素,过滤之后返回的是集合，如果在list中过滤，则返回list，在map中过滤，返回map
        // 使用格式     ?.[条件]
        // 这里使用#this，文档地址 - https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#expressions-this-root
        List<String> filterList = (List<String>) parser.parseExpression("list.?[#this =='china']").getValue(spelEntity);
        log.info("list集合过滤后的值为{}", filterList.get(0));

        // 对于map集合过滤，条件可以是key、value，因为map.entrySet()是key和vale
        // <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#expressions-collection-selection"/>
        Map<Integer, Integer> filterKeyMap = (Map<Integer, Integer>) parser.parseExpression("map.?[key == 1]").getValue(spelEntity);
        Map<Integer, Integer> filterValueMap = (Map<Integer, Integer>) parser.parseExpression("map.?[value == 100]").getValue(spelEntity);
        log.info("map集合Key过滤后的值为{}", filterKeyMap);
        log.info("map集合Value过滤后的值为{}", filterValueMap);

        // 对于集合过滤之后会返回满足条件的所有元素，如何返回第一个、最后一个匹配的元素
        // 返回第一个 .^[条件]
        // 返回最后一个 .$[条件]
        log.info("获取list中匹配的第一个值{}", parser.parseExpression("list.^[#this == 'china']").getValue(spelEntity));
        log.info("获取list中匹配的第一个值{}", parser.parseExpression("list.$[#this == 'china']").getValue(spelEntity));
    }
}
