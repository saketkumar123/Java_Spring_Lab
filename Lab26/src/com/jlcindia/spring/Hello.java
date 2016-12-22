package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	private A aobj;			//S.I
	private B bobj;			//S.I
	
	@Autowired
	public Hello(A ao,B bo){
		this.aobj=ao;
		this.bobj=bo;
	}
	public void show(){
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
