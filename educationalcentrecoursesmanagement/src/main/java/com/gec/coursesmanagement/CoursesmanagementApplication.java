package com.gec.coursesmanagement;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gec.coursesmanagement.service.coursesmanagementServiceImpl;


@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.gec.coursesmanagement.controller","com.gec.coursesmanagement.model","com.gec.coursesmanagement.repository","com.gec.coursesmanagement.service"})
@EnableTransactionManagement
@EnableJpaRepositories

@SpringBootApplication
public class CoursesmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesmanagementApplication.class, args);
	}

}
