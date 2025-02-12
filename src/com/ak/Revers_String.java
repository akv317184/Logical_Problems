package com.ak;

public class Revers_String {

	public static void main(String[] args) {
		
		String orgString = "Hello Brother";
		StringBuilder sb = new StringBuilder(orgString);
		
		String revString = sb.reverse().toString();
		
		System.out.println("Orginal String ::"+orgString);
		System.out.println("Reveser String :: "+revString);
	}

    // public static void main(String[] args) {
		
	// 	String orgString = "Hello Brother";
	// 	String revString = reverseString(orgString);
		
	// 	System.out.println("orginal string ::"+orgString);
	// 	System.out.println("Revers String  :: "+revString);
	// }
	
	// public static String	reverseString(String str) {
		
	// 	if(str.isEmpty())
	// 		return str;
	// 	else
	// 		return reverseString(str.substring(1))+str.charAt(0);
	// }


    // // Reverse using loop
    // public static void main(String[] args) {
		
	// 	String orgString = "Hello Brother";
	// 	String revString ="";
	// 	for(int i=orgString.length()-1;i>=0;i--) {
	// 		revString += orgString.charAt(i);
	// 	}
		
	// 	System.out.println("orginal String ::"+orgString);
	// 	System.out.println("Reverse String :: "+revString);
	// }

}
