package com.company.homework2004;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

        private static final Random RANDOM = new Random();
        private static final  String ROCK = "Rock";
        private static final String PAPER = "Paper";
        private static final String SCISSORS = "Scissors";
        private static final String UNKNOWN = "unknown";
        private static final String USER = "user";
        private static final String COMPUTER = "computer";

    public static void main(String[] args) {
        String computerChoice;
        String userChoice;

        do {
            computerChoice = getComputerChoice();
            userChoice = getUserChoice();

            System.out.println("Computer choice is >>" + computerChoice);

            if (computerChoice.equalsIgnoreCase(userChoice)){
                System.out.println("Its a tie! Lets try again!");
            }else {
                String winner = getWinner(computerChoice, userChoice);
                System.out.println("The winner is " + winner + "! Congrats");

            }
        }while (computerChoice.equalsIgnoreCase(userChoice));
    }
private static String getComputerChoice() {
        switch (RANDOM.nextInt(3) + 1){
            case 1:
                return ROCK;
            case 2:
                return PAPER;
            case 3:
                return SCISSORS;
            default:
                return UNKNOWN;
        }
}

    private static String getUserChoice(){
        Scanner in = new Scanner(System.in);
        String userChoice = UNKNOWN;
        boolean isNotCorrectValue = true;

        while (isNotCorrectValue){
            System.out.println("Please select an option between:rock,paper,scissors");
            userChoice = in.nextLine();
            if (userChoice.equalsIgnoreCase(ROCK) || userChoice.equalsIgnoreCase(PAPER) || userChoice.equalsIgnoreCase(SCISSORS)){
                isNotCorrectValue = false;
            }
        }
        return userChoice;
    }
    private static String getWinner(String computerRockPaperScissors,String userRockPaperScissors){
        if (computerRockPaperScissors.equalsIgnoreCase(ROCK)){
            if (userRockPaperScissors.equalsIgnoreCase(PAPER)){
                return USER;
            }   else {
                return COMPUTER;
            }
        }else if (computerRockPaperScissors.equalsIgnoreCase(PAPER)){
            if (userRockPaperScissors.equalsIgnoreCase(SCISSORS)){
                return USER;
            }else {
                return COMPUTER;
            }
        }else if (computerRockPaperScissors.equalsIgnoreCase(SCISSORS)){
            if (userRockPaperScissors.equalsIgnoreCase(ROCK)){
                return USER;
            }else if (userRockPaperScissors.equalsIgnoreCase(PAPER)){
                return COMPUTER;
            }
        }
        return UNKNOWN;
    }
}