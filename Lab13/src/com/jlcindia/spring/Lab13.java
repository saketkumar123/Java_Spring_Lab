package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab13 {

	public static void main(String[] args) {
		
		//With IOC
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jlcindia.xml");
		System.out.println("Spring Container is Ready");
		System.out.println("-----------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
		
	}

}


/*A -> D.C
A-> setA()
A-> setMsg()
A -> D.C
A-> setA()
A-> setMsg()
B-> 2args

NoUniqueBeanDefinitionException
expected single matching bean but found 2: ao1,ao2*/