package com.company;

public class Ticket implements TicketInterface {

    double totalCost;


    public Ticket(double totalCost) {
        this.totalCost = totalCost;
    }

    public Ticket() {

    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public void setPrice(double price) {
        
    }

    @Override
    public void printTicket(String showName, String showDate, String showTime, int numSeats, String fName, String lName, String address) {

    }
}
