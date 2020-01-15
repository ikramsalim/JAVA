package com.example.java;

public class Main {

    public static void main(String[] args) {
        //Any exception that has runtime exception
        //is UNCHECKED EXCEPTION E.G ARRAYINDEXOUTOFBOUND
        //you don't have to declare


        try {
            String welcome = "Welcome!";
            //ArrayIndexOutOfBoundsException
            char[] chars = welcome.toCharArray();
            char lastChar = chars[chars.length - 1];
            System.out.println("Last Char: " + lastChar);

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
           //ADDING CHECKED EXCEPTION
          //MUST DECLARE FOR IT TO WORK
           //sleep for 1000 milli seconds
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //CODE ->Surround with ..try/catch
        try {
            doSomething();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Code ran successfully");
    }

    //same exception within a custom method
    //create a dosomething with try and catch block in the mainmethod
    public static void doSomething() throws InterruptedException{
        Thread.sleep(100);
    }

}
