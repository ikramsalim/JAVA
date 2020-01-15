package com.example.java;
import java.text.DecimalFormat;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here

        //TWO VERSIONS
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a numeric value: ");
        String input1 = sc.nextLine();
        double d1 = Double.parseDouble(input1);
        System.out.println("Enter a numeric value : ");
        String input2 = sc.nextLine();
        double d2 = Double.parseDouble(input2);

        double result = d1 + d2;

        System.out.println("The answer is " + result);


//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter Value 1: ");
//        int intValue1 = sc.nextInt();
//        System.out.println("Please enter Value 2 : ");
//        int intValue2 = sc.nextInt();
//
//        int intSum = intValue1 + intValue2;
//        String stringSum = Integer.toString(intSum);
//        //save intSum as stringValues
//        System.out.println("The sum of " + intValue1 + " and " +
//               intValue2 + " is " + stringSum);

    }
}
