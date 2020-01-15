package com.example.java;

public class Main {

    public static void main(String[] args) {
	//Click CODE -> "Surround with" try/catch
        //The try statement allows you to define a block of code
        //to  be tested for errors while it is being executed.
        //The catch handles the exceptions that occurs


        try {
            String welcome = "Welcome!";
            //ArrayIndexOutOfBoundsException
            char [] chars =welcome.toCharArray();
            char lastChar = chars[chars.length -1];
            System.out.println("Last Char: " + lastChar);
            //add -1 above
            //introduce a null pointer  exception
            String nothing = null;
            System.out.println(nothing.length());
            

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("Code ran successfully");
    }
}
