package com.ak;

import java.util.Arrays;

public class Second_Largest_and_Smallest_number {
    public static void main(String[] args) {
        int[] arrayList = {4,2,3,1,9,6};
        int num = arrayList.length;
        Arrays.sort(arrayList);

        // Display second largest element
        System.out.println("Second largest element is "+arrayList[num-2]);

        // Display Second smallest element
        System.out.println("Second smallest element is :: "+arrayList[1]);
    }
}
