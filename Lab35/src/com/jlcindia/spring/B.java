package com.jlcindia.spring;

import javax.annotation.PostConstruct;

public class B {
	private int b;			//C.I
	private String str;		//C.I
	
	static{
		System.out.println("B - S.B");
	}
	public B(){
		System.out.println("B - D.C()");
	}
	public B(int b, String str) {
		System.out.println("B-> 2args");
		this.b = b;
		this.str = str;
	}
	@PostConstruct
	public void init(){
		System.out.println("A - init()");
	}
	public String toString() {
		
		return ""+b+"\t"+str;
	}
}
