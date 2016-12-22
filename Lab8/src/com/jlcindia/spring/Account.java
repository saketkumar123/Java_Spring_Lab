package com.jlcindia.spring;

public class Account {
	private int accno;
	private String atype;
	private double bal;
	public Account(){
		System.out.println("Account-D.C");
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public String toString() {
		
		return ""+accno+"\t"+atype+"\t"+bal;
	}
}
