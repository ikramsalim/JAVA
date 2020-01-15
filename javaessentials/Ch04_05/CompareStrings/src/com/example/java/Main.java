package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Comparing strings

        String s1 = "Hello!";
        String s2 = "Hello!";

        if(s1 == s2){
            System.out.println("S1 and S2 match!");
        }
        else{
            System.out.println("S1 and S2 don't match!");
        }


        String s3= new String( "Hello!");
        String s4= new String( "Hello!");

        //when you use the standard creation syntax for strings
        //the 2 variables are pointing to two distinct objects
        //hence won't be equal

        if(s3 == s4){
            System.out.println("S3 and S4 match!");
        }
        else{
            System.out.println("S3 and S4 don't match!");
        }

        //USE METHODS OF THE STRING CLASS

        String s5= new String( "Hello!");
        String s6= new String( "Hello!");

        //when you use the standard creation syntax for strings
        //the 2 variables are pointing to two distinct objects
        //hence won't be equal

        //use equals and equalsIgnoreCase
        if(s5.equals(s6)){
            System.out.println("S5 and S6 match!");
        }
        else{
            System.out.println("S5 and S6 don't match!");
        }



    }
}
//Using double equals operator is an unreliable way
//of comparing of strings
//USE METHODS OF THIS CLASS
