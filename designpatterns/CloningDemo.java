package com.wipro.designpatterns;

class Student implements Cloneable{
	Integer id;
	String name;
	Student(){
		id=10;
		name="Wipro user";
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone(); //Object ..clone
	}
	
	
}

public class CloningDemo {

	public static void main(String[] args)throws CloneNotSupportedException {
	 Student s=new Student();
	 System.out.println(s.id+"  "+s.name +" "+ s.hashCode());
	// Student s1=new Student();
	 
	 Student s1=(Student)s.clone();
	 
	 System.out.println(s1.id+"  "+s1.name +" "+ s1.hashCode());
	 Student s2=(Student)s.clone();
	 System.out.println(s2.id+"  "+s2.name +" "+ s2.hashCode());
	 
	 
	 

	}

}
