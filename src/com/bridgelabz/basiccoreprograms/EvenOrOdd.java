package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter Number: ");
		int number = sc.nextInt();
		if(number%2==0) {
			System.out.println(number+" is Even Number");
		}
		else {
			System.out.println(number+" is Odd Number");
		}
		sc.close();
	}
}
