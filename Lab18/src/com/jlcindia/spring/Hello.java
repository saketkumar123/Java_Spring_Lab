package com.jlcindia.spring;

public class Hello {
	private A aobj;			//S.I
	private B bobj;			//S.I
	
	public Hello() {
		System.out.println("Hello()");
	}
	public void show(){
		System.out.println("show in Hello() method");
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
