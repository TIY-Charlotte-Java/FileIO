package com.theironyard.charlotte;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    static Album userAlbum = new Album();
    public static JsonSerializer serializer = new JsonSerializer();
    public static JsonParser parser = new JsonParser();

    public static void main(String[] args) throws IOException, ParseException {
        System.out.println("Hello! Please answer a few questions about your favorite album.");
        //ask questions
        userAlbum.album();
        File album = new File("album.json");
        FileWriter fw = new FileWriter(album);
        //store answers as json object
        String albumInfo = serializer.serialize(userAlbum);
        fw.write(albumInfo);
        fw.close();

        System.out.println("Would you like to change any of this information? Please enter 'yes' or 'no'");
        //parse file and print what is stored
        Scanner scanner = new Scanner(album);
        scanner.useDelimiter("\\Z");
        String contents = scanner.next();
        parser.parse(contents, Album.class);
        System.out.println(contents);
        Scanner responseScanner = new Scanner(System.in);
        String input = responseScanner.nextLine();
        if (input.equals("yes")) {
            FileWriter overwriteFile = new FileWriter(album);
            userAlbum.album();
            String updatedInfo = serializer.serialize(userAlbum);
            //overwrite json obj that is saved with new answers
            overwriteFile.write(updatedInfo);
            overwriteFile.close();
            parser.parse(updatedInfo, Album.class);
            System.out.println(updatedInfo);
        } else {
            //if response is not "yes," exit program
            System.exit(0);
        }
    }
}
