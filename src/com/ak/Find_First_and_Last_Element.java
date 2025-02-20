package com.ak;

import java.util.ArrayList;

public class Find_First_and_Last_Element {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(5);
        al.add(44);
        al.add(9);
        al.add(378);
        al.add(5);
        al.add(89);
        // Find first Element
        int first = al.get(0);

        // find last Element
        int last = al.get(al.size()-1);
        System.out.println("First element :: "+first);
        System.out.println("Last element :: "+last);
    }
}
