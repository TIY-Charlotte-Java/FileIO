package com.theironyard.charlotte;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Ben on 12/9/16.
 */
public class CreateFile extends VideoGame{
    public CreateFile(String title, String developer, String releaseDate, String esrbRating, String ignRating) {
        super(title, developer, releaseDate, esrbRating, ignRating);

    }
    FileWriter fw = null;
    BufferedWriter bw = null;
    private static Scanner scanner = new Scanner(System.in);

    public void createFile() throws IOException {
        try {
            File f = new File("ProductInfo.txt");
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            bw.write(title + "\n" + developer + "\n" + releaseDate + "\n" + esrbRating + "\n" + ignRating);

            System.out.println("Data saved!");
        } catch(IOException e) {
            System.out.println("Encountered an IO Exception");
        } finally {
            try {
                bw.close();
                fw.close();
            }catch(IOException e){}
        }
    }
//    public static void main(String[] args) throws IOException {
//        File f = new File("ProductInfo.txt");
//        FileWriter fw = new FileWriter(f);
//        //fw.write("Alice\n"); // overwrites file
//        //fw.append("Bob\n");
//        //fw.append("Charlie\n");
//        //fw.close();
//        fw.write()
//
//        // read line-by-line
//        while (scanner.hasNext()) { //while scanner has another line, do this next part
//            System.out.println(scanner.nextLine());
//        }
//
//        // read entire file
//        scanner = new Scanner(f);
//        scanner.useDelimiter("\\Z");
//        String contents = scanner.next();
//        System.out.println(contents);
//    }
}
