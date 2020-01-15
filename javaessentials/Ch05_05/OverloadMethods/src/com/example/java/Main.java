package com.example.java;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = getInput("Enter  numeric value 1:" );
        String s2 = getInput("Enter  numeric value 2:" );
        double result = addValues(s1,s2);
        System.out.println("The answer is " + result);

        //after making the last  method which has String...values
        double result2 = addValues(s1, s2, s1, s2);
        System.out.println("The answer from multiple values is" + result2);
    }
     private static String getInput(String prompt) {
         System.out.print(prompt);
         Scanner sc = new Scanner(System.in);
         return sc.nextLine();
     }
     private static double addValues(String s1, String s2){
         double d1 = Double.parseDouble(s1);
         double d2 = Double.parseDouble(s2);
         return d1 + d2;
     }

     //String... values //will accept any number of argument
    //as long as they are the same type
    //in this case ,,,STRINGS
    
    private static double addValues(String... values){
        double result = 0;
        for (String str:
            values ) {
            double d = Double.parseDouble(str);
            result +=d;

        }
        return result;

    }

}
