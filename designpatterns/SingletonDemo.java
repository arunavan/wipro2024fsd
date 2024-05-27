package com.wipro.designpatterns;



 class Singleton1{
	public static Singleton1 s1;
	
 private Singleton1(){
	   System.out.println("object");
    }
 public static Singleton1 getInstance() {
	if(s1==null) {
	 s1=new Singleton1();
	}
	return s1;
 }
}
class SingletonDemo {
	public static void main(String[] args) {
		//Singleton1 sss=new Singleton1();
		Singleton1 s=Singleton1.getInstance();
		Singleton1 s1=Singleton1.getInstance();
		Singleton1 s2=Singleton1.getInstance();
	    System.out.println(s.hashCode()+  "  "+s1.hashCode() + "  "+s2.hashCode());
	    System.out.println(s+  "  "+s1 + "  "+s2);
  
	}
}
