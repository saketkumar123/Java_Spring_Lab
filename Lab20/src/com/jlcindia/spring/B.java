package com.jlcindia.spring;

public class B {
	private int b;			//C.I
	private String str;		//C.I
	public B() {
		System.out.println("B -> D.C");
	}
	public B(int b, String str) {
		System.out.println("B-> 2args");
		this.b = b;
		this.str = str;
	}
public String toString() {
		
		return ""+b+"\t"+str;
	}
}
