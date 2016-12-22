package com.jlcindia.spring;

import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	@Inject
	private A aobj;			//S.I
	@Inject
	@Qualifier("bo2")
	private B bobj;			//S.I
	
	public void show(){
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
