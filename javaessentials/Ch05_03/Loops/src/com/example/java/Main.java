package com.example.java;

public class Main {

    private static String [] months ={
            "January","February","March",
            "April","May","June",
            "July","August","September",
            "October","November", "December"};

    public static void main(String[] args) {
	// write your code here

        //Lists all the months
//        for (int i= 0; i < months.length ; i++) {
//            System.out.println(months[i]);
//        }

        //Lists all months
//        for (String month :
//                months) {
//            System.out.println(month);
//        }
//
        //WHILE LOOP ->DECLARE COUNTER BEFORE
        //Lists all months
//        int counter = 0;
//        while(counter<months.length){
//            System.out.println(months[counter]);
//            counter ++;
//        }

        //DO WHILE LOOP
        //DECLARE COUNTER WITH ZERO
        //IN DO-WHILE LOOP EXECUTE CODES FIRST THEN EVALUATES THE CONDITION

//        int counter = 0;
//        do {
//            System.out.println(months[counter]);
//            counter++;
//        } while(counter < months.length);

     //OUTPUT FIRST 5 MONTHS ONLY!!!!
        //use break;

        int counter = 0;
        do {
            System.out.println(months[counter]);
            counter++;
            if(counter == 6){
                break;
            }
        } while(counter < months.length);

    }
}
