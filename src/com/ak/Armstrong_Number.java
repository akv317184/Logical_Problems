package com.ak;

import java.util.Scanner;

// Armtstrong number is a number the is equal to the sum of cubes of its digits.
// Example 153

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number");
		int num  = in.nextInt(); // it is number of check armstrong
		int sum=0, res, temp; 
		temp=num;
		while(num>0) {
			res= num%10;
			num= num/10;
			sum = sum+(res*res*res);
		}
		if(temp == sum) System.out.println(temp + " is armstrong number");
		else System.out.println(temp+" is not armstrong number");
		// close
		in.close();

	}

}
