package com.pratice.composite;

public class CompositeRange {

	public static void main(String[] args) {

		int i, range = 1000, factorCounter = 0, num = 0;

		System.out.println("Composite numbers from 1 to " + range + " are as follows : ");

		for (i = 1; i <= range; i++) {
			factorCounter = 0;

			for (num = i; num >= 1; num--) {

				if (i % num == 0) {

					factorCounter++;
				}
			}

			if (factorCounter > 2) {

				System.out.println(i);
			}
		}
	}

}
