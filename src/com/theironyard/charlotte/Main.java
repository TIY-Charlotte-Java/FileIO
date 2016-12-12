package com.theironyard.charlotte;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        Investigation inquiry = new Investigation();

        File f = new File("inquiry.json");
        //File f = new File("loser.notjson");"


        //read json
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        JsonParser parser = new JsonParser();
        try {
            inquiry = parser.parse(contents, Investigation.class);
        }catch (Exception exception){
            System.out.printf("Error Caught: %s", exception.getMessage());
            System.exit(1);
        }


        System.out.println(inquiry.toString());

        System.out.printf("You've just read your case file. Would you like to change anything. [Y/N]\n");
        //inquiry = inquiry;

        if(scanner.nextLine().equalsIgnoreCase("Y"))
        {
            inquiry.questionProcess(scanner);
        }
        // write json
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(inquiry);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();
    }
}
