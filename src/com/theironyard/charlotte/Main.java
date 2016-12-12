package com.theironyard.charlotte;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
                System.out.println("Please enter a good:");
                String good = scanner.next();
                System.out.println("Please enter 5 attributes related to your good:");
                Attribute one = new Attribute();
                one.setAttributeOne(scanner.next());
                one.setAttributeTwo(scanner.next());
                one.setAttributeThree(scanner.next());
                one.setAttributeFour(scanner.next());
                one.setAttributeFive(scanner.next());
                /* Creates JSON file */
                File f = new File(good + ".json"); // Creates JSON file with input
                JsonSerializer serializer = new JsonSerializer();
                String json = serializer.serialize(one);
                FileWriter fw = new FileWriter(f);
                fw.write(json);
                fw.close();
                /* Outputs JSON file to terminal */
                System.out.println("The contents of your JSON file:");
                Scanner s = new Scanner(f);
                s.useDelimiter("\\Z");
                String contents = s.next();
                JsonParser parser = new JsonParser();
                Attribute output = parser.parse(contents, Attribute.class);
                System.out.println(output.toString());
                /*Prompts user to update JSON file*/
                System.out.println("Would you like to update your file? Yes or No");
                String option = scanner.next();
                if(option.equalsIgnoreCase("yes")) {
                    System.out.println("Please enter five new attributes:");
                    one.setAttributeOne(scanner.next());
                    one.setAttributeTwo(scanner.next());
                    one.setAttributeThree(scanner.next());
                    one.setAttributeFour(scanner.next());
                    one.setAttributeFive(scanner.next());
                    /* After new input, new JSON file is created. */
                    File fNew = new File(good + ".json");
                    JsonSerializer serializerNew = new JsonSerializer();
                    String jsonNew = serializerNew.serialize(one);
                    FileWriter newFw = new FileWriter(fNew);
                    newFw.write(jsonNew);
                    newFw.close();
                    /* Prints new contents of JSON file */
                    System.out.println("The contents of your JSON file:");
                    Scanner r = new Scanner(f);
                    r.useDelimiter("\\Z");
                    String contentsNew = r.next();
                    JsonParser parserNew = new JsonParser();
                    Attribute outputNew = parserNew.parse(contentsNew, Attribute.class);
                    System.out.println(outputNew.toString());
                } else {
                    System.out.println("Thank you! Have a good Day");
                }

    }
}