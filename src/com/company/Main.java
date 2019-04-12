package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Customer charlene = new Customer();

        charlene.getLogin();

        charlene.getProfileInfo("Charlene", "Bee", "123 Disneyland");

        System.out.print("\033[H\033[2J");
        System.out.flush();

        Show show = new Show();

        show.selectShow();

        show.selectTime();

    }
}
