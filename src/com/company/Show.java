package com.company;

import java.util.Scanner;

public class Show implements ShowInterface {

    private String showName;
    private String showDate;
    private String showTime;

    public Show(String showName, String showDate, String showTime) {
        this.showName = showName;
        this.showDate = showDate;
        this.showTime = showTime;
    }

    public Show() {

    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    @Override
    public void selectShow() {
        Scanner in = new Scanner(System.in);
        SystemOutput systemOutput = new SystemOutput();

        try {
            Thread.sleep(300);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        systemOutput.type("SELECT AN UPCOMING SHOW:\n");
        systemOutput.type("1. Star Wars: The Musical (20/05/2013)\n2. Les Miserables (21/05/2013)\n3. The Phantom of the Opera (22/05/2013)\n ");

        char ch = in.next().charAt(0);

        while(ch != '1' || ch != '2' || ch != '3') {
            systemOutput.type("Please enter a valid show number");
        }

        switch(ch)
        {
            case('1'):
                this.showName = "Star Wars: The Musical";
                this.showDate = "20/05/2013";
                break;
            case('2'):
                this.showName = "Les Miserables";
                this.showDate = "21/05/2013";
                break;
            case('3'):
                this.showName = "The Phantom of the Opera";
                this.showDate = "22/05/2013";
                break;
        }
    }

    @Override
    public void selectTime() {
        Scanner in = new Scanner(System.in);
        SystemOutput systemOutput = new SystemOutput();

        try {
            Thread.sleep(300);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        systemOutput.type("SELECT AN AVAILABLE TIME FOR THE PERFORMANCE:\n");
        systemOutput.type("1. 1pm\n 2. 7pm\n");

        char ch = in.next().charAt(0);

        while(ch != '1' || ch != '2') {
            systemOutput.type("Please choose an available start time");
        }

        switch(ch)
        {
            case('1'):
                this.showTime = "1pm";
                break;
            case('2'):
                this.showTime = "7pm";
                break;
        }
    }
}
