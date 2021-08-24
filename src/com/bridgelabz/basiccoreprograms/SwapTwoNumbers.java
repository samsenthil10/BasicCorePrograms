package com.bridgelabz.basiccoreprograms;

import java.util.*;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter First Value: ");
		int firstValue = sc.nextInt();
		System.out.printf("Enter Second Value: ");
		int secondValue = sc.nextInt();
		System.out.println("Before Swapping First Value: "+firstValue+" Second Value: "+secondValue);
		firstValue=firstValue+secondValue;
		secondValue=firstValue-secondValue;
		firstValue=firstValue-secondValue;
		System.out.println("After  Swapping First Value: "+firstValue+" Second Value: "+secondValue);
		sc.close();
	}
}
