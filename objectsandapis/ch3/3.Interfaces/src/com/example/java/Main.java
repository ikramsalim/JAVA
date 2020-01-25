package com.example.java;

import com.example.java.model.ClothingItem;
import com.example.java.model.Product;
import com.example.java.model.Shirt;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ClothingItem item = new ClothingItem("Shirt", "L", 19.99);
        //System.out.println(item);
        //this works because it knows
        displayProduct(item);

        //create an instance
        Shirt shirt = new Shirt("M", 14.99);
        //System.out.println(shirt);
        //METHODS KNOWS IT'E GETTING A PRODUCT
        //shirt is a subclass of ClothingItem(ci) and CI implements product Interface
        displayProduct(shirt);
        shirt.setPattern("Plaid");
        //setPattern can be called only from under Shirt
        System.out.println("The shirt pattern is " + shirt.getPattern());

        //CASTING
        //Upcasting - treating subclass as super class
        ClothingItem reallyAShirt = new Shirt("L", 12.99);
        //System.out.println(reallyAShirt);
        //method knows it's getting a product
        displayProduct(reallyAShirt);


        // use cast to shirt to use .setpattern
        //polymorphism at work- an obj is both itself and it's work
        Shirt shirt2 = (Shirt) reallyAShirt;
        shirt2.setPattern("Pattern =  " + shirt2.getPattern());

    }
    //FOR INTERFACE
    //this method can be used with anything that implements interface
    //METHOD WILL RECEIVE AN INSTANCE OF PRODUCT INTERFACE(Product product)
    private static void displayProduct(Product product){
        //replace all references with their equivalent getter methods
        //e.g type ->getType, size->getType
        String output= product.getClass().getSimpleName()+ "{"+
                "type='" + product.getType()+ '\'' +
                ", size='" + product.getSize() + '\'' +
                ", price=" + product.getPrice() +
                '}';
        System.out.println(output);

    }


}
