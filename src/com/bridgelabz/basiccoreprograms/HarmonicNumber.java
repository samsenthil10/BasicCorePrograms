package com.bridgelabz.basiccoreprograms;

import java.util.*;

public class HarmonicNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range for Harmonic Number: ");
		int n =sc.nextInt();
		if(n > 0) {
			double sumOfNHarmonicNumbers = 0.0;
			for(int i=1;i<=n;i++){
				sumOfNHarmonicNumbers = (double)sumOfNHarmonicNumbers +  (double)((double)1/(double)i) ;
			}
			System.out.print(sumOfNHarmonicNumbers);
		}
		else {
			System.out.println("Invalid Range!");
		}
		sc.close();
	}
}
