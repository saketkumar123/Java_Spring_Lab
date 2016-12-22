package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab_Q64B {

	public static void main(String[] args) {
		
		//With IOC
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jlcindia.xml");
		System.out.println("Spring Container is Ready");
		System.out.println("-----------------");
		Hello h1 = (Hello)ctx.getBean("hello");
		Hai h2 = (Hai)ctx.getBean("hai");
		h1.show();
		h2.show();
		
	}

}