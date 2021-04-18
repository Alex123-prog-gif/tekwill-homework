package com.company.homework0804;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        //                      0 1 2 3 4 5
//        int array[] = new int[]{1,2,1,4,1,2};
        System.out.println("Please input the array size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int j = 0; j < array.length; j++) {
            System.out.println("please input element " + j);
            array[j] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));
        //0 1 2 3 4 5
        //1,2,1,4,1,2
        int countOfDuplicated = 0;
        for (int w = 0; w < array.length; w++) {
            for (int x = w + 1; x < array.length; x++) { // w = 0, x =0, 1, 2, 3, 4; w=1 , x = 1 2 3 4
                if (array[w] == array[x]) {
                    countOfDuplicated++;
                    break;
                }
            }
        }

        System.out.println("Total duplicates " + countOfDuplicated);

        /*a) */
        int[] f = new int[6];
        System.out.println(f[5]);

        int[]g = new int[5];
        g[0] = 8;
        System.out.println(g);

//        for (int i = 0;i < array.length;i++){
//            System.out.print(array[i] + " ");
//        }


    }
}





