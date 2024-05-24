package com.wipro.io;
import java.sql.*;
public class JdbcDemo {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		
		//step1  create driver
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		//step2 
		//url,id,pwd
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:9501/XE","system","rps@123");
		
		System.out.println("connection is success");
		
		Statement st=con.createStatement();
		
		// cretae,altre,drop,insert,indelete,update
		//st.executeUpdate("create table product(id number primary key,name varchar(10),price number)");
		
		st.executeUpdate("insert into product values(4,'bag',999)");
		st.executeUpdate("insert into product values(5,'book',1999)");
		st.executeUpdate("insert into product values(6,'table',2999)");
		
		System.out.println("table created, inserted");
		
		
		

	}

}
