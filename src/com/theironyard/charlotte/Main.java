package com.theironyard.charlotte;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    static Album a = new Album();
    public static JsonSerializer serializer = new JsonSerializer();
    public static JsonParser parser = new JsonParser();

    public static void main(String[] args) throws IOException{
        a.album();
        File album = new File("album.json");
        FileWriter fw = new FileWriter(album);

        //writes to the JSON file
        String albumInfo = serializer.serialize(Main.a);
        fw.write(albumInfo);
        fw.close();

        System.out.println("Would you like to change any of this information?");
        Scanner scanner = new Scanner(album);
        String contents = scanner.next();
        scanner.useDelimiter("\\Z");
        parser.parse(contents, Album.class);
        Scanner responseScanner = new Scanner(System.in);
        String input  = scanner.nextLine();
        if (input.equals("yes")) {
            fw.append(responseScanner.nextLine());
        } else if (input.equals("no")) {
            System.exit(0);
        }
    }


}
