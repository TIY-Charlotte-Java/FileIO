package com.theironyard.charlotte;

import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> answer = new ArrayList();


        File f = new File("answer.json");
        if (f.exists() && !f.isDirectory()) {
            Scanner s = new Scanner(f);
            s.useDelimiter("\\Z");
            String contents = s.next();
            System.out.print(contents);
        }
        System.out.println("Would you like to create or update your answers? y/n");
        Scanner scanner = new Scanner(System.in);
        String yOrNo = scanner.nextLine();

        if (yOrNo.equalsIgnoreCase("n")) {

            System.exit(0);

        } else
            System.out.println("What is your name?");
        answer.add(scanner.next());
        System.out.println("What is your quest?");
        answer.add(scanner.next());
        System.out.println("What is your favorite color?");
        answer.add(scanner.next());
        System.out.println("What is the capital of Assyria?");
        answer.add(scanner.next());
        System.out.println("What is the airspeed velocity of an unladen swallow?");
        answer.add(scanner.next());

        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(answer);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();


    }


    //if the file exists
    //read and parse
    //print the data @override to string
    //ask if the user wants to update the file
    // if no end program


    //ask questions
    //update the file
}
