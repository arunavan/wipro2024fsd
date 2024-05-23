package com.wipro.generics;
import java.util.*;
public class Demo1 {

	
	public static void main(String[] args) {
			List<Integer> list = new ArrayList<Integer>();    
			list.add(10);  
			list.add(20);  
			Integer x=list.get(1);
		System.out.println(list);
		List list1 = new ArrayList();    
		list1.add(10);  
		list1.add(20);  
		Integer i=(Integer)list1.get(1);
	System.out.println(list1);
	}
}
