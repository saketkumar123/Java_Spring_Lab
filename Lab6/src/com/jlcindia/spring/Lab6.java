package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab6 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		System.out.println("Spring Container Ready");
		System.out.println("------------------");
		Hello h1 = (Hello)ctx.getBean("hello");
		Hello h2 = (Hello)ctx.getBean("hello");
		System.out.println(h1==h2);
	}

}


/*Spring Container Ready
------------------
Hello- D.C com.jlcindia.spring.Hello@438a68
true*/