package com.company.homework2704;

import java.util.Random;
import java.util.Scanner;


public class AverageCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first triangle edge " );
        int triangleEdge1 = in.nextInt();
        System.out.println("Enter second triangle edge " );
        int triangleEdge2 = in.nextInt();
        System.out.println("Enter third triangle edge " );
        int triangleEdge3 = in.nextInt();
        System.out.println("Perimeter of triangle " + PerimeterCalculator.calculate(triangleEdge1,triangleEdge2,triangleEdge3));

        System.out.println("Enter length of side " );
        int lengthOfSide = in.nextInt();
        System.out.println("Perimeter of square " + PerimeterCalculator.calculate(lengthOfSide * 4));

        System.out.println("Enter first rectangle length" );
        int rectangleLength = in.nextInt();
        System.out.println("Enter second rectangle length ");
        int rectangleLength1 = in.nextInt();
        System.out.println("Perimeter of rectangle is  " + PerimeterCalculator.calculate(rectangleLength,rectangleLength1 * 2));

        System.out.println("Enter quadrilateral 1 " );
        int quadrilateral1 = in.nextInt();
        System.out.println("Enter quadrilateral 2 " );
        int quadrilateral2 = in.nextInt();
        System.out.println("Enter quadrilateral 3 " );
        int quadrilateral3 = in.nextInt();
        System.out.println("Enter quadrilateral 4 " );
        int quadrilateral4 = in.nextInt();
        System.out.println("Perimeter of quadrilateral is " + PerimeterCalculator.calculate(quadrilateral1+ quadrilateral2 + quadrilateral3 + quadrilateral4 ));


        System.out.println("Enter circle radius " );
        double radius = in.nextDouble();
        System.out.println("Perimeter of circle is " + PerimeterCalculator.calculate(radius));

    }




    }
