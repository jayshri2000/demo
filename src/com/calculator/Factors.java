package com.calculator;

import java.util.Scanner;

public class Factors {

	public static void factors() {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number>> ");
        int num = scanner.nextInt();
        System.out.println("Factors of a number are>> ");
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
                System.out.print(i + " "); 
        }

		  System.out.println();      
		
}}