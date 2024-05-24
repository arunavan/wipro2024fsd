package com.ey.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account  implements Serializable {  //marker interface
	Integer acNumber;
	String name;
	Double balance;
	static String city="hyderabad";
	private static final long serialVersionUID = 1L;
	transient double temperature;
	public Account(Integer acNumber, String name, Double balance,double temparature) {
		super();
		this.acNumber = acNumber;
		this.name = name;
		this.balance = balance;
		this.temperature=temparature;
	}
	@Override
	public String toString() {
		return temperature +"Account [acNumber=" + acNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
	
}
public class SerializeDemo {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		
		Account a1=new Account(123,"Ram",90000.00,890.00);
		System.out.println("Before serialization Account details"+ a1);
		
		//serialization
		
		FileOutputStream f1=new FileOutputStream("d:\\ey\\serial.txt");
		
		ObjectOutputStream o1=new ObjectOutputStream(f1);
		
		o1.writeObject(a1);
		
		System.out.println(" serialization is done...");
		
		//Deserialization
		
		FileInputStream f2=new FileInputStream("d:\\ey\\serial.txt");
		ObjectInputStream o2=new ObjectInputStream(f2);
		Account a2=(Account)o2.readObject();
		
		System.out.println(a2.city);
		System.out.println("after deserialization:"+ a2);
		
		
		
		
		
		
		
		
		

	}

}
