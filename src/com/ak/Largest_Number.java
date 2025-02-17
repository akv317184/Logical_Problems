package com.ak;

import java.util.ArrayList;
import java.util.Collections;

public class Largest_Number {

	public static void main(String args []) {
//		// By using if else condition
//		int num1 = 2, num2 = 8, num3=9;
//		if(num1>=num2 && num1>=num3) System.out.println(num1+" is the largest number");
//		else if(num2>=num2 && num2 >=num3) System.out.println(num2+" is the largest number");
//		else System.out.println(num3+" is the largest number");
		
		// By using Collectons.max() method and arrayList
		ArrayList <Integer> ls = new ArrayList<>();
		ls.add(34);
		ls.add(89);
		ls.add(84);
		System.out.println(Collections.max(ls)+ " is the largest number");
	}
}
