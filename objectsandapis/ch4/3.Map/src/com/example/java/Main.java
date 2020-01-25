package com.example.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //hashmap -key-value pairs
        //can be any class type
        Map <String,String> map = new HashMap<>();
        //start declaring objects of Kenyan provinces and their capital
        map.put("Rift Valley", "Nakuru");
        map.put("Coast", "Mombasa");
        map.put("Western", "Kakamega");
        System.out.println(map);


        //add one more item
        map.put("Nyanza", "Kisumu");
        System.out.println(map);
        // importance of collections;
        // lists and maps are resizable unlike simple arrays

        //get value via key
        String capital= map.get("Nyanza");
        System.out.println("The capital is " + capital);

        //remove an object
        map.remove("Nyanza");
        System.out.println(map);


    }
}
