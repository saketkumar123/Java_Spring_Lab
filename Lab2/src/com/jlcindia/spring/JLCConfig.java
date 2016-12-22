package com.jlcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JLCConfig {
	@Bean
	public Hello hello(A aobj,B bobj){
		Hello h = new Hello(bobj);
		h.setAobj(aobj);
		return h;
	}
	@Bean
	public A createA(){
		A aobj = new A();
		aobj.setA(88);
		aobj.setMsg("Hello Guys");
		return aobj;
	}
	@Bean
	public B createB(){
		return new B(99,"Hai Guys");
	}
}
