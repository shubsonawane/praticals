package com.pratice.perfectnumber;

public class PerfectNumerRange {

	public static void main(String[] args) {
		
		int i, num = 0, factorsCount = 0, range = 10000;
		
		System.out.println("Perfect number from 1 to "+range+ " are : ");
		
		for (i = 1 ; i <= range; i++)
		{
			factorsCount = 0;
			
			for (num = i-1 ; num >=1 ; num-- ) {
				
				if(i % num == 0) {
					
					factorsCount += num;
				}
			}
			
			if (factorsCount == i) {
				
				System.out.println(i);
			}
		}

	}

}
