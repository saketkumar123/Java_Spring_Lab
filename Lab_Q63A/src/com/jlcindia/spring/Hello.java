package com.jlcindia.spring;

public class Hello {
	Hai hai;
	public Hello() {
		System.out.println("Hello - D.C");
	}
	static{
		System.out.println("Hello - S.B");
	}
	public void setHai(Hai hai) {
		System.out.println("Hello - setHai()");
		this.hai = hai;
	}

	public void show(){
		System.out.println(hai);
	}
	public String toString() {
		return "I am Hello";
	}
}
