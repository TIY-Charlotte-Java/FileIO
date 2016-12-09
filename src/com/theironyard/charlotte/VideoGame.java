package com.theironyard.charlotte;

import jodd.json.JsonParser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
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
    //static CreateFile cf = new CreateFile(title, developer, releaseDate, esrbRating, ignRating);
    static CreateJsonFile cf = new CreateJsonFile(title, developer, releaseDate,esrbRating, ignRating);
    static CreateFile df = new CreateFile(title, developer, releaseDate,esrbRating, ignRating);

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

    public VideoGame() {
    }


    public VideoGame(String title, String developer, String releaseDate, String esrbRating, String ignRating) {
        this.title = title;
        this.developer = developer;
        this.releaseDate = releaseDate;
        this.esrbRating = esrbRating;
        this.ignRating = ignRating;
    }

    public static void main(String[] args) throws IOException{

        String selectChoice;

        File f = new File("videoGame.json");
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        JsonParser parser = new JsonParser();
        VideoGame cf2 = parser.parse(contents, VideoGame.class);

        System.out.println(cf2);

        System.out.printf("Title: %s \nDeveloper: %s \nRelease Date: %s \nESRB Rating: %s \nIGN Rating: %s\n", title, developer, releaseDate, esrbRating, ignRating);

        System.out.println("Do you wish to edit this infromation? select y/n");
        selectChoice = scanner.nextLine();

        if (selectChoice.equals("y")) {
            System.out.println("Let's add information about the video game");

            System.out.println("To start, what is the title?");
            title = scanner.nextLine();

            System.out.println("Next, add the name of the developer or studio");
            developer = scanner.nextLine();

            System.out.println("Now add the release date in the format of January 2, 2016.");
            releaseDate = scanner.nextLine();

            System.out.println("Great! Now add the ESRB rating.");
            esrbRating = scanner.nextLine();

            System.out.println("Finally, add the IGN rating so we know how cool the game is.");
            ignRating = scanner.nextLine();

            cf.createJsonFile();
            df.createFile();
        } else if (selectChoice.equals("n")) {
            System.out.println("Good bye");
            System.exit(0);
        }
    }
    /*
    done - Answer Questions about the product.
    done - Title
    done - Developer
    done - Release Date
    done - Rating(ESRB) (valid ratings are: EC, E, E10+, T, M, AO, RP)
    done - Rating(IGN) (Valid ratings are: 1 - 10)
    done - save information to a file (See above to create file)
    done - make file created a json object file
    give user ability to update file and resave (I think this is where the FileWriter() comes in. FileWriter(f, true)
    keeps adding to the file without overwriting
    create error for json parsing fail instead of crashing the program
    */

}
