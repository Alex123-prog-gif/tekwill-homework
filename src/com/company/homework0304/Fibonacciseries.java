package com.company.homework0304;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int numberOfTerms = sc.nextInt();
        int current = 0,beforeCurrent= 1,nextTerm;
        for (int i = 1;i<= numberOfTerms;++i){
            System.out.println(current + " ,");
            nextTerm = current + beforeCurrent;
            beforeCurrent = current;
            current = nextTerm;
        }



    }
}
