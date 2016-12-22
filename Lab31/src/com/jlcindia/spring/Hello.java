package com.jlcindia.spring;

import javax.annotation.Resource;

public class Hello {
	@Resource
	private A aobj;			//S.I
	@Resource(name="bo")
	private B bobj;			//S.I
	
	public void show(){
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
