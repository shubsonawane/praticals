package com.pratice.sumofevendigits;

public class SumOfEvenDigits {

	public static void main(String[] args) {
		
		int num = 234522, sum = 0, rem;
		
		while (num > 0)
		{
			rem = num % 10;
			
			if (rem % 2 == 0)
			{
				sum += rem;
			}
			
			num /= 10;
		}

		System.out.println("Sum of even digits is : " + sum);
	}

}
