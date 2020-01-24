package com.example.java;
import com.example.java.utilities.InputHelper;
import com.example.java.utilities.MathHelper;


public class Main {

    public static void main(String[] args) {

        //The use of objects and instance methods
//        InputHelper helper = new InputHelper();
//
//        String input = helper.getInput("Enter value 1 :");
//        System.out.println("You entered: " + input);
//        input = helper.getInput("Enter value 2 :");
//        System.out.println("You entered: " + input);

        //instance variables
        //create an instance of the helper class for Math
        //ADDNUMBER IS AN INSTANCE METHOD FROM MATHHELPER
        MathHelper helper = new MathHelper(100);



        //create infinite loop and each time
        // will get a value  from the helper object
        try {
            while(true)
            {
                int input = helper.addNumber("Enter a number");
                //find current total
                int total = helper.getTotal();
                //report current results by creating a string
                String message = String.format
                        ("Entered: %d, total = %d  ", input, total);
                 //output result
                System.out.println(message);

            }
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("All done. Sorry, not an integer! ");
        }
    }
}
//EXAMPLE OF INSTANCE VAR
//class Taxes
//{
//    int count;
//    /*...*/
//}

//EXAMPLE OF CLASS VAR known as STATIC VAR - has static keyword
//class Taxes
//{
//   static int count;
//    /*...*/
//}

//ANOTHER EXAMPLE OF INSTANCE VARIABLE
//An instance variable is a variable that is a member of an instance
//of a class (i.e associated with something created with a new),
// whereas a class variable is a member of the class itself.

//Instance variable is the variable declared inside a class,
// but outside a method: something like:
//
//class IronMan{
//
//    /** These are all instance variables **/
//    public String realName;
//    public String[] superPowers;
//    public int age;
//
//    /** Getters / setters here **/
//}
//Now this IronMan Class can be instantiated in other class to use these variables, something like:
//
//class Avengers{
//    public static void main(String[] a){
//        IronMan ironman = new IronMan();
//        ironman.realName = "Tony Stark";
//        // or
//        ironman.setAge(30);
//    }
//
//}
