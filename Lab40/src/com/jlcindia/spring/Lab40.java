package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab40 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jlcindia.xml");
		System.out.println("Spring Container is Ready...");
		System.out.println("-----------------");
		TestBean tb = (TestBean)ctx.getBean("testBean");
		tb.showEnglish();
		System.out.println("-----------------");
		tb.showHindi();
	}

}