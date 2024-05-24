package com.wipro.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException{
   //byte- 
		FileInputStream f1=new FileInputStream("d:\\Hello.java");
		
		FileOutputStream f2=new FileOutputStream("d:\\Helloout123.txt");
		
		
		
		int k;
		
		while((k=f1.read())!=-1)//-1 EOF
		{
			System.out.print((char)k);
			f2.write((char)k);
		}
		
		f1.close();
		f2.close();

	}

}
