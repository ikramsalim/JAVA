package com.example.java.utilities;

public class MathHelper {
    //private means data is protected
    // - must create getter and setter if want to access to data

    private int total;
    //Click Code->Generate->Getter&Setter

    //create constructor Code->Generate->Constr->SelectNone
    //Constructors don't have a return type and has the same name as the class
    //called after memory is allocated for the object
    //Constructor -used to initialize object
    //used tp SET INITIAL VALUES AS BELOW
    //SET TOTAL TO 50;
    //Java creates one for you if you don't create one and it's sort of hidden

    public MathHelper() {
        System.out.println("Constructor called");
        //set initial state of the object
        total = 50;
    }
    //MORE THAN 1 CONSTRUCTOR - OVERLOADING THE METHOD
     //END UP ADDING 100 FROM CONSTRUCTOR BELOW AND 50 FROM ABOVE

    public MathHelper(int total) {
        //USE THE KEYWORD "this" as a name of method e.g this();
        // to change constructors
        this();
        this.total += total;
    }

    public int getTotal() {
        return total;
    }
     //setter method below is never used and you can delete/comment it
    public void setTotal(int total) {
        this.total = total;
        //this.total means it belongs only to this method
        //this is the state of the object whether you add or subtract and it
        //will remember the state of the object
    }

    //create a new instance method
    //to add value to
    // add a throws clause if user enters a value that can't be parsed an integer
    // and use a try catch
    public int addNumber (String prompt) throws NumberFormatException{
        //get input from user
        String input = InputHelper.getInput(prompt);
        //convert string to int
        int value = Integer.parseInt(input);
        total += value ;
        return value;

    }
}
