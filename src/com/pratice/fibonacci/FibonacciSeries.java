package com.pratice.fibonacci;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int i, range = 10 , num1 = 0, num2 =1, sum = 0;
		
		System.out.println("Fibonacci series upto "+ range + " is as follows : ");
		
		for (i = 1; i <= range; ++i) {
			
			sum = num1 + num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
		}

	}

}
