package com.company.Whileexample;

import java.util.Scanner;

public class ChoiceMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter one of the following choices");
        System.out.println("c) carnivore\t\tp) pianist");
        System.out.println("t) tree\t\tg) game");
        String userChoice;
        do {
            userChoice = in.nextLine();
            switch (userChoice) {
                case "c":
                    System.out.println("A  lion is a carnivore");
                    break;
                case "p":
                    System.out.println("Debussy is a pianist");
                    break;
                case "t":
                    System.out.println("A maple is a tree");
                    break;
                case "g":
                    System.out.println("GTA is a game");
                default:
                    System.out.println("Please enter a,c,p,t or g ");


            }
        }while (!userChoice.equals("c"));

    }
}
