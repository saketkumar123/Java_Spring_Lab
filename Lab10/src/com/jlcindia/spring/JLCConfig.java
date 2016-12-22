package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JLCConfig {
	@Bean
	public A aobj(){
		A aobj = new A();
		aobj.setA(10);
		aobj.setMsg("AAA");
		return aobj;
	}
	
	@Bean(autowire=Autowire.BY_NAME)
	public Hello hello(){
		return new Hello();
	}
	@Bean
	public B bobj(){
		return new B(99,"BBB");
	}
}
