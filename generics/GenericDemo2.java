package com.wipro.generics;

public class GenericDemo2 {
	   public static < E > void printArray(E[] elements) { 
		   	        for ( E element : elements){          
			            System.out.println(element );  
			         }  
			         System.out.println();  
			    }  
			    public static void main( String args[] ) {  
			        Integer[] intArray = { 10, 20, 30, 40, 50 };  
			        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
			  
			        System.out.println( "Printing Integer Array" );  
			        printArray( intArray  );   
			  
			       System.out.println( "Printing Character Array" );  
			        printArray( charArray );   
			        
			        Double[] dArray= {234.324,45645.657,7667.435,768.56};
			        
			        printArray(dArray);
			    }   
			}  
