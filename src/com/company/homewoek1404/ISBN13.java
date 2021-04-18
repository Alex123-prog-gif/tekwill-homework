package com.company.homewoek1404;

import java.util.Scanner;

public class ISBN13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        Integer converter = Integer.valueOf(a);
        int sum = 0;
        while (converter != 0 ){
            int devider = 10;
             sum =  sum + converter % devider;
            converter = converter / 10;

        }
        int d13 = 10 - sum % 20;
        a += d13;
        System.out.println(a);
    }
}
