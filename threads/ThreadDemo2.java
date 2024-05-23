package com.ey.threads;

public class ThreadDemo2 extends Thread{
	/*
	 * ThreadDemo2 (){ this.start(); }
	 */
	
	@Override
	public void  run(){  
		try {
			for(int i=0;i<10;i++) {
			  System.out.println("Child:"+Thread.currentThread().getName());
			  Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}

	public static void main(String[] args)  throws InterruptedException{
		 ThreadDemo2 t=new ThreadDemo2();
		 t.setName("student");
	        t.start();
	      //  t.start();
		 
		 System.out.println(t.getName());
		 t.setPriority(Thread.MAX_PRIORITY);  //10-MAx 5 -NORM 1 Minimum
		 System.out.println(t.getPriority());
		 t.setDaemon(true);//worker thread 
	System.out.println(t.isDaemon());
	System.out.println(t.isAlive());
//	System.out.println(t.isInterrupted());
//	t.stop();
//	t.suspend();
	//t.resume();
	//t.yield();
	System.out.println(Thread.activeCount());
	for(int i=0;i<10;i++) {
		  System.out.println("Main:"+Thread.currentThread().getName());
		  Thread.sleep(2000);
		t.join();
		System.out.println(Thread.activeCount());
	}

}
}
