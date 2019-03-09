package com.pratice.maximumnumber;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1st no : ");
		int num1 = input.nextInt();
		
		System.out.println("Enter 2nd no : ");
		int num2 = input.nextInt();
		
		System.out.println("Enter 3rd no : ");
		int num3 = input.nextInt();
		
		int max1 = (num1 > num2)? num1 : num2 ;
	
		int maxNumber = (max1 > num3) ? max1 : num3;
				
				System.out.println("Maximum no out of the 3 numbers provided is : " + maxNumber);
		
	}

}
