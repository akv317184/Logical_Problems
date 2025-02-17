package com.ak;

/*
 * Input: a =100, b=200;
 * Output: a=200, a=100;
 */

public class SwappingNumber {

	public static void main(String[] args) {
		int a=100, b=200;
		System.out.println("Befor swapping, a = "+a+" and b = "+b);
//		
//		//Swapping using three variables
//		int temp = a;
//		a=b;
//		b=temp;
//		System.out.println("After swapping, a = "+a+" and b = "+b);
		
		// Swapping two variables using
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a="+a+" and b="+b);

//		// Swapping a and b using XOR
//		a= a^b;
//		b= a^b;
//		a= a^b;
//		System.out.println("After swapping, a = "+a+" and b = "+b);
	}

}
