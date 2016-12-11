package com.theironyard.charlotte;

import java.util.Scanner;

/**
 * Created by emileenmarianayagam on 12/9/16.
 */
public class MasterChef  {


    String personName;
    String name;
    int quantity;
    String ingredients;
    String utensils;


    //String update;


    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
            this.personName = personName;
        }


    /*public void setPersonName(String personName) {
        if (!personName.isEmpty()){
            this.personName = personName;
        }

    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        //if (quantity ==  )
        this.quantity = quantity;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getUtensils() {
        return utensils;
    }

    public void setUtensils(String utensils) {
        this.utensils = utensils;
    }
    @Override
    public String toString(){
        return String.format("%s %s %d %s %s", getPersonName(), getName(), getQuantity(), getIngredients(), getUtensils());
    }

    public void bakery(){

            Scanner scanner = new Scanner(System.in);
            //method that takes in user entered information and stores it into a variable
            System.out.println("what is your name user");
            setPersonName(scanner.nextLine());
            System.out.println("Welcome " + getPersonName() + " to the Emma's Bakery shop -- lets bake ");
            System.out.println("To get started -- lets answer a series of questions");

            System.out.println("what are we going to bake in the shop " + getPersonName());
            setName(scanner.nextLine());

            System.out.println("How many " + getName() + " are we going to make");
            setQuantity(Integer.valueOf(scanner.nextLine()));


            System.out.println(" what are all the ingredients we need to make this " + getName() + " " + getPersonName());
            setIngredients(scanner.nextLine());

            System.out.println("What utensils do we need to make this " + getName() + " " + getPersonName());
            setUtensils(scanner.nextLine());

            System.out.println(" Here we go -- " + getPersonName() + " we are already to make some" + getName());
        }
}
