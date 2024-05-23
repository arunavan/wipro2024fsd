package com.wipro.generics;

	class WiproGen<T>{  
	T o;  //Generic   
	void add(T o)
	{
		this.o=o;
		}  
	T get(){
		return o;
		}  
	}  
public class GenericDemo1 {

	public static void main(String[] args) {
		WiproGen<Integer> wi=new WiproGen<>();
		wi.add(78);
		System.out.println(wi.get());
		
		WiproGen<String> ws=new WiproGen<>();
		ws.add("Java");
		System.out.println(ws.get());

	}

}
