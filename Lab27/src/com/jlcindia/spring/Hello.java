package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	@Autowired
	@Qualifier("ao1")
	private A aobj;			//S.I
	@Autowired
	@Qualifier("bo1")
	private B bobj;			//S.I
	
	public void show(){
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
