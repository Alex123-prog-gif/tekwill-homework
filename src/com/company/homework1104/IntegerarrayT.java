package com.company.homework1104;

import java.util.Scanner;

public class IntegerarrayT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallestNumber= 0;

        int[][] t;
        t = new int[][]{{1, 2, 3}, {4, 5, 6}};
        System.out.println("Number of rows is " + t.length);
        System.out.println("Number of columns is " + t[0].length);
        // t[2][3] = {([0][0],[0][1],[0][2],([1][0],[1][1],[1][2])}
        System.out.println("Number of elements is " + (t[0].length + t[1].length));
        System.out.println("Elements of row 1 are " + t[0][0] + " " + t[0][1] + " " + t[0][2]);
        System.out.println("Elements of 2 column is " + t[0][1] + " " + t[1][1]);
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.println(t[i][j]);
            }
        }
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = scanner.nextInt();

            }

        }
        smallestNumber=t[0][0];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if(smallestNumber>t[i][j]){
                    smallestNumber=t[i][j];
                }

            }
        }
        System.out.println("The smallest number is " +smallestNumber);
        System.out.printf("Elements of row 1 are %d, %d. %d",t[0][0],t[0][1],t[0][2] );
        int sumOfThirdColumn=t[0][2] + t[1][2];
        System.out.println("The sym of the third column is " + sumOfThirdColumn);
        System.out.println("| "+t[0][0]+" "+t[0][1]+" "+t[0][2]+" |");
        System.out.println("| "+t[1][0]+" "+t[1][1]+" "+t[1][2]+" |");

    }
}


