package com.example.java;
import com.example.java.utilities.*;
// CAN ADD STATIC VALUE(MathHelper.Operation) IN MAIN
import static com.example.java.utilities.MathHelper.Operation.*;

public class Main {

    public static void main(String[] args) {
        // USE OF CONSTANTS - use the keyword "final" when creating constants
        MathHelper helper = new MathHelper(100);


        try {
            while(true)
            {    // CAN CHANGE TO EITHER MathHelper.ADD/ MathHelper.SUBTRACT when using CONSTANT


                // FOR ENUM, CHANGE TO Operation.ADD / Operation.SUBTRACT
                //WHEN ENUM IS LOCATED IN MATHHELPER.JAVA, USE MathHelper.Operation.ADD
                int input = helper.doMath("Enter a number",
                        ADD);
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
