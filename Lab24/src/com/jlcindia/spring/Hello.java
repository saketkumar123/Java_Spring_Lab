package com.jlcindia.spring;

public class Hello {
	private A aobj;			//S.I
	private B bobj;			//S.I
	
	public void setAobj(A aobj) {
		this.aobj = aobj;
	}
	public void setBobj(B bobj) {
		this.bobj = bobj;
	}
	public void show(){
		aobj.showA();
		bobj.showB();
	}
}
