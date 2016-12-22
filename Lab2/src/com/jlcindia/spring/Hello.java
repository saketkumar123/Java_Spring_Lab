package com.jlcindia.spring;

public class Hello {
	private A aobj;			//S.I
	private B bobj;			//C.I
	public Hello(B bobj) {
		System.out.println("Hello-> 1args");
		this.bobj = bobj;
	}
	public void setAobj(A aobj) {
		System.out.println("Hello -> setAobj");
		this.aobj = aobj;
	}
	public void show(){
		System.out.println("show in Hello");
		aobj.showA();
		bobj.showB();
	}
}
