package com.theironyard.charlotte;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by Ben on 12/9/16.
 */
public class CreateJsonFile extends VideoGame{

    public CreateJsonFile(String title, String developer, String releaseDate, String esrbRating, String ignRating) {
        super(title, developer, releaseDate, esrbRating, ignRating);
    }
    FileWriter fw = null;
    BufferedWriter bw = null;

    public void createJsonFile() throws IOException{
            VideoGame vg = new VideoGame(title, developer, releaseDate, esrbRating, ignRating);
            File f = new File("videoGame.json");
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);

            JsonSerializer serializer = new JsonSerializer();
            String json = serializer.serialize(vg);
            FileWriter fw = new FileWriter(f);
            fw.write(json);
            fw.close();

            Scanner s = new Scanner(f);
            s.useDelimiter("\\Z");
            String contents = s.next();
            JsonParser parser = new JsonParser();
            VideoGame cf2 = parser.parse(contents, VideoGame.class);

            System.out.println(cf2);
    }

//
        //System.out.println(cf2);
//    public static void main(String[] args) throws IOException {
//        VideoGame vg = new VideoGame(title, developer, releaseDate, esrbRating, ignRating);
////        vg.title = title;
////        vg.developer = developer;
////        vg.releaseDate = releaseDate;
////        vg.esrbRating = esrbRating;
////        vg.ignRating = ignRating;
//
//        File f = new File("video.json
//");

//        // write json
//        JsonSerializer serializer = new JsonSerializer();
//        String json = serializer.serialize(vg);
//        FileWriter fw = new FileWriter(f);
//        fw.write(json);
//        fw.close();

        // read json
       // Scanner s = new Scanner(f);
       // s.useDelimiter("\\Z");
       // String contents = s.next();
       // JsonParser parser = new JsonParser();
       // CreateFile cf2 = parser.parse(contents, CreateFile.class);
//
        //System.out.println(cf2);
    }
