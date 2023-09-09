package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/ciconfig.xml");
	
	Person person1 = (Person)context.getBean("person");
	System.out.println(person1);
	}

}
