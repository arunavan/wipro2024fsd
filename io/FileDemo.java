package com.ey.io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {

		File f1=new File("D:\\ey");
		
		String files[]=f1.list();
		
		for( String filename: files) {
			System.out.println(filename);
		}
		
		f1.mkdir();
		
		System.out.println(f1.exists() ? "exists" : "does not exist"); 
		
		System.out.println(f1.canWrite() ? "is writeable" : "is not writeable"); 
		
		System.out.println(f1.canRead() ? "is readable" : "is not readable"); 
		
		System.out.println("is " + (f1.isDirectory() ? "" : "not" + " a directory")); 
		
		System.out.println(f1.isFile() ? "is normal file" : "might be a named pipe"); 
		
		System.out.println(f1.isAbsolute() ? "is absolute" : "is not absolute"); 
		
		System.out.println("File last modified: " + f1.lastModified()); 
		
		System.out.println("File size: " + f1.length() + " Bytes"); 
	} 
}


