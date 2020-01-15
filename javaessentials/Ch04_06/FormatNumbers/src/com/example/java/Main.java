package com.example.java;
import java.lang.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        //import java.lang for all primitive values
        double doubleValue = 1_234_567.89;

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(doubleValue));

        //format double value to Integer
        //you lose the fractional value. doesn't truncate
        //it rounds it up or down depending on the decimal
        NumberFormat intFormat = NumberFormat.getIntegerInstance();
        System.out.println(intFormat.format(doubleValue));

        //to eliminate the separate characters
        numberFormat.setGroupingUsed(false);
        System.out.println(numberFormat.format(doubleValue));

        //Format Number to Country rules
        // e.g = Germany DE ;
        // in Germany :use of commas and dots is reversed
        Locale locale = new Locale("de", "DE");
        NumberFormat localFormat = NumberFormat.getNumberInstance(locale);
        System.out.println(localFormat.format(doubleValue));

        //format currency values
        // to germany by inputting locale
        //remove locale if you want dollar signs
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormat.format(doubleValue));

        //Customise format to how you want it
        //use Decimal Formayt
        DecimalFormat df = new DecimalFormat("$000.00#");
        System.out.println(df.format(1));
        System.out.println(df.format(5.897));
        //it ends up losing the last number 7
        // add # on  "$000.00" so that you don't lose the
        //trailing fractional zeros




    }
}
