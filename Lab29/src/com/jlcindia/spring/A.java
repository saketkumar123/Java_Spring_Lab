package com.jlcindia.spring;
public class A {
	
	private int a;			//S.I
	private String msg;		//S.I
	
	public void setA(int a) {
		System.out.println("A-> setA()");
		this.a = a;
	}
	public void setMsg(String msg) {
		System.out.println("A-> setMsg()");
		this.msg = msg;
	}
	public String toString() {
		
		return ""+a+"\t"+msg;
	}
}
