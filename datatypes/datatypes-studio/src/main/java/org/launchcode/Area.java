package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a circle radius: ");

        Double radius = input.nextDouble();
//        Double areaCalculated = 3.14*radius*radius;
        Double areaCalculated = Circle.getArea(radius);

        String areaString = String.valueOf(areaCalculated);

        System.out.println("The area of a circle with the radius of "+radius+" is "+areaString+".");


    }
}
