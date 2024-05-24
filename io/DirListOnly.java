package com.ey.io;

import java.io.File;
import java.io.FilenameFilter;

//String[ ] list(FilenameFilter FFObj) 
//boolean accept(File directory, String filename) 


class OnlyExt implements FilenameFilter
{
	String ext; 

	OnlyExt(String ext)
	{
		this.ext = "." + ext; 
	} 

	public boolean accept(File dir, String name)
	{
		return name.endsWith(ext); 
	} 
} 
class DirListOnly
{	public static void main(String args[])
	{   String dirname = "D:\\ey"; 
		File f1 = new File(dirname); 
		FilenameFilter only = new OnlyExt("class"); 
		
		String s[] = f1.list(only); 

		for (int i=0; i < s.length; i++)
		{
			System.out.println(s[i]); 
		} 
	}
}