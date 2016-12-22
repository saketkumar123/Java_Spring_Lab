package com.jlcindia.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab33 {

	public static void main(String[] args) {
		
		//With IOC
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HelloConfig.class);
		System.out.println("Spring Container is Ready");
		System.out.println("-----------------");
		Hello hello = (Hello)ctx.getBean(Hello.class);
		hello.show();
		Hai hai = (Hai)ctx.getBean(Hai.class);
		hai.show();
	}

}