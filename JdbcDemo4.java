package com.wipro.io;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class JdbcDemo4 {

	
	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.OracleDriver");
		//step2 
		//url,id,pwd
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:9501/XE","system","rps@123");
		System.out.println("connection is success");
		Statement st=con.createStatement();
		CallableStatement cst=con.prepareCall(" { CALL addsqnum(?,?,?)  }");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		
			//read data
			int a=sc.nextInt(); 
			int b=sc.nextInt();
			cst.setInt(1, a);
			cst.setInt(2, b);
			cst.registerOutParameter(3, Types.INTEGER);
			cst.execute();
			int c=cst.getInt(3);
			System.out.println("Result:"+c);
			
	}
}


/*
create or replace procedure addnum(a in number,b in number ,c  out number) as
begin
c:=a+b;
end;


create procedure addsqnum(a in number,b in number ,c  out number) as
begin
c:=a*a+b*b;
end;



*/