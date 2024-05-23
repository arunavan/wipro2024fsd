package com.ey.threads;

//java.lang.Thread
public class ThreadDemo1 implements Runnable{ // run
	@Override
	public void  run(){  //heart, BL, instance , 
		System.out.println("child:"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
	System.out.println("Main:"+Thread.currentThread().getName());
	//ThreadDemo1 t1=new ThreadDemo1();
	//t1.run();
	
	ThreadDemo1 t1=new ThreadDemo1();//1
	Thread t=new Thread(t1);
	t.setName("Ram");
	Thread tt1=new Thread(t1);
	tt1.setName("Kiran");
	Thread tt2=new Thread(t1);
	tt2.setName("Raj");
	System.out.println(Thread.activeCount()); //1 main
	//2
	t.start();  // trigger run //3
	tt1.start();
	tt2.start();
	System.out.println(t.isAlive());
	System.out.println(Thread.activeCount()); //1 main +3 child 
	
	try {
		t.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(t.isAlive());
}
}