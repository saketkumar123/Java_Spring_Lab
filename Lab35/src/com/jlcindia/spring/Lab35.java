package com.jlcindia.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab35 {

	public static void main(String[] args) {
		
		//With IOC
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("jlcindia.xml");
		
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