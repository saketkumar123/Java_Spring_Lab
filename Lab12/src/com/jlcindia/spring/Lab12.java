package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab12 {

	public static void main(String[] args) {
		
		//With IOC
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jlcindia.xml");
		System.out.println("Spring Container is Ready");
		System.out.println("-----------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
		
	}

}


/*Spring Container is Ready
-----------------
show in Hello
null
null*/