package com.example.java.utilities;

public class MathHelper {
    //private means data is protected
    // - must create getter and setter if want to access to data

    private int total;
    //Click Code->Generate->Getter&Setter

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
