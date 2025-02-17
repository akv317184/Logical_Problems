package com.ak;

import java.util.Scanner;

// Java program to find Fibonacci series upto a given number range
public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the terms");
		int num = in.nextInt();
		int first =0, second =1, next;
		System.out.println("Fibonacci series is");
		for(int i =0; i<=num; i++) {
			System.out.print(first+" ");
			next = second+first;
			first = second;
			second = next;
		}
		// close
		in.close();
	}

}
