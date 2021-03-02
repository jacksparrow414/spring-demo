package com.learn.spring.springuse.advanced.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.Arrays;

/**
 * @author jacksparrow414
 * @date 2021/3/2 9:42
 */
@Slf4j
@EnableAspectJAutoProxy
@Aspect
@Configuration
public class CustomAspect {

    /**
     * execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern)
     *                 throws-pattern?)
     *  modifiers-public、private、protected
     *  +
     *  空格
     *  + com.package..*
     *  + *.
     *  + param-pattern (..)
     *
     * 更多切点表达式的详见<a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#aop-pointcuts-examples">AOP文档</a>
     */
    @Pointcut("execution(* com.learn.spring.springuse..*.execute*(..))")
    public void pointCut() {}

    @Before("pointCut()")
    public void before() {
        log.info("this is before execute method");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        log.info("around before");
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        String[] parameterNames = signature.getParameterNames();
        Arrays.stream(parameterNames).forEach(each -> {
            log.info("参数名为{}", each);
        });
        Arrays.stream(pjp.getArgs()).forEach(each -> {
            log.info("参数值为{}", each);
        });
        Object result = pjp.proceed();
        log.info("around after");
        return result;
    }

    @After("pointCut()")
    public void after() {
        log.info("this is after execute method");
    }

    /**
     * 执行方法完毕之后获取返回值.
     * @param value 返回值 returning的值和方法的参数值名字要一样
     * @return java.lang.Object
     */
    @AfterReturning(value = "pointCut()", returning = "value")
    public Object afterReturn(Object value) {
        log.info("value is {}", value);
        return value;
    }

    /**
     * 执行方法出现异常获取异常.
     * @param ex 返回值 throwing的值和方法的参数值名字要一样
     */
    @AfterThrowing(value = "pointCut()", throwing = "ex")
    public void afterThrowException(ArithmeticException ex) {
        log.error("执行方法过程中出错", ex);
    }
}
