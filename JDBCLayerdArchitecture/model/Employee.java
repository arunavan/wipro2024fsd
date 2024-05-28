package com.ey.jdbc.model;

public class Employee {


		Integer id;
		String name;
		String email;
	public	Employee(){
			
		}
		
		public Employee(Integer id, String name, String email) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
		}
		
		
		
	}


