package com.ak;

import java.util.Scanner;

public class Sum_of_Digits {

	public static void main(String args [] ) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number");
		int  num = in.nextInt();
        int number = num;
		int sum=0;

		while(num!=0) {  // using while loop
			sum=sum+num%10;
			num=num/10;
			
		} // while loop

		System.out.println(number+" Sum of  the ditigs :: "+sum);

		// close
		in.close();
	}
}

