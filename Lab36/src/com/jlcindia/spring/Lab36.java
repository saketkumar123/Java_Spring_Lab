package com.jlcindia.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab36 {

	public static void main(String[] args) {
		
		//With IOC
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		
		//AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("fully qualified name");
		System.out.println("Spring Container is Ready...");
		System.out.println("-----------------");
		Hello h = (Hello)ctx.getBean("HELLO");
		h.show();
		System.out.println("-----------------");
		System.out.println("Spring Container going to shutdown...");
		ctx.registerShutdownHook();
	}

}