package com.example.java.utilities;

import javax.swing.*;

public class MathHelper {
    //click psfs before the instance declarations
    //NAME OF CONSTANTS ARE UPPERCASE IN JAVA
    //static  means it only belongs to MathHelper class
    public static final String ADD = "add";
    //create a psfs constant for subtract
    public static final String SUBTRACT = "subtract";

    //can also change psfs from String to int
            // public static final int ADD = "1001";
            //   public static final int SUBTRACT = "1002";
            //must change "String operation" to "int operation" in the parameter
            // in method doMath
    private int total;


    //static means it-belongs to class definitions only
    //final- value can only be set ONCE

   public MathHelper(int total){
       this.total += total;
   }

    //GETTER
    public int getTotal(){ return total; }

    public int doMath(String prompt, String operation) throws NumberFormatException{
       String input = InputHelper.getInput(prompt);
       int value = Integer.parseInt(input);

       //USE OF CONSTANTS
        switch (operation){
            case ADD:
                total += value;
                break;
            case SUBTRACT:
                total -= value;
                break;


        }
       total +=value;
       return value;
    }





}
