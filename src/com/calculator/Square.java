package com.calculator;

import java.util.Scanner;

public class Square {
	
	public static void square() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number>> ");
	    double num = scanner.nextDouble();

	  
	    double result = num * num;

	    if (DataTypeChecker.numcheck(num)) {
	        
	        System.out.println("Square is>> " + (int)result);
	    } else {
	        System.out.println("Square is>> " + result);
	    }}



	
	    
				
		}
		
	   
		
		
