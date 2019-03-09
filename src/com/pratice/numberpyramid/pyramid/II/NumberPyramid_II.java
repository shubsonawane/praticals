package com.pratice.numberpyramid.pyramid.II;

public class NumberPyramid_II {

	public static void main(String[] args) {

		int row = 5, column = 5, i, j, number = 1;

		for (i = 1; i <= row; i++) {

			number = i;
			for (j = 1; j <= column; j++) {
				System.out.print(number + " ");
				number++;

			}

			System.out.println();
		}
	}

}
