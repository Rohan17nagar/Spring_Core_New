package com.springcore.annotationbasedconfig.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springcore.annotationbasedconfig.beans")
public class JavaConfigTeacher {

	@Bean
	public Teacher getTeacher() {
		Teacher t = new Teacher();
		return t;
	}
	
	

}
