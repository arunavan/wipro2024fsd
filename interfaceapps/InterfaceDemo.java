package com.wipro.interfaceapps;


interface calc{
	int add(int a,int b);
	double product(int a,int b);
	default void show() {
		System.out.println(" show method...");
	}
	static void disp() {
		System.out.println(" static method...");
	}
}
interface Calc1 extends calc{
	void show();
}
class CalcImpl implements calc{
	public int add(int a,int b) {
		return a+b;
	}
	public double product(int a,int b) {
		return a*b;
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		calc c=new CalcImpl();
		System.out.println(c.add(5, 6));
		System.out.println(c.product(4, 3));	
		c.show();  //default method
		calc.disp();//sttaic method
	}

}
