package com.jlcindia.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab41 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		System.out.println("Spring Container is Ready...");
		System.out.println("-----------------");
		TestBean tb = (TestBean)ctx.getBean("test");
		tb.showEnglish();
		System.out.println("-----------------");
		tb.showHindi();
	}

}