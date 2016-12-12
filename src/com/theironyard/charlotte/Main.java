package com.theironyard.charlotte;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    File f = new File("service.json");
    MasterChef chef = new MasterChef();


    public static void main(String[] args) throws IOException {
        Main file = new Main();

        try {

            file.readFromFile();
            Scanner input = new Scanner(System.in);
            System.out.println("would you like to update the file : y/n");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                //chef.bakery();
                file.writeToFile();


            }


        } catch (Exception e) {
            System.out.println("you have an error");
        }


    }


    public void readFromFile() throws IOException {
        Scanner scanner = new Scanner(f);
        scanner.useDelimiter("\\Z");
        String content = scanner.next();
        JsonParser parser = new JsonParser();
        MasterChef baker2 = parser.parse(content, MasterChef.class);
        String out = baker2.toString();
        System.out.println(baker2.toString());

    }

    public void writeToFile() throws IOException {

        chef.bakery();
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(chef);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();


    }

}




















