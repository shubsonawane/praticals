package com.pratice.sumofodddigits;

public class SumOfOddDigits {

	public static void main(String[] args) {
		
		int num = 1253, sum = 0, rem;
		
		while (num > 0)
		{
			rem = num % 10;
			
			if (rem % 2 != 0)
			{
				sum += rem;
			}
			
			num /= 10;
		}

		System.out.println("Sum of odd digits is : " + sum);
	}

}
