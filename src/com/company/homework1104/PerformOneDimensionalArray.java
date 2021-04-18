package com.company.homework1104;

public class PerformOneDimensionalArray {
    public static void main(String[] args) {
        int Array[] = new int[10];
        int bonus[] = new int[15];
        for (int i = 0; i<bonus.length;i++){
            bonus[i] += 1;
        }
        int bestScores[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < bestScores.length; i++) {
            System.out.println("\t" + bestScores[i]);
        }
    }
}
