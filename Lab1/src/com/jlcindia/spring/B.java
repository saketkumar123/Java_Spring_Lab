package com.jlcindia.spring;

public class B {
	private int b;			//S.I
	private String str;		//S.I
	public B() {
		System.out.println("B -> D.C");
	}
	public B(int b, String str) {
		System.out.println("B-> 2args");
		this.b = b;
		this.str = str;
	}
	public void showB(){
		System.out.println("B-> showB()");
		System.out.println(b);
		System.out.println(str);
	}
}
