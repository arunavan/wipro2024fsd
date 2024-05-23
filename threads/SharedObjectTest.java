package com.ey.threads;
public class SharedObjectTest {
public static void main(String[] args) throws InterruptedException {
	SharedObject sharedObject=new SharedObject();
	Thread t1=new Thread(sharedObject);  //0
	t1.start();
	Thread t2 = new Thread(sharedObject);  //1
	t2.start();
	Thread t3 = new Thread(sharedObject);  //2
	t3.start();
}
}