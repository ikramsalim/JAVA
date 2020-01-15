package com.example.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //SCANNER CLASS encapsulates most of the information and helps us to use it
        // without knowing what's going on inside
        //ENCAPSULATION -MOST IMP. OOP PRINCIPLE
           //1.Packaging of complex functionality in classes
           //2. Break up larger applications into smaller applications
        //click on Scanner + CMD to find more about the class

        //only for inputting string
        System.out.println("Please enter a value: ");
        Scanner scanner= new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("You entered " + input);

    }
}
