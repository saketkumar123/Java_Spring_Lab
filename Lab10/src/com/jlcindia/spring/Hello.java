package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	@Autowired
	@Qualifier("aobj")
	private A aobj;			//S.I
	
	@Autowired(required=false)
	@Qualifier("bobj")
	private B bobj;			//C.I
	
	public void show(){
		System.out.println("Hello show()");
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
