//package com.packt.cardatabase;
//
//import org.apache.catalina.core.ApplicationContext;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//
//@SpringBootTest
//@ActiveProfiles("test")
//class CardatabaseApplicationTests {
//
//	@Autowired
//	private CardatabaseApplication context;
//
//	@Test
//	void contextLoads() {
//		// Check that the application context is not null
//		assertThat(context).isNotNull();
//
//		// Optionally, check for specific beans if you have them
//		// For example, if you have a repository or service
//		// assertThat(context.getBean(YourRepository.class)).isNotNull();
//		// assertThat(context.getBean(YourService.class)).isNotNull();
//
//		// You can also print out the names of beans loaded in the context
//		String[] beanNames = context.getBeanDefinitionNames();
//		System.out.println("Beans loaded:");
//		for (String beanName : beanNames) {
//			System.out.println(beanName);
//		}
//	}
//}
