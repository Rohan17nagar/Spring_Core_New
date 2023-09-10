package com.springcore.annotationbasedconfig.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springcore.annotationbasedconfig.JavaConfig;

public class TestTeacher {

 public static void main(String[] args) {
	// TODO Auto-generated method stub
	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigTeacher.class);
	
	Teacher teacher1 = context.getBean("getTeacher",Teacher.class);
	System.out.println(teacher1);
}	
}
