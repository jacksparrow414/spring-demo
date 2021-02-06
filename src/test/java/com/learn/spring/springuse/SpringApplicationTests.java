package com.learn.spring.springuse;

import com.learn.spring.springuse.advanced.conditional.ConditionalOnPropertyConfiguration;
import org.junit.Test;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

public final class SpringApplicationTests {

	private final ApplicationContextRunner contextRunner = new ApplicationContextRunner();

	@Test
	public void contextLoads() {
	}

	@Test
	public void assertCustomProperties() {
		contextRunner.withPropertyValues("jack.sparrow.code=3")
				.withUserConfiguration(ConditionalOnPropertyConfiguration.class).run(context -> {
					context.getBean("conditionalOnBeanComponent");
		});
	}

}
