package com.ey.threads;
public class SharedObject implements Runnable{
	
private static volatile StringBuilder message=new StringBuilder("Welcome"); //x  - 7 time 

	@Override
	public void run() {
		int size=message.length();
		synchronized(this){
		for(int i=0;i<size;i++){
			System.out.println(Thread.currentThread().getName()
						+":"+ message.append('x'));
		}
		}
	}
}	