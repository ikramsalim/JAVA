package com.example.java.model;
//SHIRT IS A SUBCLASS
//CREATE CONSTRUCTOR MATCHING SUPER TO REMOVE ERROR

public class Shirt extends ClothingItem{
    //use two parameters instead of 3
    public Shirt(String size, double price) {
        super( "Shirt", size, price);
    }
}

