package com.bridgelabz.basiccoreprograms;

public class PowerOf2 {
	public static void main(String[] args) {
		
		int n = 0;
		if(args[0]!=null) {
			n= Integer.parseInt(args[0]);
		}
		else
		{
			System.out.println("Please Provide N Command Line Input");
			System.exit(0);
		}
		if(n >= 0 && n < 31) {
			for(int i = 0;i <= n;i++) {
				System.out.println(" N "+" 	   Power Of 2 "+" 	  Leap Year/Not a Leap Year");
				int valueOfPowerOf2 = (int)Math.pow(2, i);
				if(((valueOfPowerOf2 % 4 == 0) && (valueOfPowerOf2%100!=0)) || (valueOfPowerOf2 % 400 == 0)){
					System.out.println(" "+i+" 		"+valueOfPowerOf2+" 		"+" Leap Year");
				}
				else {
					System.out.println(" "+i+" 		"+valueOfPowerOf2+" 		"+" Not a Leap Year");
				}	
			}
		}
		else {
			System.out.println("Invalid Range! please provide n from 0 upto 31");
		}
	}
}