package com.pratice.numberpyramid.pyramid.III;

public class NumberPyramid_III {

	public static void main(String[] args) {

		int row = 5, column = 5, i, j, number = 1;

		for (i = 1; i <= row; i++) {
			number = i;

			for (j = 1; j <= column; j++) {

				if (j == 2) {
					number--;

				}
				System.out.print(number + " ");
				number++;

			}
			System.out.println();
		}

	}

}
