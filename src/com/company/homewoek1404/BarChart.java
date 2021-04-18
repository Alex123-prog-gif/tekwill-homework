package com.company.homewoek1404;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum1 = scanner.nextInt();
        int sum2 = scanner.nextInt();
        int sum3 = scanner.nextInt();
        int sum4 = scanner.nextInt();
        int sum5 = scanner.nextInt();
        int[]totalSum ={sum1,sum2,sum3,sum4,sum5};
        for (int i = 0;i < totalSum.length;i++){
            char assterisk = '*';
            int totalStars = totalSum[i]/100;
            for (int j = 0;j < totalStars;j++){
                System.out.print(assterisk);
            }
            System.out.println();
        }
    }
}
