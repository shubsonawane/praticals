package com.pratice.reversenumber;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 123456789, remainder = 0, reverseNum = 0;

		System.out.println("Original number : " + num);

		while (num != 0) {

			remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num = num / 10;

		}

		System.out.println("Reverser number : " + reverseNum);
	}

}
