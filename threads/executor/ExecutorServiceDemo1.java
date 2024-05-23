package com.wipro.threads.executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecutorServiceDemo1 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		System.out.println(Thread.currentThread().getName());
		
		ExecutorService es = Executors.newSingleThreadExecutor();
		Runnable t1= ()->{
					for(int i=0;i<=5;i++)
						System.out.println(Thread.currentThread().getName());
					};
		es.execute(t1);
		
		es.submit(()->System.out.println("My new child thread") );
		

	}

}
