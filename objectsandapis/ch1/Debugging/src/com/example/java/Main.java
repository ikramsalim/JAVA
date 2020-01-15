package com.example.java;

public class Main {

    public static void main(String[] args) {
	// DEBUG, USE THE BUG SYMBOL ON INTELLIJ
        //STEPINTO, STEP OVER, FORCE STEP ARROWS BELOW
        //CREATE A BREAKPOINT ON THE SOUT
        String welcome = "Welcome!";
        char [] chars =welcome.toCharArray();
        //foreach then press TAB to get the format below
        for (char character:
             chars) {
            System.out.println(character);
            
        }
    }
}
