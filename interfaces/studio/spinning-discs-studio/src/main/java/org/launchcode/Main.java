package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
CD cd = new CD("A Love Supreme", 700, "Music", "CD" );
DVD dvd = new DVD("Speed", 4700, "Film", "DVD");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.displayDisc();
        dvd.displayDisc();
    }
}