package com.company.homewoek1404;

import java.util.Scanner;

public class Upercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String a = scanner.nextLine();
int upperCase = 0;
for (int i = 0;i<a.length();i++){
    char h = a.charAt(i);
    if (h >= 'A' && h <='Z'  ){
        upperCase += 1;
    }
}
        System.out.println( upperCase);
    }
}
