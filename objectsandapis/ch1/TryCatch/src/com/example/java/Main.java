package com.example.java;

public class Main {

    public static void main(String[] args) {
	//Click CODE -> "Surround with" try/catch
        //The try statement allows you to define a block of code
        //to  be tested for errors while it is being executed.
        //The catch handles the exceptions that occurs


        try {
            String welcome = "Welcome!";
            //ArrayIndexOutOfBoundsException
            char[] chars = welcome.toCharArray();
            char lastChar = chars[chars.length - 1];
            System.out.println("Last Char: " + lastChar);
            //add -1 above to erase the error

            //introduce a null pointer exception
            String nothing = null;
            System.out.println(nothing.length());
        }
        //distinguish the catches by adding sout for each error
        catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Null exception");
            return;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Array index exception");
            return;
        }
        catch(Exception e){
            System.out.println("Any exception");
        }

        System.out.println("Code ran successfully");
    }
}
