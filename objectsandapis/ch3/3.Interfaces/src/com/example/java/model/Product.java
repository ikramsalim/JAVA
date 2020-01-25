package com.example.java.model;
//INTERFACE- YOU DON'T ADD IMPLEMENTING CODE

//Assume clothing item is one kind of product

public interface Product {
   //type and name of each getter method in ClothingItem
    //They are abstract methods
    //don't need access modifiers

    String getType();
    String getSize();
    double getPrice();


}
