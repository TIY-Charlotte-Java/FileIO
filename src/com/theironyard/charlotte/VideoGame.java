package com.theironyard.charlotte;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Ben on 12/9/16.
 */
public class VideoGame {

    static String title;
    static String developer;
    static String releaseDate;
    static String esrbRating;
    static String ignRating;
    private static Scanner scanner = new Scanner(System.in);
    static CreateFile cf = new CreateFile(title, developer, releaseDate, esrbRating, ignRating);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getEsrbRating() {
        return esrbRating;
    }

    public void setEsrbRating(String esrbRating) {
        this.esrbRating = esrbRating;
    }

    public String getIgnRating() {
        return ignRating;
    }

    public void setIgnRating(String ignRating) {
        this.ignRating = ignRating;
    }

    public VideoGame(String title, String developer, String releaseDate, String esrbRating, String ignRating) {
        this.title = title;
        this.developer = developer;
        this.releaseDate = releaseDate;
        this.esrbRating = esrbRating;
        this.ignRating = ignRating;
    }

    public static void main(String[] args) throws IOException{

        System.out.println("Let's add information about the video game");

        System.out.println("To start, what is the title?");
        title = scanner.nextLine();

        System.out.println("Next, add the name of the developer or studio");
        developer = scanner.nextLine();

        System.out.println("Now add the release date");
        releaseDate = scanner.nextLine();

        System.out.println("Great! Now add the ESRB rating.");
        esrbRating = scanner.nextLine();

        System.out.println("Finally, add the IGN rating so we know how cool the game is.");
        ignRating = scanner.nextLine();

        cf.createFile();
    }
    /*
    Answer Questions about the product.
    Title
    Developer
    Release Date
    Rating(ESRB) (valid ratings are: EC, E, E10+, T, M, AO, RP)
    Rating(IGN) (Valid ratings are: 1 - 10)
    save information to a file (See above to create file)
    make file created a json object file
    give user ability to update file and resave (I think this is where the FileWriter() comes in. FileWriter(f, true)
    keeps adding to the file without overwriting
    create error for json parsing fail instead of crashing the program
    */

}
