package org.launchcode;
import java.util.Scanner;

public class GasConsumption {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of miles driven: ");
        Integer miles = input.nextInt();

        System.out.println("Enter the amount of gallons of gas used: ");
        Integer gallons = input.nextInt();

        Integer milesPerGallonInt = miles/gallons;
        String milesPerGallonString = String.valueOf(milesPerGallonInt);
        String phrase = "Your vehicle's MPG: ";

        System.out.println(phrase + milesPerGallonString);

    }
}
