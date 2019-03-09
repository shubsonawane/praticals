package com.pratice.primenumbers;

public class PrimeRange {

	public static void main(String[] args) {

		int i = 0, num = 0, range = 1000, factorCount = 0;

		System.out.println("Prime numbers from 1 to " + range + " are as follows : ");

		for (i = 1; i <= range; i++) {
			factorCount = 0;

			for (num = i; num >= 1; num--) {
// skip even numbers
				if (i % num == 0) {

					factorCount++;

				}
			}

			if (factorCount == 2) {

				System.out.println(i);
			}
		}

	}

}
