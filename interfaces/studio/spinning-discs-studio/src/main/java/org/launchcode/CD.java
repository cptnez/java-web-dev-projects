package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String name, int storageCapacity, String discContents, String discType) {
        super(name, storageCapacity, discContents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("CD speed is" + getStorageCapacity()*1.4);
    }

    @Override
    public void storeData() {
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
