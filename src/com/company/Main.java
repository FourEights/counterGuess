package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] usableColours = {"red", "orange", "yellow", "green", "blue", "purple", "black", "white"};

        ArrayList<String> randomColours = new ArrayList<String>();

        Scanner colourInputDetect = new Scanner(System.in);

        Random colourRandomiser = new Random();
        for (int i = 0; i < 8; i++) {
            String colourGenerator = usableColours[colourRandomiser.nextInt(usableColours.length)];
            randomColours.add(colourGenerator);

        }

        int points = 0;

        System.out.print("Welcome to the game, ");
        System.out.print( System.getProperty("user.name") );
        System.out.print(".\n\n");
        System.out.println("In this game, you will be guessing colours.");
        System.out.println("An unseen list of ten colours has been generated, in random order.");
        System.out.println("Numbers can appear more than once. Below are the numbers you can choose from");
        System.out.println(" -> [red, orange, yellow, green, blue, purple, black, white] <-\n");
        System.out.println("==================================================================================\n");

        for (int i = 0; i < 8; i++) {
            System.out.println("Guess a colour.");
            String colourInput = colourInputDetect.next();
            if(colourInput == randomColours.get(i));{
                System.out.println("Correct!");
            }
        }


    }

}