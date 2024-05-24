package com.ey.io;


import java.io.FileInputStream;
import java.io.IOException;

public class FISwithTrywithResource {
	

	public static void main(String[] args) 
	{
	
		
		try (FileInputStream f1=new FileInputStream("D:\\ey\\Hello.java");) {
		
		int k=0;
		while( (k=f1.read()) !=-1) {
			System.out.print((char)k);
		}
		}
	   
		catch(Exception e) {
			e.printStackTrace();
		}
	   
		
	   
	   
	   
	}

}
