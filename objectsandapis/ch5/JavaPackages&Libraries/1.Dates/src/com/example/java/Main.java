package com.example.java;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	// older api for date - month indexing starts at 0
        Date now = new Date();
        System.out.println(now);

        //use gregorian calendar to create a date object that represents a particular moment
        GregorianCalendar gc = new GregorianCalendar(2009, 1, 23 );
        Date d1 = gc.getTime();
        System.out.println(d1);

        //add value
        gc.add(GregorianCalendar.DATE, 1);
        Date d2 = gc.getTime();
        System.out.println(d2);
        //format to make it readable
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));

        //newer api month indexing starts at 1

        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);

        LocalDate ld = LocalDate.of(2009, 1, 28 );
        System.out.println(ld);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dtf.format(ld));




    }
}
