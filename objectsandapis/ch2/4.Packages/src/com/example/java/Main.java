package com.example.java;
import com.example.java.utilities.InputHelper;


public class Main {
    //creating custom classes
    public static void main(String[] args) {
        //create an instance of the InputHelper CLASS
        //Instance method belongs to an instance of a class
           //rather than the class itself
        //create a helper object as done below
        InputHelper helper = new InputHelper();

        String input = helper.getInput("Enter value 1: ");
        System.out.println("The string you entered is " + input);
        input = helper.getInput("Enter value 2: ");
        System.out.println("The string you entered is " + input);
    }


}

