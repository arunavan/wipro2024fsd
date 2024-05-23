package com.wipro.interfaceapps;

@FunctionalInterface
interface Arith{
	int op(int a,int b);
	//int add(int a,int b,int c);
	
}
class ArithImpl implements Arith{
	public int op(int a,int b) {
		return a+b;
	}
}
public class LAmdaDemo {

	public static void main(String[] args) {
		
		Arith ar=new ArithImpl();
		System.out.println(ar.op(5, 6));

	}

}
