package com.ey.io;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class IoDemo {

	public static void main(String[] args) {
		String user_home= System.getProperty("user.home");
		String java_version= System.getProperty("java.version");
		String java_home = System.getProperty("java.home");
		String class_path = System.getProperty("java.class.path");
		System.out.println("Theuserhomedirectoryis"+user_home);
		System.out.println("Thejavaversionis"+java_version);
		System.out.println("TheJavaHomedirectoryis"+java_home);
		System.out.println("Theclasspathissetto"+class_path);
		//string, String 
		Properties p=System.getProperties();
		
		System.out.println(p);
		
		Enumeration  keys=p.keys();
		Collection  val=p.values();
		
		while(keys.hasMoreElements()) {
			System.out.println(keys.nextElement());
		}
		
		for( Object v:val)
			System.out.println(v);

	}


}
