package com.ey.threads;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkerTest {

	public static void main(String[] args) throws Exception  {
		List<Integer> myList= new ArrayList<>();
		for(int i=0;i<1000;i++){
		myList.add(new Random().nextInt());
		}
		System.out.println(myList);
		System.out.println(LocalDateTime.now());
		Worker worker=new Worker(myList);
		Thread t = new Thread(worker);
		t.join();
		System.out.println(LocalDateTime.now() );

		
	}

}

/*

System.out.println(myList);
//Collections.sort(myList);
long start=System.currentTimeMillis();
Worker worker=new Worker(myList);
Thread t = new Thread(worker);
t.start();
t.join();
System.out.println("Time taken to sort: " + (System.currentTimeMillis()-start)+ " milliseconds");
//System.out.println(myList);}}

*/