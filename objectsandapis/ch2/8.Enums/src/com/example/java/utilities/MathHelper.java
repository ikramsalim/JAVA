package com.example.java.utilities;
import javax.swing.*;

public class MathHelper {
    //ENUM
    //enum value can be defined ONCE
    //stored as internal values
    //each enum value must be unique

//    public static final int ADD = 1001;
//    public static final int SUBTRACT = 1002;

    private int total;

    public MathHelper(int total){
        this.total += total;
    }
    //GETTER
    public int getTotal(){ return total; }
    // change "int operation" which was constant
    // to "Operation operation" which identifies enum
    // in the parameter of the doMath
    public int doMath(String prompt, Operation operation) throws NumberFormatException{
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
        //total +=value; -> adds it twice
        return value;
    }

    //NESTED TYPE -- WHEN YOU COMMENT IT OUT AND ADD IT IN MATHHELPER
    // WHEN REFERENCING IN MAIN
    //USE MathHelper.Operation.ADD  or MathHelper.Operation.SUBTRACT
    //HIERARCHY  : MathHelper.Operation.ADD
    // MathHelper is Parent Class,
    // Operation is nested/membered class.
    // ADD is the value
    // CAN ADD STATIC VALUE(MathHelper.Operation) IN MAIN
    public enum Operation {

        ADD, SUBTRACT;
    }




}
