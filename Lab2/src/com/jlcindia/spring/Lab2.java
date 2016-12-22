package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab2 {

	public static void main(String[] args) {
		/*
		//Without IOC
		A aobj = new A();
		aobj.setA(99);
		aobj.setMsg("Hello Guys");
		B bobj = new B(88,"Hai Guys");
		Hello hello = new Hello(bobj);
		hello.setAobj(aobj);
		hello.show();
		*/
		
		//With IOC
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		System.out.println("Spring Container is Ready");
		System.out.println("-----------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
		
	}

}


/*A -> D.C
A-> setA()
A-> setMsg()
B-> 2args
Hello-> 1args
Hello -> setAobj
Spring Container is Ready
-----------------
show in Hello
A-> showA()
88
Hello Guys
B-> showB()
99
Hai Guys
*/