package com.jlcindia.spring;

public class Hello {
	private A aobj;			//S.I
	private B bobj;			//S.I
	
	public Hello(){
		System.out.println("Hello()");
	}

	public Hello(A aobj) {
		System.out.println("Hello(A)");
		this.aobj = aobj;
	}
	
	public Hello(B bobj) {
		System.out.println("Hello(B)");
		this.bobj = bobj;
	}
	public Hello(A aobj, B bobj) {
		System.out.println("Hello(A,B)");
		this.aobj = aobj;
		this.bobj = bobj;
	}
	public void show(){
		System.out.println("show() method in Hello");
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
