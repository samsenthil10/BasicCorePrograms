package com.bridgelabz.basiccoreprograms;

import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int DIGITS_IN_YEAR=4;
		System.out.print("Enter Year:");
		int year = sc.nextInt();
		int numberOfDigits = (int) (Math.log10(year) + 1);
		if(numberOfDigits == DIGITS_IN_YEAR) {
			if(((year % 4 == 0) && (year%100!=0)) || (year % 400 == 0)){
				System.out.println("Given Year "+year+" is a Lear Year");
			}
			else {
				System.out.println("Given Year "+year+" is not a Lear Year");
			}
		}
		else {
			System.out.println("Invalid Number of digits in year");
		}
		sc.close();
	}
}
