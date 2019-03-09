package com.pratice.numberpyramid.pyramid.I;

public class NumberPyramid_I {

	public static void main(String[] args) {
		
		int row = 5, column = 5, i, j;
		
		System.out.println("Number pyramid from "+row+" to "+column+" : ");
		
		for(i = 1; i <= row; i++)
		{
			for(j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
