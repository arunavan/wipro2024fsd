package com.wipro.threads.executor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class Calculator {
	ExecutorService es=Executors.newSingleThreadExecutor();
	public Future<Integer> calc(int n) 
	{
	return es.submit(
			()->  { Thread.sleep(1000);
			       return n*n; 
			       }
	    );
	}
}
public class ExecutorServiceWithFutureDemo {
	public static void main(String[] args) throws InterruptedException,ExecutionException{
		Calculator c=new Calculator();
		Future<Integer> result=c.calc(5);
		
		if(!result.isDone()) {
			Thread.sleep(1000);
			System.out.println("getting...");
		}
		//System.out.println(result);
		System.out.println(result.get());
	}
}
