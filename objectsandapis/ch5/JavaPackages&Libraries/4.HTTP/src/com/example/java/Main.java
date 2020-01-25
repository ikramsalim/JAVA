package com.example.java;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//rt.jar file contains most of the classes called in Java
// new HTTP packages are not a part of rt.jar
//rt.jar stands for runtime
public class Main {
    // API MODULARITY IN JAVA 9
    private static final String DATA_URL =
            "http://services.hanselandpetal.com/feeds/flowers.json";

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        //declare the object
        //initialize it
        //instantiate with HttpClient.newHttpClient

        HttpClient client = HttpClient.newHttpClient();
        //build
        HttpRequest request =
                HttpRequest.newBuilder()
                        .uri(new URI(DATA_URL))
                        .GET()
                        .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        

    }
}
