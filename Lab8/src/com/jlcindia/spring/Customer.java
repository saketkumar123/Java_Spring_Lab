package com.jlcindia.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;

public class Customer {
	private int cid;
	private String cname;
	private String email;
	private Long phone;
	
	@Resource(name="emails")
	private List<String> emails;
	
	@Resource(name="phones")
	private Set<Long> phones;
	
	@Resource(name="refs")
	private Map<String,Long> refs;
	
	@Resource(name="myprops")
	private Properties myprops;
	
	private Address address;
	
	@Resource(name="accounts")
	private List<Account> accounts;
	
	public Customer(int cid, String cname, String email, Long phone) {
		System.out.println("customer - 4args constructor");
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}
	

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}


	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}


	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}


	public void setMyprops(Properties myprops) {
		this.myprops = myprops;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}


	public void Show(){
		System.out.println("customer Show()");
		System.out.println(cid);
		System.out.println(cname);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(emails);
		System.out.println(phones);
		System.out.println(refs);
		System.out.println(myprops);
		System.out.println(address);
		for(Account acc:accounts){
			System.out.println(acc);
		}
		System.out.println(emails.getClass().getName());
		System.out.println(phones.getClass().getName());
		System.out.println(refs.getClass().getName());
		System.out.println(myprops.getClass().getName());
	}
	
	
}
