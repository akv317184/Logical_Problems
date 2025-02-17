package com.ak;

import java.util.Scanner;

public class Count_Digits_Number {

	public static void main(String args []) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = in.nextInt();
//		int count =0;
//		while(num!=0) {
//		
//			num=num/10;
//			count++;
//		}
//		System.out.println("Number of digits : "+count);
		// close
		in.close();
		
		// converting given number to string solutions to count digits in an integer
		String result = Integer.toString(num);// calculate the size of string
		System.out.println(result.length());
		
	}
}
