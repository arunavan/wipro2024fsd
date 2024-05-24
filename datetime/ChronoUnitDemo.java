package com.wipro.datetime;
	import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;


public class ChronoUnitDemo {
	   public static void main(String args[]){
	   	
		LocalDate d1=LocalDate.of(2024, 5, 24);
		LocalDate d2=LocalDate.of(2000, 5, 10);
		Period du1=Period.between(d1,d2);
		System.out.println(du1.getDays() +"  "+du1.getMonths()  +"  "+du1.getYears());
		   
		LocalTime t1=LocalTime.of(10, 20,30);
		LocalTime t2=LocalTime.of(12, 10,50);
		Duration du2=Duration.between(t1, t2);
		System.out.println(du2.toHours() +"  "+ du2.toMinutes());
		
		   
		   LocalDateTime oldDate = LocalDateTime.of(2024, Month.MARCH, 1, 10, 20, 55);
	        LocalDateTime newDate = LocalDateTime.of(2024, Month.APRIL, 1, 10, 21, 56);

	        System.out.println(oldDate);
	        System.out.println(newDate);

	        //count seconds between dates
	        Duration duration = Duration.between(oldDate, newDate);

	       System.out.println(duration.toDays());
	        
	        LocalDate oldDate1 = LocalDate.of(1982, Month.AUGUST, 31);
	        LocalDate newDate2 = LocalDate.of(2020, Month.OCTOBER, 19);

	        System.out.println(oldDate);
	        System.out.println(newDate);

	        // check period between dates
	        Period period = Period.between(oldDate1, newDate2);

	        System.out.print(period.getYears() + " years,");
	        System.out.print(period.getMonths() + " months,");
	        System.out.print(period.getDays() + " days");
	        
	        System.out.println("Duration :"+ duration.getNano() +"  "+duration.getSeconds() + " seconds");
		   
		   
	      //Get the current date
	      LocalDate today = LocalDate.now();
	      System.out.println("Current date: " + today);
			
	      //add 1 week to the current date
	      LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
	      System.out.println("Next week: " + nextWeek);
			
	      //add 1 month to the current date
	      LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
	      System.out.println("Next month: " + nextMonth);
			
	      //add 1 year to the current date
	      LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
	      System.out.println("Next year: " + nextYear);
			
	      //add 10 years to the current date
	      LocalDate nextDecade = today.plus(2, ChronoUnit.DECADES);
	      System.out.println("Date after ten year: " + nextDecade);
	   }
	}
