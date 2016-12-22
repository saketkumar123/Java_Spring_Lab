package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	@Autowired
	private A aobj;			//S.I
	@Autowired
	private B bobj;			//S.I
	
	public void show(){
		System.out.println("show() method in Hello");
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
