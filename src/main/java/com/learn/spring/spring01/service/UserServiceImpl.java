package com.learn.spring.spring01.service;

import com.learn.spring.spring01.entity.User;

/**
 * @author duhongbo
 * @date 2020/5/16 9:30
 */
public class UserServiceImpl {

    private User user;

    public String getUserInfo(){
        return user.toString();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
