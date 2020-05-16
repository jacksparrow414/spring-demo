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

	//
	public static void main(String[] args) {
		// 读指定位置xml文件
		// 将xml解析为Document文件
		// 循环解析每个节点<bean>、<import>等
		// 获得bean的BeanDefinition,注册bean,BeanFactory中的beanDefinitionMap缓存起来，K-xml中bean节点的id，V-BeanDefinition

		ApplicationContext context = new ClassPathXmlApplicationContext("schoolService.xml");

		//根据key,拿到BeanDefinition
		SchoolServiceImpl service = context.getBean("schoolService", SchoolServiceImpl.class);

		System.out.println(service.getTimeStr());
		System.out.println(service.getInStr("djk"));
	}

}
