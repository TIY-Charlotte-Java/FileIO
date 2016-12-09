package com.theironyard.charlotte;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        // write your code here
        MasterChef chef = new MasterChef();
        chef.bakery();
        File f = new File("service.json");
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(chef);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        Scanner scanner = new Scanner(f);
        scanner.useDelimiter("\\Z");
        String content = scanner.next();
        JsonParser parser = new JsonParser();
        MasterChef baker2 = parser.parse(content,MasterChef.class);

        System.out.println(baker2);



    }

}







