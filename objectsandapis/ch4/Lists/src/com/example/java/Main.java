package com.example.java;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //collections
        //lists is ordered
        List<String> provinces= new ArrayList<>();
        provinces.add("Rift Valley");
        provinces.add("Coast");
        provinces.add("Western");
        provinces.add("Nyanza");
        
       //use fore code template
        for (String province:
            provinces ) {
            System.out.println(province);
        }

        //List of numeric values
        //use helper class
        List<Integer> ints = new ArrayList<>();
        ints.add(32);
        ints.add(89);
        ints.add(42);
        ints.add(61);

        //P.S: Instead of int, use anInt in Java foreach loop
        for (Integer anInt:
             ints) {
            System.out.println(anInt);
        }

        //remove an item
        provinces.remove(1);
        for (String province:
             provinces) {
            System.out.println(province);
        }
        //retrieve an item
        //use method get
        //append

        String province = provinces.get(1);
        System.out.println("The second province is "+ province);

        //find a particular item
        //use indexOf
        int pos = provinces.indexOf("Rift Valley");
        System.out.println("Rift Valley is at position " + pos);


    }
}
