package com.example.java.utilities;
import java.util.*;

public class InputHelper {

    //return inputhelper into STATIC STATE and can be
    //called directly from the InputHelper CLASS
    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //the method below doesn't have the keyword static
    // hence it's instance
    //call it from the object from main
    //must create an object when using instance and that takes some memory.
    //Instance methods have access to date stored within the class

//    public static String getInput(String prompt){
//        System.out.println(prompt);
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//
//         }

}