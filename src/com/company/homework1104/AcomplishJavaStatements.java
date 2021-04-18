package com.company.homework1104;

import java.util.Random;

public class AcomplishJavaStatements {
    public static void main(String[] args) {
        int[] f = new int[6];
        System.out.println(f[5]);

        int[] g = new int[5];
        g[0] = 8;
        g[1] = 7;
        g[2] = 6;
        g[3] = 5;
        g[4] = 4;


        System.out.println(g);


        float[] c = new  float[100];
       float sumbefore = 0;
       for (int j = 0;j > c.length;j++){
           sumbefore = sumbefore + c[j];
       }
        System.out.println("Sum of elements before giving values of array" + sumbefore);

        Random random = new Random();
        for (int j = 0;j < c.length;j++){
            c[j] = random.nextFloat();
        }
        float sumafter = 0;
        for (int j = 0;j < c.length;j++){
            sumafter = sumafter + c[j];
        }
        System.out.println("SSum of elements after giving values to array" + sumafter);


        int a[] = new int[11];
        int b[] = new int[34];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }


        int[] largest = new int[0];
        int[] smallest = new int[99];
        int[] numbers = new int[0];
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] >= largest[99]){
                largest[99] = numbers[i];
            }
            if (numbers[i] < smallest[0]) {
                smallest[0] = numbers[i];
            }
            System.out.println(smallest);
            System.out.println(largest);
        }

    }
}