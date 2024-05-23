package com.wipro.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Loan{
	private int age;
	double amount;
	Integer id;
	public Loan(double amount, Integer id) {
		super();
		this.amount = amount;
		this.id = id;
	}



	Loan(){
		
	}
	
	
	
	public Loan(double amount) {
		super();
		this.amount = amount;
	}



	public int getEmi(Integer amount) {
		return amount/12;
	}
	
	public void deposit(Double amount) {
		
	}
	public void withdraw(Double amount) {
		
	}
	
	
}
public class Demo {

	public static void main(String[] args) throws Exception {
		Class<Loan> c=Loan.class;
		
		Field f=c.getDeclaredField("age");
		System.out.println(f);
		Constructor con[]=c.getConstructors();
		for( Object c1: con)
			System.out.println(c1);
		Method m[]=c.getMethods();
		for(Object m1:m)
			System.out.println(m1);
 
	}

}
