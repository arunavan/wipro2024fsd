package com.wipro.designpatterns;

class Person{
	String type;
	
}
class Employee{
	String type;
	
}
class ObjectBuilder{
	Object o;
	//String type;
	Object build(String type) {
		if( type.equals("p"))
			o=new Person();
		else if(type.equals("e"))
			o=new Employee();
		return o;
	}
	
}

public class BuilderDemo {

	public static void main(String[] args) {
		String type="p";
		ObjectBuilder ob=new ObjectBuilder();
		System.out.println(ob.build(type));

	}

}
