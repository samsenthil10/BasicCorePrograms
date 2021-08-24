package com.bridgelabz.basiccoreprograms;

import java.util.*;

public class LargestAmongThreeNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		System.out.print("Enter three numbers: ");
		firstNumber=sc.nextInt();
		secondNumber=sc.nextInt();
		thirdNumber=sc.nextInt();
		System.out.println("The Largest of Three Numbers is: "+Math.max(Math.max(firstNumber,secondNumber),thirdNumber));
		sc.close();
	}
}
