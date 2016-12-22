package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	@Autowired(required=false)
	private A aobj;			//S.I
	
	@Autowired(required=false)
	private B bobj;			//C.I
	
	public void show(){
		System.out.println("Hello show()");
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
