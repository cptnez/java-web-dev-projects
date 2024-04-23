package org.launchcode;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private String discContents;
    private String discType;

    public BaseDisc(String name, int storageCapacity, String discContents, String discType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.discContents = discContents;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getDiscContents() {
        return discContents;
    }

    public void setDiscContents(String discContents) {
        this.discContents = discContents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
    public void displayDisc(){
        System.out.println("Disc Type: " + getDiscType());
        System.out.println("The disc " + "'" + getName() + "'" + " has a storage capacity of " + getStorageCapacity() + " MB" +
                " and contains " + getDiscContents() + ".");
    }
}
