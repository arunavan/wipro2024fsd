package com.wipro.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException{
   //char
		FileReader f1=new FileReader("d:\\Hello.java");
		BufferedReader b1=new BufferedReader(f1); //512, 1024
		
		FileWriter f2=new FileWriter("d:\\Helloout1234.txt");
		BufferedWriter b2=new BufferedWriter(f2);
		String line=null;
						
		while((line=b1.readLine())!=null)
		{
			System.out.println(line);
			b2.write(line);
		}
		
		f1.close();b1.close();
		b2.close();f2.close();

	}

}
