package com.company.homework0304;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int d = 2;
        int e = 3;
        int f = 5;
        int g = 8;
        int h = 13;
        int r = 21;
        int w = 34;
        System.out.println(a + " ");
        System.out.println(b + " ");
        for (int i = 0;i<n-2;i++);
        int c = a + b;
        System.out.println(c+ " ");
        a=b;
        b=c;
        System.out.println(d + " ");
        System.out.println(e + " ");
        System.out.println(f + " ");
        System.out.println(g + " ");
        System.out.println(h + " ");
        System.out.println(r + " ");
        System.out.println(w + " ");


    }
}
