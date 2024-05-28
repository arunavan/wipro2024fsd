package com.ey.jdbc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ey.jdbc.model.Employee;
public interface EmployeeService {
	void insertEmployee(Employee employee) throws SQLException,ClassNotFoundException;
	void deleteEmployee(Integer eid)throws SQLException,ClassNotFoundException ;
	void updateEmployee(Integer eid,Employee employee)throws SQLException,ClassNotFoundException ;
	List<Employee> getAllEmployees()throws SQLException,ClassNotFoundException;
	Employee getEmployee(Integer eid) throws SQLException,ClassNotFoundException;
}
