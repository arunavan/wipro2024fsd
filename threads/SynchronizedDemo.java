package com.wipro.threads;

class Display //target
{ public  void wish(String name)
 {  
	synchronized(this) {
	for(int i=0;i<10;i++)
   {   System.out.print("good morning  ");
    	try
    	{ Thread.sleep(1000);
    	}catch(InterruptedException ie)
    	{}
    System.out.println(name);
   }//for
	}
	
 }//wish
}
class MyThread extends Thread
{ Display d;
  String name;
  MyThread(Display d, String name)
  {   this.d=d;
     this.name=name;
  }
  public void run()
  {   d.wish(name);
  }
}

class SynchronizedDemo
{public static void main(String args[])
  {Display d= new Display();  //sharedobject
  MyThread t1= new MyThread(d,"Raj");
  MyThread t2= new MyThread(d,"Ravi");
   t1.start();
   t2.start();

   }

}