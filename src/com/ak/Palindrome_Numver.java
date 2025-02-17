package com.ak;

import java.util.Scanner;

public class Palindrome_Numver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = in.nextInt();
	
		// Reverse a Number using the while loop reversed number
		int rev =0;
		int temp =num;
		int  rem ;// remainder
		while(num>0) {
			rem=num%10;
			rev = num/10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println("Reversed Number is "+rev);
		// Verify number is palindrome or not
		if(rev==temp) System.out.println(temp +" is Palindrome number");
		else System.out.println(temp +" is not palindrome number");
		//close
		in.close();
	}

}


