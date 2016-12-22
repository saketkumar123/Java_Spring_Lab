package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JLCConfig {
	@Bean(autowire=Autowire.BY_TYPE)
	public Hello hello(){
		Hello h = new Hello();
		return h;
	}
	/*@Bean
	public A createA(){
		A aobj = new A();
		aobj.setA(88);
		aobj.setMsg("Hello Guys");
		return aobj;
	}*/
	@Bean
	public B createB(){
		return new B(99,"Hai Guys");
	}
}
