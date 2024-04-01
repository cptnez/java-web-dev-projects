package org.launchcode;
import java.util.Scanner;
public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a length for the rectangle: ");

        Integer rectangleLong = input.nextInt();

        System.out.println("Please enter a width for the rectangle: ");

        Integer rectangleWidth = input.nextInt();

        Integer rectangleArea = rectangleLong*rectangleWidth;

        String recLong = String.valueOf(rectangleLong);
        String recWidth = String.valueOf(rectangleWidth);
        String statement = " x ";
        String recArea = recLong.concat(statement).concat(recWidth);

        System.out.println(recArea);






    }
}
