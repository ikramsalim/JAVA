package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        StringBuilder sb = new StringBuilder ("Welcome" );
//        sb.append(" to California!");
//        String result = sb.toString();
//        System.out.println(result);

        StringBuilder b = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value 1: ");
        String input1 = sc.nextLine();
        System.out.println("Enter Value 2: ");

        String input2 = sc.nextLine();

        b.append(input1)
                .append(", ")
                .append(input2);

        System.out.println(b.toString());




    }
}
