package com.jlcindia.spring;

public class Hello {
	Hai hai;
	
	static{
		System.out.println("Hello - S.B");
	}
	public Hello() {
		System.out.println("Hello - D.C");
	}
	
	public Hello(Hai hai) {
		System.out.println("Hello 1-Args");
		this.hai = hai;
	}
	public void show(){
		System.out.println(hai);
	}
	public String toString() {
		
		return "I am Hello";
	}
}
