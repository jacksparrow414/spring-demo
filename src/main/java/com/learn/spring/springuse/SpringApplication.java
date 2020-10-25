package com.learn.spring.springuse;

import com.learn.spring.springuse.basic.service.SchoolServiceImpl;
import com.learn.spring.springuse.config.CustomConfigurationComplexProperties;
import com.learn.spring.springuse.config.CustomConfigurationProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@EnableConfigurationProperties({CustomConfigurationProperties.class, CustomConfigurationComplexProperties.class})
@SpringBootApplication
public class SpringApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(SpringApplication.class, args);
//	}
	
	// 注册一个bean，如果该bean是单例的，就创建、并实例化该bean，当真正使用的时候直接拿就行，如果是多例的，则是使用的时候才创建
//	public static void main(String[] args) {
//		// 读指定位置xml文件
//		// 将xml解析为Document文件
//		// 循环解析每个节点<bean>、<import>等
//		// 获得bean的BeanDefinition,注册bean,BeanFactory中的beanDefinitionMap缓存起来，K-xml中bean节点的id，V-BeanDefinition
//		// 注册bean完毕之后，会进行创建、实例化bean，在finishBeanFactoryInitialization(beanFactory)这个方法中进行
//		ApplicationContext context = new ClassPathXmlApplicationContext("SchoolService.xml");
//
//		//根据key,在DefaultSingletonBeanRegistry的singletonObjects这个map中拿到单例对象
//		SchoolServiceImpl service = context.getBean("schoolServiceImpl", SchoolServiceImpl.class);
//
//		System.out.println(service.getTimeStr());
//		System.out.println(service.getInStr("djk"));
//	}

	// 扫描注解
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("basic/schoolService.xml");
		// 如果开启了注解扫描，但是还是报schoolService 找不到，
		// 要看看SchoolServiceImpl配置了了名字没有
		// @Component 和@Service 默认当前bean的名字是类名的驼峰写法,即-schoolServiceImpl
		// 但是这里的名字是自定义的，所以，要在上面两个注解上配置value
		SchoolServiceImpl schoolService = context.getBean("schoolService", SchoolServiceImpl.class);
		System.out.println(schoolService.getTimeStr());
	}



}
