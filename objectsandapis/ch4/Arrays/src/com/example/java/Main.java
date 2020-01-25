package com.example.java;

import com.example.java.model.ClothingItem;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //ordered vs unordered
        //ordered e.g Arrays
        //Arrays can't be resized after they created -must fix the size
        System.out.println("Array of primitives");
        int[] ints = {3,6,9};
        //fori code template
        for (int i = 0; i < ints.length ; i++) {
            System.out.println(ints[i]);
        }

        //foreach loop is cleaner and uses less vars
        for (int anInt :ints){
            System.out.println(anInt);
        }

        System.out.println("Array of strings");
        String[] colors = {"Red", "Green", "Blue"};
        //use foreach code template
        for (String color:
             colors ) {
            System.out.println(color);
        }

        //declare with a specific number
        ClothingItem[] items = new ClothingItem[3];
        items[0] = new ClothingItem("Shirt", "S", 12.9);
        items[1] = new ClothingItem("Pants", "M", 13.9);
        items[2] = new ClothingItem("Hat", "L", 10.9);

        //use fore code template
        for (ClothingItem item:
                items
             ) {
            System.out.println(item);
        }

        //copy of an array
        ClothingItem[]  copied = Arrays.copyOf(items, items.length);
        for (ClothingItem item:
             copied) {
            System.out.println(item);
        }

        //making a change to one of the objects in the array
        //creating a discount for item[0]
        items[0].setPrice(5);
        System.out.println(items[0]);
        System.out.println(copied[0]);
        //the discount affected both arrays in index 0
        // since they are pointing in the same object in memory



    }
}
