package com.company;

import com.company.TicketSystemInterfaces;

public class SystemOutput implements TicketSystemInterfaces {

    private String name;

    public SystemOutput(String name) {
        this.name = name;
    }

    public SystemOutput() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void type(String letter) {
        for(int i = 0; i < letter.length(); i++) {
            java.lang.System.out.print(letter.charAt(i));
            try {
                Thread.sleep(20);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
