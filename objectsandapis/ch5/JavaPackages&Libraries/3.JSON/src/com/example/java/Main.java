package com.example.java;

import com.example.java.model.Flower;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// download gson from github ..open source

        String fileName = "files/data.json";
        //create an instance of class
        //add try-catch block
        Gson gson = new Gson ();
        //try with resources by using ()
        //if you get an error- "Add exception to "
        //two objects 1.FileReader and 2.JsonReader
        try(FileReader fileReader = new FileReader(fileName);
            //jsonreader is using fileReader
            JsonReader reader = new JsonReader(fileReader)
        )
        {
            // parse the data & turn into an array of structured objects

            //Flower[].class is the definition of data structure we want JSON to use
            //use fore format

              Flower[] data = gson.fromJson(reader, Flower[].class);
            for (Flower flower:
                data ) {
                System.out.println(flower);
                
            }
        }


     //Example of encapsulation in java e.g gson library
        //All you need to know is
        //1.instantiate the library
        //2.call the various methods

    }


}
