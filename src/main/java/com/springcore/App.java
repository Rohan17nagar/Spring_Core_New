package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) context.getBean("Student1");
		Student student2 = (Student) context.getBean("Student2");// it returns an obj so we have to typecast value
		Student student3 = (Student) context.getBean("Student3");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		
		
		
		

	}
}
