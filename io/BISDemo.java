package com.ey.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class BISDemo {
         //IOException - FileNotFoundException, EOFException
	public static void main(String[] args)  throws IOException{
		//FileInputStream f1=new FileInputStream("D:\\ey\\Hello.java");
		//BufferedInputStream b1=new BufferedInputStream(f1);
	//	FileReader f1=new FileReader("D:\\ey\\Hello.java");
	//	BufferedReader b1=new BufferedReader(f1); //filter
		System.out.println("enter filename");
		Scanner sc=new Scanner(System.in);
		BufferedReader b1 =new BufferedReader(new FileReader(sc.next()));
				//new InputStreamReader(System.in));
		FileWriter f2=new FileWriter("D:\\ey\\Hellooutput1.txt");
		BufferedWriter b2=new BufferedWriter(f2); //filter
		String line=null;
	   while((line=b1.readLine())!=null) {
			System.out.println(line);
			b2.write(line);
		}
	   
	   b1.close();
	   b2.close();
	   f2.close();
	   
	   /*
	   
	   File myFile = new File("D:\\ey\\Hello.java");
	   System.out.println(myFile.isDirectory());
	   
	   File folder1=new File("D:\\ey");
	   System.out.println(folder1.isDirectory());
	   String filenames[]=folder1.list();
	   for(String filename: filenames)
	   { 
	        System.out.println(filename);
	   }
	   */
	   /*
	   
	   System.out.println(myFile.toString());
	   System.out.println(myFile + (myFile.exists() ?" does" : " does not") + " exist");
	   System.out.println(myFile + (myFile.isFile() ?" is" : " is not") + " a file");
	   System.out.println(myFile + (myFile.isHidden() ?" is" : " is not") + " hidden");
	   System.out.println("You can " + (myFile.canRead() ? " " : " not") + " read" + myFile);
	   System.out.println("You can " + (myFile.canWrite() ? " " : " not") + " write to" + myFile);
	   
	   
		f1.close();
		b1.close();
		b2.close();
		f2.close();
		*/
	}

}
