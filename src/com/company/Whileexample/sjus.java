package com.company.Whileexample;

public class sjus {
    public static void main(String[] args) {
        int number = 100;
        int end = 1000;
        int numberPerLine = 0;

        while (number<end){
            if (number % 5 == 0 || number % 6 == 0){
                System.out.println(number + " ");
                numberPerLine++;


                }
                if (numberPerLine == 10){
                    System.out.println();
                    numberPerLine = 0;
                }
                number++;
            }
        }
    }

