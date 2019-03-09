package com.pratice.palindrome;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int rem, num, range = 200, i, sum = 0;
		
		System.out.println("Palindrome number upto "+range+ " are : ");
		
		for (i = 1; i <= 200 ; i++) {
			
			num = i;
			sum = 0;
			while (num > 0) {
				
				rem = num % 10;
				sum = sum * 10 + rem;
				num = num / 10;
			}
			
			if (sum == i)
			{
				System.out.println(i);
			}
		}
	}

}
