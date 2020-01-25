package com.example.java.utilities;
import java.util.Scanner;
//created a package by clicking com.example.java->New -> add.utilities in it
public class InputHelper {
    //delete the keyword static from method below
    //WHY?
    //a method needs to work persistent data and must be instant
    public String getInput(String prompt ) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}