package com.wipro.interfaceapps;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Arith1{
	int op(int a,int b);
}

class Demo{
	static void show() {
		System.out.println(" static show method...");
	}
}
public class LambdaDemo1 {
	public static void main(String[] args) {
		Arith1 ar=(int a,int b)-> { return a+b; }; // (a,b)->a+b;
		System.out.println(ar.op(5, 6));
		
		Arith1 ar1=(a,b)->a*b;
		System.out.println(ar1.op(5, 6));
		
		//Consumer, Supplier, Predicate,Function
		
		Supplier<Integer> s=()-> 99;
		System.out.println(s.get());
		
		Consumer<Integer> c=(a)->System.out.println(a*a*a);
		c.accept(6);
		
		Predicate<Integer> p=(a)->a%2==0;
		System.out.println(p.test(4));
		
		Function<Integer,Integer> f=(a)->a*a;
		System.out.println(f.apply(8));
		
		BiFunction<Integer,Integer,Integer> sum1=(a,b)->a*a+b*b;
		System.out.println(sum1.apply(4, 3));
		
		Consumer<Double> dc=System.out::println; //method reference
		dc.accept(10.0);
		
		
	}
}
