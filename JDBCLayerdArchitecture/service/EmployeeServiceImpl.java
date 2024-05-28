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
import com.ey.jdbc.util.DbConn;
public class EmployeeServiceImpl implements EmployeeService {
@Override
	public void insertEmployee(Employee employee) throws SQLException,ClassNotFoundException{
		//PreparedStatement
		PreparedStatement pst=DbConn.getConnection().prepareStatement("insert into employee values(?,?,?)");
		pst.setInt(1,employee.getId());
		pst.setString(2,employee.getName());
		pst.setString(3,employee.getEmail());
		pst.execute();
		
	}

@Override
	public void deleteEmployee(Integer eid)throws SQLException,ClassNotFoundException {
	PreparedStatement pst=DbConn.getConnection().prepareStatement("delete from employee where id=?");
	pst.setInt(1,eid);
	pst.execute();
	//implement logger
	System.out.println("deleted");
	}
	public void updateEmployee(Integer eid,Employee employee) throws SQLException,ClassNotFoundException{
		Connection con=DbConn.getConnection();
		con.setAutoCommit(false);
		try {
		PreparedStatement pst=con.prepareStatement("update  employee  name=?,email=? where id=?");
		pst.setInt(3,eid);
		pst.setString(2, employee.getName());
		pst.setString(3, employee.getEmail());
		pst.execute();
		}
		catch(Exception e) {
			con.rollback();
		}
		con.commit();
		//implement logger
		System.out.println("deleted");	
	}
	public List<Employee> getAllEmployees()throws SQLException,ClassNotFoundException{
		Statement st=DbConn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select * from employee");
		List<Employee> elist=new ArrayList<>();
		while(rs.next()) {
		
			Employee e=new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setEmail(rs.getString(3));
			elist.add(e);
		}
		return elist;
	}
	public Employee getEmployee(Integer eid)throws SQLException,ClassNotFoundException {
		PreparedStatement st=DbConn.getConnection().prepareStatement("select * from employee where id=?");
		st.setInt(1, eid);
		
		ResultSet rs=st.executeQuery();
		Employee e=new Employee();
		
		while(rs.next()) {
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setEmail(rs.getString(3));
		}
		
		return e;
	}
}

