package com.example.java;

import com.example.java.model.ClothingItem;
import com.example.java.model.Shirt;

public class Main {

    public static void main(String[] args) {
	// polymorphism - sth can be more than one thing
        ClothingItem item = new ClothingItem("Shirt", "L", 19.99);
        System.out.println(item);

        //create an instance
        Shirt shirt = new Shirt("M", 14.99);
        System.out.println(shirt);
        shirt.setPattern("Plaid");
        //setPattern can be called only from under Shirt
        System.out.println("The shirt pattern is " + shirt.getPattern());

        //CASTING
        //Upcasting - treating subclass as super class
        ClothingItem reallyAShirt = new Shirt("L", 12.99);
        System.out.println(reallyAShirt);
        // use cast to shirt to use .setpattern
        //polymorphism at work- an obj is both itself and it's work
        Shirt shirt2 = (Shirt) reallyAShirt;
        shirt2.setPattern("Pattern =  " + shirt2.getPattern());



    }
}
