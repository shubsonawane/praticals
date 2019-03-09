package com.pratice.numberpyramid.pyramid.IV;

public class NumberPyramid_IV {

	public static void main(String[] args) {

		int row = 7, column = 7, i, j, space, number;

		for (i = 1; i <= row; i++) {
			number = i;
			
			for (space = 1; space < i; space++ )
			{
				System.out.print("  ");
			}

			for (j = i; j <= column; j++) {

				System.out.print(number + " ");
				number++;

			}

			System.out.println();
		}

	}

}
