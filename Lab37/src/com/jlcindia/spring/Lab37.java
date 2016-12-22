package com.jlcindia.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Lab37 {

	public static void main(String[] args) {
		
		//With IOC
		Resource res = new ClassPathResource("jlcindia.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		System.out.println("Spring Container is Ready...");
		System.out.println("-----------------");
		Hello h = (Hello)factory.getBean("HELLO");
		h.show();
		System.out.println("-----------------");
		System.out.println("Spring Container going to shutdown...");
	}

}