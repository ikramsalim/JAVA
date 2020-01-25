package com.example.java;

import com.example.java.model.ClothingItem;
import com.example.java.model.Shirt;

/**
 * Generate Javadocs by Tool->Generate
 * <b> Can use html markup for comments</b>
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        ClothingItem item = new ClothingItem("Shirt","L", 19.99 );
        System.out.println(item);

        //create an instance of Shirt
        Shirt shirt = new Shirt("M", 14.99);
        System.out.println(shirt);


    }
}

//Java supports single inheritance
//Each class can only extend or inherit functionality from one other class.
//Each class can have one superclass
