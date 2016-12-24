package com.theironyard.charlotte;


import java.util.Scanner;

/**
 * Created by kelseynewman on 12/9/16.
 */
public class Album {
    private String albumName;
    private String artistName;
    private String favoriteSong;
    private String whatFeels;
    private String whereHeard;

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(String favoriteSong) {
        this.favoriteSong = favoriteSong;
    }

    public String getWhatFeels() {
        return whatFeels;
    }

    public void setWhatFeels(String whatFeels) {
        this.whatFeels = whatFeels;
    }

    public String getWhereHeard() {
        return whereHeard;
    }

    public void setWhereHeard(String whereHeard) {
        this.whereHeard = whereHeard;
    }

    Scanner scanner = new Scanner(System.in);


    public void album() {

        System.out.println("What is the name of the album?");
        setAlbumName(scanner.nextLine());

        System.out.println("What is the name of the artist that released the album?");
        setArtistName(scanner.nextLine());

        System.out.println("what is your favorite song on the album?");
        setFavoriteSong(scanner.nextLine());

        System.out.println("What kind of feels do you get from this album?");
        setWhatFeels(scanner.nextLine());

        System.out.println("Where/when did you first hear the song that led you to get the album?");
        setWhereHeard(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Album name: " + getAlbumName() + "\n "
                + "Artist name: " + getArtistName() + "\n "
                + "Favorite song: " + getFavoriteSong() + "\n "
                + "What feels: " + getWhatFeels() + "\n "
                + "Where heard: " + getWhereHeard();
    }
}
