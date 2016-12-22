package com.jlcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("jlcindia.xml")
public class JLCConfig {
	public JLCConfig(){
		System.out.println("Spring Container is now getting Ready");
	}
	@Bean(name="hello")
	public Hello getHello(){
		System.out.println("getHello()");
		return new Hello();
	}
}
