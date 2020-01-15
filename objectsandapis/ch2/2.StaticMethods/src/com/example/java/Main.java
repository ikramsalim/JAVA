package com.example.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //main method we are in
        // return type void - returns nothing
	    // keyword ->public which is  an access modifier ; can be called from everywhere
         //private and protected are other examples of access modifiers

        //STATIC METHODS - can be called directly from the class without
        // without first creating an instance of that class
        //OPPOSITE of static is Instance method which can be called from
            //an instance of a class known as an OBJECT.

        String input = getInput("Enter value 1: ");
        System.out.println("The string you entered is " + input);
        //add more
        input = getInput("Enter value 2: ");
        System.out.println("The string you entered is " + input);

    }
        //CREATE CUSTOM METHOD BY CLICKING
        // "REFACTOR" IN INTELLIJ ..."EXTRACT".. METHOD"

    private static String getInput(String prompt ) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    //Can create as many static methods as you can to encapsulate
}
