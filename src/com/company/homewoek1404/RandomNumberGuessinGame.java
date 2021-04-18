package com.company.homewoek1404;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessinGame {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = 0;
        int b = random.nextInt();
        boolean o = true;
        while (o ){
            a = scanner.nextInt();
            if (b>a){
                System.out.println("Too low try again");

            }
            if (b<a){
                System.out.println("Too high try again");

            }
            if (b == a){
                System.out.println("You guessed the number");
                o = false;
            }
        }
    }
}
