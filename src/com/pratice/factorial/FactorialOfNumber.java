package com.pratice.factorial;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int num = 5, i, factorial = 1;
		
		for(i = 1; i <= num; i++) {
			
			factorial *= i;
		}
		
		System.out.println("Factorial of "+num+ " is : " + factorial);
	}

}
