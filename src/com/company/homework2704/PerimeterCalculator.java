package com.company.homework2704;

import java.util.Scanner;

public class PerimeterCalculator {
public static double calculate (int triangleEdge1,int triangleEdge2,int triangleEdge3){
    return (triangleEdge1 + triangleEdge2 + triangleEdge3);
}
public static double calculate (int lengthOfSide) {
    return (lengthOfSide * 4);
}
    public static double calculate (int rectangleLength,int rectangleLength1){
    return ((rectangleLength + rectangleLength1) * 2 );
    }
public static double calculate (int quadrilateral1,int quadrilateral2,int quadrilateral3,int quadrilateral4){
    return (quadrilateral1 + quadrilateral2 + quadrilateral3 + quadrilateral4);

}
public static double calculate(double radius ){
    return (2* Math.PI* radius);
}
}
