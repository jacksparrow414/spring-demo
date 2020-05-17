package com.learn.spring.spring01.service;

/**
 * @author duhongbo
 * @date 2020/5/16 9:30
 */
public class UserServiceImpl {
    private SchoolServiceImpl schoolService;

    // 使用构造器
    public UserServiceImpl(SchoolServiceImpl schoolService) {
       this.schoolService = schoolService;
    }

    public String getSchoolServiceMethod(){
        return schoolService.getTimeStr();
    }

    // set 方法注入时，需要提供set方法
//    public void setSchoolService(SchoolServiceImpl schoolService) {
//        this.schoolService = schoolService;
//    }

}
