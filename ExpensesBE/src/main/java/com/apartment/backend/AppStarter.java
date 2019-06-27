package com.apartment.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScans({@ComponentScan("com.apartment.service"), @ComponentScan("com.apartment.repo"), @ComponentScan("com.apartment.controller")})

//@EnableJpaRepositories
public class AppStarter {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(AppStarter.class, args);
//		for (String beanName : appContext.getBeanDefinitionNames()) {
//			System.out.println(beanName);
//		}
		
		

	}

}
