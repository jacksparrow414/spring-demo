package com.learn.spring.springuse.basic.service;

/**
 * 依赖注入的两种形式
 *
 * 1、构造器注入依赖对象
 *
 * 2、使用set方法set依赖对象
 *
 * 这里特意不使用Lombok注解，是为了更清晰看到怎么使用的
 *
 * @author duhongbo
 * @date 2020/5/16 9:30
 */
public class UserServiceImpl {
    
    
    private SchoolServiceImpl schoolService;
    
    /**
     * 使用构造器
     */
    public UserServiceImpl(SchoolServiceImpl schoolService) {
       this.schoolService = schoolService;
    }
    
    /**
     * 使用set方法
     * @param schoolService 依赖的schoolService
     */
    public void setSchoolService(SchoolServiceImpl schoolService) {
        this.schoolService = schoolService;
    }
    
    /**
     * get方法
     * @return str
     */
    public String getSchoolServiceMethod(){
        return schoolService.getTimeStr();
    }

}
