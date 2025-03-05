package com.ak;

// input = "apple is fruit"
// output = p i

public class Duplicate_char_String {

    public static void main(String[] args) {
    
        String str = "apple is fruit";
        char[] carray = str.toCharArray();
        System.out.println("The String is : "+str);
        System.out.println("Duplicate  characters in above string are : ");
        for(int i =0 ; i<str.length() ; i++){
            for(int j=i+1 ; j<str.length() ; j++){
                if(carray[i] == carray[j]){
                    System.out.print(carray[j] + "");
                    break;
                }
            }
        }
    }
}
