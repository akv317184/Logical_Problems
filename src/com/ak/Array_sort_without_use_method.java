package com.ak;

// How to sort an array without using inbuilt method



public class Array_sort_without_use_method {
    public static void main(String[] args) {

        int temp,size;
        int array[] = {10,5,20,12,8,18};
        size = array.length;

        
        for(int i =0; i<size ; i++){
            for(int j=i+1; j<size ; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i =0 ; i<array.length ; i++){
            System.err.println("Array sorted :: "+array[i]);
        }


        // Print 3rd Largest number from an Array
        System.out.println("Third largest number is :: "+array[size-3]);
        System.out.println("===================================================");


        
        // // sort array using the Arrays.sort method
        // Arrays.sort(array);
        // System.out.println("Sorted array :: "+Arrays.toString(array));
        // int thirdMaxNum = array[size-3];
        // System.out.println("Third Highest array :: "+thirdMaxNum);
    }
}
