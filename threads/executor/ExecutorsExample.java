package com.wipro.threads.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class ExecutorsExample {
    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());
  ExecutorService executorService = Executors.newSingleThreadExecutor();
		  //.newFixedThreadPool(2);//2 threads 
        Runnable task1 = () -> {
            System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        };
     Runnable task2 = () -> {
            System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };
        System.out.println("Submitting the tasks for execution...");
        executorService.execute(task1);
        executorService.execute(task2);
        executorService.shutdown();
        System.out.println(" Closed..");
    }
}
