package com.ey.io;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Customer123 implements Externalizable{ //readExternal, writeExternal 
	
	Integer id;
	String name;
	
	public Customer123(){
		
	}
	
	public Customer123(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	//deserialization
	public void readExternal(ObjectInput input) throws IOException{
		this.id=input.readInt();
		this.name=input.readUTF(); //string
	//	this.name=input.readObject()

		
	}
	//serialization
	public void writeExternal(ObjectOutput out) throws IOException{
		out.writeInt(this.id+10);
		out.writeUTF(this.name.toUpperCase());
		
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class ExternalizableDemo {

	public static void main(String[] args)  throws IOException,ClassNotFoundException{
		
		Customer123 c=new Customer123(101,"Ram");
		System.out.println("Before Serialization:"+c);
		FileOutputStream f1=new FileOutputStream("d:\\ey\\seriale.txt");
		
		ObjectOutputStream o1=new ObjectOutputStream(f1);
		
		o1.writeObject(c);
		
		FileInputStream f2=new FileInputStream("d:\\ey\\seriale.txt");
		ObjectInputStream o2=new ObjectInputStream(f2);
		Customer123  a2=(Customer123)o2.readObject();
		
		System.out.println("After deserialization:"+a2);
		

	}

}
