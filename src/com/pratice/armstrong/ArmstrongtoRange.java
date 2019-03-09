package com.pratice.armstrong;

public class ArmstrongtoRange {

	public static void main(String[] args) {

		int num, range = 1000, sum = 0, rem;

		System.out.println("Arstrong number from 1 to " + range + " are as follows :");

		for (int i = 1; i <= range; i++) {

			num = i;

			while (num > 0) {

				rem = num % 10;
				sum = sum + (rem * rem * rem);
				num = num / 10;

			}

			if (sum == i) {

				System.out.println(i);
			}

			sum = 0;

		}
	}

}
