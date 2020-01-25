package com.example.java;
import com.example.java.utilities.*;

public class Main {

    public static void main(String[] args) {
	// USE OF CONSTANTS - use the keyword "final" when creating constants
        MathHelper helper = new MathHelper(100);


        try {
            while(true)
            {    // CAN CHANGE TO EITHER MathHelper.ADD/ MathHelper.SUBTRACT
                int input = helper.doMath("Enter a number", MathHelper.ADD);
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
