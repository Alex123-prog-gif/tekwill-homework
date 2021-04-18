package com.company.Whileexample;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the starting mile");
        int start = keyboard.nextInt();
        System.out.println("Enter the ending mile: ");
        int end = keyboard.nextInt();
        System.out.println();

        while (start<=end) {
            double km = start * 1609;
            System.out.println("miles: " + (start) + " , " + "kilometers :" + (km));
            start += 1;
        }
            System.out.println();
            do {
                double km = start * 1.609;
                start +=1;
                System.out.println("miles:" + (start) + "," + "kilometers :" + (km) );
            } while (start<=end);
            for (int s=start;s<= end;s++){
                double km = start * 1.609;
                System.out.println("miles: " + ", " + "kilometers: " + (km));


        }



    }
}
