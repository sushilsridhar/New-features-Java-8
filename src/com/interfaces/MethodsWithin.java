package com.interfaces;

interface Phone {

    void call();

    default void message() {
        System.out.println("sent");
    }

    static void connectToNetwork() {
        System.out.println("connect to network");
    }
}


class Iphone implements Phone {
    public void call() {
        System.out.println("Hello World");
    }
}

public class MethodsWithin {

    public static void main(String[] args) {
        Phone phone = new Iphone();
        phone.call();
        phone.message();

        /* can't call static method with object variable */
        // phone.connectToNetwork();
    }
}
