package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab7 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jlcindia.xml");
		System.out.println("Spring Container is Ready");
		System.out.println("-----------------");
		Customer cust = (Customer)ctx.getBean("cust");
		cust.Show();
	}

}


/*Address - 3 Args
Account-D.C
Account-D.C
Account-D.C
Customer 4-args
Spring Container is Ready
-----------------
customer show()
101
Sri
sri@jlc
9999
[aa@jlc, bb@jlc, cc@jlc]
[111, 222, 333]
{AA=11, BB=22, CC=33}
{CC=33, AA=11, BB=22}
Bangalore	Mathikere	KA
11	SA	10000.0
12	SA	20000.0
13	SA	350000.0
java.util.ArrayList
java.util.LinkedHashSet
java.util.LinkedHashMap
java.util.Properties
*/