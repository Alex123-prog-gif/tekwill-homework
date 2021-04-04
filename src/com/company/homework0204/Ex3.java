package com.company.homework0204;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Write any numbers");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int usenumber = scanner.nextInt();usenumber != 0;usenumber = scanner.nextInt()   ) {
            sum += usenumber;
        }
        System.out.println("The sum of all integers is : " + sum);
    }
}
