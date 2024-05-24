package com.ey.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FISDEmo1 {
	

	public static void main(String[] args) throws IOException
	{
	
		//byte  , binary- image,graphs,audio,video
		
		FileInputStream f1=new FileInputStream("D:\\ey\\links.txt");
	
		FileOutputStream f2=new FileOutputStream("D:\\ey\\Hellooutput.txt",true);
		int k=0;
		while( (k=f1.read()) !=-1) {
			System.out.print((char)k);
			f2.write((char)k);
		}
	   f1.close();
	   f2.close();
	   
	   
		
	   
	   
	   
	}

}
