package com.theironyard.charlotte;

import java.util.Scanner;

public class DogRescue {
    static String dog;
    static String size;
    static String gender;
    static String color;
    static String age;

    //constructor
    public DogRescue(String dog, String size, String gender, String color, String age) {
        this.dog = dog;
        this.size = size;
        this.gender = gender;
        this.color = color;
        this.age = age;
    }

    //getters and setters
    public String getDog() {
        return dog;
    }

    public void setDog(String animal) {
        this.dog = animal;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public void customizeAnimal() {

    }
    private static Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Online Dog Rescue.\nBecause paying for a dog is dumb.");
        System.out.println("What kind of dog would you like to rescue?");
        dog = Scanner.nextLine();

        System.out.println("Please specify the age range.");
        age = Scanner.nextLine();

        System.out.println("Is there a particular size you would like to rescue? If so plz specify.");
        size = Scanner.nextLine();

        System.out.println("Do you have a preference as to the gender?");
        gender = Scanner.nextLine();

        System.out.println("What color dog would you like?");
        color = Scanner.nextLine();
    }
}
