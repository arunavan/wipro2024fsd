package com.ey.jdbc.client;


import java.sql.SQLException;

import com.ey.jdbc.JdbcDemo1;
import com.ey.jdbc.model.Employee;
import com.ey.jdbc.service.EmployeeService;
import com.ey.jdbc.service.EmployeeServiceImpl;

public class EmployeeClient {


	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		
       EmployeeService es=new EmployeeServiceImpl();
       
		//adding/inserting
		es.insertEmployee(new Employee(141,"EYUser123","eyuser123@ey.com"));
		es.insertEmployee(new Employee(142,"EYUser223","eyuser123@ey.com"));
		es.insertEmployee(new Employee(143,"EYUser323","eyuser123@ey.com"));
		//listing
		es.getAllEmployees().stream().forEach(e->System.out.println(e));;
		
		

	}

}
