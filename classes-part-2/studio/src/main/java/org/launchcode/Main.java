package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem itemOne = new MenuItem("Hot Dog", 2.99, "It's a tasty dot hog!",
                "Main Course", 1);
        MenuItem itemTwo = new MenuItem("Corn Nuggets", .99, "Just the way momma made them!",
                "Side", 2);
        MenuItem itemThree = new MenuItem("Ice Cream", .99, "It's icy AND creamy!",
                "Dessert", 3);
        MenuItem itemFour = new MenuItem("Chicken Sandwich", 3.99, "It's chicken...on a sandwich!",
                "Main Course", 3);

        Menu menu = new Menu();

        menu.addItem(itemOne);
        menu.addItem(itemTwo);
        menu.addItem(itemFour);
//
//        menu.removeItem(itemTwo);
//
        System.out.println(menu);

        menu.addItem(itemThree);

        System.out.println(menu);


    }
}
