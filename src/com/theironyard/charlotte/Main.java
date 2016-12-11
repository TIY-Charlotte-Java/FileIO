package com.theironyard.charlotte;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static java.util.Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        DogRescue newDog = new DogRescue();
        File f = new File("newRescue.json");
        try {
            Scanner fileScanner = new Scanner(f);
            fileScanner.useDelimiter("\\Z");
            String contents = fileScanner.next();
            JsonParser parser = new JsonParser();

            newDog = parser.parse(contents, DogRescue.class);
            System.out.println("Welcome to Online Dog Rescue.\nBecause paying for a dog is dumb.\n");
            System.out.println("Welcome back " + newDog.getName() + ". Our records indicate you placed an" +
                    " order for a dog with the following specifications:");
            System.out.println("Age: " + newDog.getAge());
            System.out.println("Size: " + newDog.getSize());
            System.out.println("Gender: " + newDog.getGender());
            System.out.println("Color: " + newDog.getColor());
            System.out.println("Do you want to change any of the information? Yes/no");
            String answer = Scanner.nextLine();
                if (answer.equalsIgnoreCase("No")) {
                    System.out.println("Goodbye");
                    System.exit(0);
                }
        } catch (Exception e) {
            System.out.println("Sorry there seems to be a problem here.");
        }

        System.out.println("Welcome to Online Dog Rescue.\nBecause paying for a dog is dumb.\n");
        System.out.println("What is your name?");
        String name = Scanner.nextLine();
        newDog.setName(name);

        System.out.println("Greetings " + name + ". We have a wide variety of dogs, " +
                "let's start with getting an age range in years.");
        String age = Scanner.nextLine();
        newDog.setAge(age);

        System.out.println("Is there a particular size you would like to rescue? " +
                "If so please specify with very small, small, medium, large, or very large.");
        String size = Scanner.nextLine();
        newDog.setSize(size);

        System.out.println("Do you have a preference as to the gender?");
        String gender = Scanner.nextLine();
        newDog.setGender(gender);

        System.out.println("What color dog would you like? Multiple colors are accepted.");
        String color = Scanner.nextLine();
        newDog.setColor(color);

        System.out.printf("Thank you %s for shopping with Online Dog Rescue. ", name);
        System.out.println("Expect delivery within 1 to 2 business days.");

        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(newDog);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();
    }
}
