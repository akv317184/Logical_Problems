package com.ak;
import java.util.Scanner;

public class Remove_Space_String {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = in.nextLine();
        System.out.println("Input String :: "+str);
        str = str.replaceAll("\\s","");
        System.out.println("Final String :: "+str);

        // close
        in.close();
    }
}
