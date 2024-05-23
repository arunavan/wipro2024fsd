package com.wipro;


class T1 extends Thread{
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(500);
				}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) throws Exception {
		for(int i=1;i<=5;i++) {
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(500);
		}
		T1 t1=new T1();
		t1.setName("Wipro1");
		T1 t2=new T1();
		t2.setName("Wipro2");
		t1.start();
		t2.start();
		System.out.println(Thread.activeCount());
	}

}
