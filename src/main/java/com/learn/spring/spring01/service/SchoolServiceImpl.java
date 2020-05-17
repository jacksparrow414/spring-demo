package com.learn.spring.spring01.service;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author duhongbo
 * @date 2020/5/16 10:04
 */
@Component
public class SchoolServiceImpl {

    public String getTimeStr(){
      return   LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:MM:ss"));
    }

    public String getInStr(String str){
        return str;
    }
}
