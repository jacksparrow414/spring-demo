package com.learn.spring.springuse.advanced.examples.spel;

import com.learn.spring.springuse.advanced.spel.SpelEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * spel表达式给Java对象属性设值使用示例.
 * @author jacksparrow414
 * @date 2021/1/18 10:06
 */
@Slf4j
public class SpelSetValueExample {

    public static void main(String[] args) {
        SpelEntity spelEntity = new SpelEntity();
        ExpressionParser parser = new SpelExpressionParser();
        parser.parseExpression("age").setValue(spelEntity, 1010);
        parser.parseExpression("name").setValue(spelEntity, "jacksparrow414");
        log.info("SpelEntity设值之后的值{}", spelEntity);
    }
}
