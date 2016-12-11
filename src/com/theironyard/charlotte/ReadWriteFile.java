package com.theironyard.charlotte;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile extends DogRescue {
    public ReadWriteFile(String dog, String size, String gender, String color, String age) {
        super(dog, size, gender, color, age);
    }
    public void newFile() throws IOException {
        try {
            File f = new File("newfile.txt");
            FileWriter fw = new FileWriter(f);
            boolean fvar = f.createNewFile();
            if (fvar){
                System.out.println("File created.");
            }
            else{
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("Fatal error");
        }
    }
}
