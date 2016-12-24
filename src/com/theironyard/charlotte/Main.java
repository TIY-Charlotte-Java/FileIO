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

        System.out.println("Would you like to change any of this information?");
        Scanner scanner = new Scanner(album);
        scanner.useDelimiter("\\Z");
        String contents = scanner.next();
        parseFile(contents);
        Scanner responseScanner = new Scanner(System.in);
        String input  = responseScanner.nextLine();
        if (input.equals("yes")) {
            FileWriter overwriteFile = new FileWriter(album);
            userAlbum.album();
            String updateInfo = serializer.serialize(userAlbum);
            if (updateInfo.contains("")) {
                overwriteFile.write(updateInfo);
                overwriteFile.close();
                parseUpdatedFile(updateInfo);
            }
        } else if (input.equals("no")) {
            System.exit(0);
        }
    }

    public static void parseFile (String contents) throws ParseException{
        parser.parse(contents, Album.class);
        System.out.println(contents);
    }

    public static void parseUpdatedFile(String updateInfo) throws ParseException {
        parser.parse(updateInfo,Album.class);
        System.out.println(updateInfo);
    }
}
