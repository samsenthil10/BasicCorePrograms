package com.bridgelabz.basiccoreprograms;

import java.util.*;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Dividend: ");
		int dividend=sc.nextInt();
		System.out.print("Enter Divisor: ");
		int divisor=sc.nextInt();
		double quotient,remainder;
		quotient= (double)dividend / (double)divisor;
		remainder= (double)dividend % (double)divisor;
		System.out.println("Quotient: "+quotient+" Remainder: "+remainder);
		sc.close();
	}
}
