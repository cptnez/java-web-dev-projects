package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }
package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    public ArrayList<MenuItem> MenuItems = new ArrayList<>();
    //Date may need updated
    public LocalDate lastUpdated;

//CONSTRUCTOR
public Menu (ArrayList<MenuItem> MenuItems, LocalDate lastUpdated){
    this.MenuItems = MenuItems;
    this.lastUpdated = lastUpdated;
}

    public Menu() {

    }

    //Getter and Setters
    public ArrayList<MenuItem> getMenuItems() {
        return MenuItems;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        MenuItems = menuItems;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    //toString method-Converts info from each MenuItem into an easily readable string. Utilizes STRINGBUILDER class.
    @Override
    public String toString(){
        StringBuilder mainCourse = new StringBuilder();
        for (MenuItem item : MenuItems) {
            if(item.getCategory().equals("Main Course")){
                mainCourse.append("\n").append(item.toString()).append("\n");
            }
        }StringBuilder sideCourse = new StringBuilder();
        for (MenuItem item : MenuItems) {
            if (item.getCategory().equals("Side")){
                sideCourse.append(("\n")).append(item.toString()).append("\n");
            }
        }StringBuilder dessertCourse = new StringBuilder();
        for (MenuItem item : MenuItems) {
            if (item.getCategory().equals("Dessert")){
                dessertCourse.append(("\n")).append(item.toString()).append("\n");
            }
        }
        StringBuilder menuUpdated = new StringBuilder();
        for (MenuItem item : MenuItems){
            if (item.isNew()) {
                menuUpdated.append(("\n")).append(item.toString()).append("\n");
            }
        }
        return "\nGRANT'S TASTY FOOD JOINT\n" +
                "MAIN COURSES" + "\n" + mainCourse.toString() +
                "SIDES" + "\n" + sideCourse.toString() +
                "DESSERTS" + "\n" + dessertCourse.toString();
    }

    void addItem(MenuItem newItem) {
//        for (MenuItem item : MenuItems) {
//            if (item.getItemId() == newItem.getItemId()) {
//                System.out.println("Item is already on the menu!");
//            } else {
                MenuItems.add(newItem);
                lastUpdated = LocalDate.now();
//            }
//        }
    }

    void removeItem(MenuItem item) {
    MenuItems.remove(item);
    lastUpdated = LocalDate.now();
    }

    void printSingleItem(MenuItem item) {
    MenuItems.contains(item);
        System.out.println(item);
    }


    public boolean itemIdEquals(MenuItem item, MenuItem item2) {

        if (item.getItemId() == item2.getItemId()) {
            System.out.println("DUPLICATE FOUND");
            return true;
        } else {
            System.out.println("No duplicates found");
            return false;
        }
    }

}

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}


