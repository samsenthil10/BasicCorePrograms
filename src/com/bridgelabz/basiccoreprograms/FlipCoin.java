package com.bridgelabz.basiccoreprograms;

import java.util.*;

public class FlipCoin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int HEADS = 1;
		final int TAILS = 0;
		int numberOfTimesCoinFlipped;
		int headsCount=0;
		int tailsCount=0;
		double percentageOfHeads = 0, percentageOfTails = 0;
		System.out.print("Enter Number of times to flip the coin: ");
		numberOfTimesCoinFlipped = sc.nextInt();
		if(numberOfTimesCoinFlipped > 0) {
			for(int flips = 1; flips <= numberOfTimesCoinFlipped; flips++ ) {
				int result = (int)Math.floor(Math.random()*10)%2;
				if(result == HEADS) {
					headsCount++;
				}
				else if(result ==  TAILS) {
					tailsCount++;
				}
			}
			percentageOfHeads = (double) headsCount / numberOfTimesCoinFlipped;
			percentageOfTails = (double) tailsCount / numberOfTimesCoinFlipped;
			System.out.print("Percentage of Heads: "+percentageOfHeads+"		Percentage of Tails: "+percentageOfTails);
		}
		else {
			System.out.println("Enter positive integer number!");
		}

		sc.close();
	}
}
