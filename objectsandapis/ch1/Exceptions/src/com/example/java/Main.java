package com.example.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Senna");
        //SYNTAX ERROR PREVENTS YOU FROM RUNNING

        //EXCEPTION ERROR HAPPENS AT RUNTIME
        //EXAMPLE OF ARRAYINDEXOUTOFBOUNDSEXCEPTIONS
        //USE char lastChar =chars[chars.length-1 ]; TO CORRECT THE CODE BELOW
        String welcome = "Welcome!";
        char  [] chars =welcome.toCharArray();
        char lastChar =chars[chars.length -1];
        System.out.println("last char: " + lastChar);


        //EXAMPLE OF NULLPOINTER EXCEPTION
        //COMMENT THE CODE ABOVE TO RUN THE ONE BELOW


        String nothing = null;
        System.out.println(nothing);

        // System.out.println("string length=" + nothing.length);

    }
}
