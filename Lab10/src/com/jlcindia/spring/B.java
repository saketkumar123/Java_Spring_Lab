package com.jlcindia.spring;

public class B {
	private int b;			//S.I
	private String str;		//S.I
	public B() {
		System.out.println("B -> D.C");
	}
	public B(int b, String str) {
		System.out.println("B-> 2args");
		System.out.println("B Beans Instance will be created");
		this.b = b;
		this.str = str;
	}
	public String toString() {
		
		return ""+b+"\t"+str;
	}
}
