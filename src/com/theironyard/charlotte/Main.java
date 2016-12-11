package com.theironyard.charlotte;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        // write your code here
        File f = new File("service.json");
        MasterChef chef = new MasterChef();
        //chef.bakery();


        Scanner scanner = new Scanner(f);
        scanner.useDelimiter("\\Z");
        String content = scanner.next();
        JsonParser parser = new JsonParser();
        MasterChef baker2 = parser.parse(content, MasterChef.class);
        System.out.println(baker2.toString());

        //baker2 = chef;


        Scanner input = new Scanner(System.in);
        System.out.println("would you like to update the file : y/n");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("y")) {
            chef.bakery();
        }
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(chef);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();


    }


}










