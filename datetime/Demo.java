package com.ey.datetime;
import java.io.Externalizable;
import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.Date;
import java.util.TreeSet;

/*reeSet where
default natural sorting order is ascending order of salaries. If two
employees have same salary then consider alphabetical orders of
their names, and Write a comparator class to define customized
sorting which is alphabetical order of employee names. If two
employees have same name then consider designation for
comparison.
*/
	
class Employee
{
	int id;
	String name;
	double sal;
	String desg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Employee(int id, String name, double sal,String desg) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.desg=desg;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal
				+ ", desg=" + desg + "]";
	}
	
	
}
class Namecomparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{Employee e1=(Employee)o1;
	 Employee e2=(Employee)o1;
	 int x=0;
	if(e1.sal==e2.sal)
	{
		if((e1.name).compareTo(e2.name)>1)
		 x=1;
	    else
	    	x=-1;
		
	}
		
	return x;
}
}
	class Desgcomparator implements Comparator
	{
		public int compare(Object o1,Object o2)
		{Employee e1=(Employee)o1;
		 Employee e2=(Employee)o1;
		 int x=0;
		if(e1.name==e2.name)
		{
			if((e1.desg).compareTo(e2.desg)>1)
			 x=1;
		    else
		    	x=-1;
			
		}
			return x;
		
	}	
	}
class Demo
{
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2021, 3, 30);
		LocalDate endDate = LocalDate.of(2021, 5, 28);

		Period period = Period.between(startDate, endDate);
		System.out.println(period.getYears()+" "+period.getMonths()+"  "+period.getDays());
		
		Instant start = Instant.parse("2021-10-03T09:00:30.00Z");
		Instant end = Instant.parse("2021-10-03T18:00:30.00Z");
		        
		Duration duration = Duration.between(start, end);
		System.out.println(duration.getSeconds());
		
		/*Date d=new Date();
		System.out.println(d);
		Employee e1=new Employee(1,"Raj",98999,"SE");
		Employee e2=new Employee(2,"Kiran",98999,"Analyst");
		TreeSet eset=new TreeSet(new Namecomparator());
		eset.add(e1);
		eset.add(e2);
		System.out.println(eset);
		
		*/
		
	}

}
