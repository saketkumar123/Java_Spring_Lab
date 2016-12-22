package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab10 {

	public static void main(String[] args) {
		
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
B Beans Instance will be created
Spring Container is Ready
-----------------
Hello show()
10	AAA
99	BBB*/