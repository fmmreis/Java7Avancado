package org.ottolini.generics;

public class TestParcel {

    public static void main(String[] args) {

        Parcel<String> parcelString = new Parcel<>();
        parcelString.set("Test String...");
        String parStr = parcelString.get();
        System.out.println(parStr);

        Parcel<Integer> parcelInteger = new Parcel<>();
        parcelInteger.set(10);
        Integer parInt = parcelInteger.get();
        System.out.println(parInt);

        Parcel p1 = new Parcel("AAA");
        Parcel p2 = new Parcel("AAA");
        boolean isEqual = Parcel.isEqual(p1, p2);
        System.out.println(isEqual);
    }
}
