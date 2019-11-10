package com.interfaces;

interface lowPriority {

    default void show() {
        System.out.println("test");
    }
}

class HighPriority {

    public void show() {
        System.out.println("Class is superior than interface");
    }
}

public class ThirdRules extends HighPriority implements lowPriority {

    public static void main(String[] args) {
        ThirdRules rules = new ThirdRules();

        /* Always call the method in class, because of a concept called Third Rules */
        rules.show();
    }
}
