package com.company.homework0204;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input the speed of the vehicle(in m/h)");
        int speedofvehicle = in.nextInt();
        System.out.println("Please input the number of hours it traveled");
        int numberofhours = in.nextInt();
        int i = 0;

        for (i = 1; i <= numberofhours; i++) {
            System.out.println();
        }
    }
}
