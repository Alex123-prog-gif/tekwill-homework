package com.company.homework0304;

public class PatternExample {
    public static void main(String[] args) {
        for (int row = 1; row <= 6;++row){
            for (int column = 1; column <= row;++column){
                System.out.print(column + " " );
            }
            System.out.println();
        }
        for (int row = 1; row <= 6; ++row){
            for (int column = 1;column<= 6- row; ++ column){
                System.out.println(" ");

            }
            for (int column = row;column >0;--column){
                System.out.println(column + " ");
            }
            System.out.println();
        }
    }
}
