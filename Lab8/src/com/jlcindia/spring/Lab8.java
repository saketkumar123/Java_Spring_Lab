package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab8 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		System.out.println("Spring Container is Ready");
		System.out.println("-----------------");
		Customer cust = (Customer)ctx.getBean("cust");
		cust.Show();
	}

}

/*Account-D.C
Account-D.C
Address - 3Args constructor
customer - 4args constructor
Spring Container is Ready
-----------------
customer Show()
101
sri
sri@jlc.com
9999
[aa@jlc.com, bb@jlc.com, cc@jlc.com]
[1111, 2222, 3333]
{AA=11, BB=22, CC=33}
{CC=33, AA=11, BB=22}
Bangalore	Mathikere	KA
11	SA	10000.0
12	FD	20000.0
java.util.ArrayList
java.util.LinkedHashSet
java.util.LinkedHashMap
java.util.Properties
*/