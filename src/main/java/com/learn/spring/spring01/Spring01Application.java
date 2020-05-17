package com.learn.spring.spring01;

import com.learn.spring.spring01.service.SchoolServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Spring01Application {

//	public static void main(String[] args) {
//		SpringApplication.run(Spring01Application.class, args);
//	}

	// 依赖注入-set方法、构造器方式
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("UserService.xml");
//
//		UserServiceImpl service = context.getBean("userService", UserServiceImpl.class);
//		SchoolServiceImpl schoolService = context.getBean("schoolService", SchoolServiceImpl.class);
//		System.out.println(schoolService.getInStr("kkk"));
//		System.out.println(service.getSchoolServiceMethod());
//	}

	// 注册一个bean，如果该bean是单例的，就创建、并实例化该bean，当真正使用的时候直接拿就行，如果是多例的，则是使用的时候才创建
//	public static void main(String[] args) {
//		// 读指定位置xml文件
//		// 将xml解析为Document文件
//		// 循环解析每个节点<bean>、<import>等
//		// 获得bean的BeanDefinition,注册bean,BeanFactory中的beanDefinitionMap缓存起来，K-xml中bean节点的id，V-BeanDefinition
//		// 注册bean完毕之后，会进行创建、实例化bean，在finishBeanFactoryInitialization(beanFactory)这个方法中进行
//		ApplicationContext context = new ClassPathXmlApplicationContext("schoolService.xml");
//
//		//根据key,在DefaultSingletonBeanRegistry的singletonObjects这个map中拿到单例对象
//		SchoolServiceImpl service = context.getBean("schoolServiceImpl", SchoolServiceImpl.class);
//
//		System.out.println(service.getTimeStr());
//		System.out.println(service.getInStr("djk"));
//	}

	// 扫描注解
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("schoolService.xml");
		SchoolServiceImpl schoolService = context.getBean("schoolService", SchoolServiceImpl.class);
		System.out.println(schoolService.getTimeStr());
	}



}
