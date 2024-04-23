package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String name, int storageCapacity, String discContents, String discType) {
        super(name, storageCapacity, discContents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD speed is" + getStorageCapacity() * 10.6);
    }

    @Override
    public void storeData() {

    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
