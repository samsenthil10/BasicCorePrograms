package com.bridgelabz.basiccoreprograms;

import java.util.*;

public class VowelsConsonants {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String alphabet;
		System.out.print("Enter an Alphabet: ");
		alphabet=sc.nextLine();
		if(alphabet.toLowerCase().equalsIgnoreCase("a")||alphabet.toLowerCase().equalsIgnoreCase("e")||alphabet.toLowerCase().equalsIgnoreCase("i")||alphabet.toLowerCase().equalsIgnoreCase("o")||alphabet.toLowerCase().equalsIgnoreCase("u"))
		{
			System.out.println(alphabet+" is an vowel");
		}
		else {
			System.out.println(alphabet+" is a consonant");
		}
		sc.close();
	}

}
