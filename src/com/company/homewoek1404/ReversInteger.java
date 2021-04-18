package com.company.homewoek1404;

public class ReversInteger {
    public static void main(String[] args) {
StringBuilder a = new StringBuilder("12345");
        System.out.println(a.reverse());
       int b = 12345;
       int reverse = 0;
       while (b != 0){
           int reminder = b % 10;
           reverse = reverse * 10 + reminder;
           b = b / 10;
       }
        System.out.println(reverse);
    }
}
