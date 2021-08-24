package com.bridgelabz.basiccoreprograms;

import java.util.*;

public class PrimeFactors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int n = number;
		System.out.print("The Prime Factors for given number are: ");
		while (n%2==0)
		{
			System.out.print(2 + " ");
			n /= 2;
		}
		for (int i = 3; i*i <= n; i+= 2)
		{
			while (n%i == 0)
			{
				System.out.print(i + " ");
				n /= i;
			}
		}
		if (n > 2) {
			System.out.print(n);
		}

		System.out.println();
		sc.close();
	}
}

