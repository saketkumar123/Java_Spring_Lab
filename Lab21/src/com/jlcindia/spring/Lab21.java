package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab21 {

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
B-> 2args
Hello(A,B)
Spring Container is Ready
-----------------
show() method in Hello
11	AAA-A
21	BBB-B*/