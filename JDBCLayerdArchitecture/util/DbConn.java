package com.ey.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {

	
	public static	Connection getConnection() throws SQLException,ClassNotFoundException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/ey","root","root");
			return con;
		}
	

}
