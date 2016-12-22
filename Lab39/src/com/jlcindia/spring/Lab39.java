package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab39 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		System.out.println("Spring Container is Ready...");
		System.out.println("-----------------");
		TestBean tb = (TestBean)ctx.getBean("test");
		tb.show();
	}

}