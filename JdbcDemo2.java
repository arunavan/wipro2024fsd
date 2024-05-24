package com.wipro.io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo2 {
public static void main(String[] args) throws Exception{
	Class.forName("oracle.jdbc.OracleDriver");
	//step2 
	//url,id,pwd
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:9501/XE","system","rps@123");
	System.out.println("connection is success");
	Statement st=con.createStatement();
	PreparedStatement pst=con.prepareStatement("insert into product values(?,?,?)");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 3 products details");
	for(int i=1;i<=3;i++) {
		//read data
		int id=sc.nextInt();   sc.nextLine();
		String name=sc.nextLine();
		int price=sc.nextInt();
				//set data
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setInt(3, price);
				//execute statement
				pst.execute();
	}
	
	ResultSet rs=st.executeQuery("select * from product");
	//meta data
	ResultSetMetaData rsmd=rs.getMetaData();
	for(int i=1;i<=rsmd.getColumnCount();i++)
		System.out.print(rsmd.getColumnName(i)+ "  ");
	while(rs.next()) {
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+"   "+rs.getString(3));
	}
	

}
}
