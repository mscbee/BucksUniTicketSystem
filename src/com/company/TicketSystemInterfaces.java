package com.company;

public interface TicketSystemInterfaces {

    void type(String letter);

}

interface CustomerInterface {

    void getLogin();

    void getProfileInfo(String fName, String lName, String address);

}

interface ShowInterface {

    void selectShow(String showName, String showDate);

    String selectTime();
}