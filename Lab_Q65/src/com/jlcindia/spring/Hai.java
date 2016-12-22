package com.jlcindia.spring;
public class Hai {
	Hello hello;
	
	static{
		System.out.println("Hai - S.B");
	}
	/*public Hai() {
		System.out.println("Hai - D.C");
	}*/
	public Hai(Hello hello) {
		System.out.println("Hai 1-Args");
		this.hello = hello;
	}

	public void show(){
		System.out.println(hello);
	}
	public String toString() {
	
		return "I am Hai";
	}
}
