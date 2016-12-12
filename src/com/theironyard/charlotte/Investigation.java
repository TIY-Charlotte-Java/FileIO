package com.theironyard.charlotte;

import javafx.beans.binding.When;

import java.util.Scanner;

/**
 * Created by graceconnelly on 12/8/16.
 */
public class Investigation {
    private String who;
    private String what;
    private String when;
    private String where;
    private String why;
    private String How;

    @Override
    public String toString() {
        return String.format("Yowza!\n%s\n%s\n%s\n%s\n%s\n%s\n", getWho(), getWhat(), getWhen(), getWhere(), getWhy(), getHow());
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {

        if (!who.equals("")){
            this.who = who;
        }
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {

        if(!what.equals("")){
            this.what = what;}
        }


    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {

        if(!when.equals("")){
            this.when = when;
        }
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {

        if (!where.equals("")){
            this.where = where;
        }
    }

    public String getWhy() {return why;}

    public void setWhy(String why) {

        if(!why.equals("")){
            this.why = why;
        }
    }

    public String getHow() {
        return How;
    }

    public void setHow(String how) {

        if(!how.equals("")) {
            How = how;
        }
    }

    public void questionProcess(Scanner scanner) {
        System.out.printf("Hi Detective! Lets get this case figured out using the five Ws and H\n" +
                "Who does this case concern?\n");
        setWho(scanner.nextLine());
        System.out.printf("Woah! What did %s do?\n",getWho());
        setWhat(scanner.nextLine());
        System.out.printf("Well then! When did %s %s?\n",getWho(),getWhat());
        setWhen(scanner.nextLine());
        System.out.printf("Where did %s %s %s\n",getWho(),getWhat(),getWhen());
        setWhere(scanner.nextLine());
        System.out.printf("Why in the world did %s %s %s %s\n", getWho(), getWhat(), getWhen(), getWhere());
        setWhy(scanner.nextLine());
        System.out.printf("How did %s %s %s %s %s\n", getWho(), getWhat(), getWhen(), getWhere(), getWhy());
        setHow(scanner.nextLine());
        System.out.printf("Yowza!\n%s\n%s\n%s\n%s\n%s\n%s\n", getWho(), getWhat(), getWhen(), getWhere(), getWhy(), getHow());
    }
}

