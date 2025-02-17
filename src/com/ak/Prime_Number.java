package com.ak.test;

import java.util.Scanner;

// Java program to find prime number

public class Prime_Number {

	public static void main(String[] args) {
        // Scanner using for input
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = in.nextInt();
        
        // If-else using for condition checking. It is prime number or not
		if(isPrime(num)) System.out.println(num + " is prime number");
		else System.out.println(num + "  is not prime number");
		
		// close
		in.close();
	}
	
    // create a static method
	public static boolean isPrime(int num) {
        
		for(int i =2; i<=num/2 ; i++) {
			// try each number by using  %
			if(num % i == 0) return false;
		}
		return true;
	}

}