package com.learn.spring.spring01;

import com.learn.spring.spring01.service.SchoolServiceImpl;
import com.learn.spring.spring01.service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Spring01Application {

//	public static void main(String[] args) {
//		SpringApplication.run(Spring01Application.class, args);
//	}

	// 依赖注入
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("UserService.xml");
//
//		UserServiceImpl service = context.getBean("userService", UserServiceImpl.class);
//
//		System.out.println(service.getUserInfo());
//	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("schoolService.xml");

		SchoolServiceImpl service = context.getBean("schoolService", SchoolServiceImpl.class);

		System.out.println(service.getTimeStr());
	}

}
