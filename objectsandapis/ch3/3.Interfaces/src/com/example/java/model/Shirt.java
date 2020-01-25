package com.example.java.model;

public class Shirt extends ClothingItem{
    private String pattern = "Not set";
    //create G&S
    //Getter and setter lets the field "Pattern" be available to the application
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
   //
    public Shirt(String size, double price) {
        super("Shirt", size, price);
    }
}
