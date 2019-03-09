package com.pratice.skipzero;

public class NumberSkippingZeroes {

	public static void main(String[] args) {

		int num = 70806;

		String number = String.valueOf(num);

		String StrNumber = number.replaceAll("0", "");

		int numWithoutZeros = Integer.parseInt(StrNumber);

		System.out.println("Number without zeros : " + numWithoutZeros);

	}

}
