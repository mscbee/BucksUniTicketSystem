package com.company;

import java.io.Console;
import java.util.Scanner;

public class Customer implements CustomerInterface {
    private String fName;
    private String lName;
    private String address;

    public Customer(String fName, String lName, String address) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
    }

    public Customer() {

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public void getLogin() {

        Scanner in = new Scanner(System.in);
        SystemOutput systemOutput = new SystemOutput();

        Console console = System.console();

        systemOutput.type("LOG IN \nWelcome to the Bucks Centre for the Performing Arts ticket purchasing system!\n" );
        systemOutput.type("Please log in\n");
        systemOutput.type("Enter username:\n");

        String username = in.nextLine();

        while(username.length() > 10 ) {
            systemOutput.type("Your username should be no more than 10 characters long.\n");
            systemOutput.type("Please re-enter your username\n");
            username = in.nextLine();
        }

        systemOutput.type("Enter password:\n");

        String password = in.nextLine();

        while(password.length() > 10 ) {
            systemOutput.type("Your password should be no more than 10 characters long.\n");
            systemOutput.type("Please re-enter your password\n");
            password = in.nextLine();

        }
    }

    public void getProfileInfo(String fName, String lName, String address) {

        System.out.println("Name: " + fName + " " + lName + "\n");
        System.out.println("Address: " + address + "\n");

    }
}
