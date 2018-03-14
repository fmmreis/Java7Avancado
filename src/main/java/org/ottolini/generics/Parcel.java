package org.ottolini.generics;

public class Parcel<T> {
    private T t;

    public Parcel(){}

    public Parcel(T t){
        this.t = t;
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static <T> boolean isEqual(Parcel<T> p1, Parcel<T> p2){
        return p1.get().equals(p2.get());
    }
}
