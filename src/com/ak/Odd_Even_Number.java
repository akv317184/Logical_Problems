package com.ak;

import java.util.Scanner;

public class Odd_Even_Number {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = in.nextInt();
		if(num%2 ==0)   System.out.println(num+" is even number");
		else System.out.println(num + " is odd number");

		// close
		in.close();
	}

}
