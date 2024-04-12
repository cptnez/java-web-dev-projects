package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

//CLASS-sets the blueprint for instances of new OBJECTS
public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private LocalDate dateAdded;
    private int itemId;

    //CONSTRUCTOR-used to initialize a new instance of a class (OBJECT)
    public MenuItem(String name, Double price, String description, String category, int itemId) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = LocalDate.now();
        this.itemId = itemId;
    }

    //GETTERS AND SETTERS-these are used because the fields are private and not public

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public int getItemId() {
        return itemId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    //NEW toString method-default method is insufficient
    @Override
    public String toString() {
        String newText = isNew() ? " - NEW!" : "";
        return name + newText + "\n" +
                description + " | $" + price;
    }
//isNew method-checks to see if items have been added within 90 days
    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }

}
