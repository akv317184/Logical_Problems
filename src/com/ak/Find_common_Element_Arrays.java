package com.ak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Find Common Element Arrays
 * input   Integer[] array1 ={4,2,1,3,6};
           Integer[] array2 ={6,7,8,4,2};
   output  Common Element :: [4, 2, 6]


   second Input   String[] array3 = {"java", "Spring","C","C++"};
                  String[] array4 ={ "html","java","xml","C","Spring"};
   Output       [java, Spring, C]
 */

public class Find_common_Element_Arrays {
    public static void main(String[] args) {
        Integer[] array1 ={4,2,1,3,6};
        Integer[] array2 ={6,7,8,4,2};

        /*
        //Using the For Loop
        List<Integer> commonElement = new ArrayList<>();
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                if(array1[i]== array2[j]){
                    commonElement.add(array1[i]);
                }
            }
        }
        System.out.println("Common element for given two array List is :: "+commonElement);
        */


        //By using ArrayList  with retainAll method
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
        list1.retainAll(list2);
        System.out.println("Common Element :: "+list1);


        //Using java Stream
        String[] array3 = {"java", "Spring","C","C++"};
        String[] array4 ={ "html","java","xml","C","Spring"};
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList(array3));
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList(array4));
        List<String> commonElement1 =
             list3.stream().filter(list4::contains).collect(Collectors.toList());
        System.out.println(commonElement1);

    }
}
