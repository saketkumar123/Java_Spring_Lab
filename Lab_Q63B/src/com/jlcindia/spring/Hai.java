package com.jlcindia.spring;
public class Hai {
	Hello hello;
	
	
	public Hai() {
		System.out.println("Hai - D.C");
	}
	static{
		System.out.println("Hai - S.B");
	}

	public void setHello(Hello hello) {
		System.out.println("Hai - setHello()");
		this.hello = hello;
	}

	public void show(){
		System.out.println(hello);
	}
	public String toString() {
		return "I am Hai";
	}
}
