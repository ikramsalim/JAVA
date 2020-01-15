package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int monthNumber = 8;

        if (monthNumber >= 0 && monthNumber <=2){
            System.out.println("You're in Quarter 1!");
        }
        else if (monthNumber >=3 && monthNumber <=5){
            System.out.println("You're in Quarter 2!");
        }

        else {
            System.out.println("It's the second half of the year");
        }

//        int monthNumber = 0;
//
//        if (monthNumber == 0){
//            System.out.println("It's January!");
//        }
//        else{
//            System.out.println("It isn't January!");
//        }


    }
}
