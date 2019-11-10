package com.interfaces;

interface overideTest {

    /* Can't overide methods of object class inside the interface */

    /* default boolean equals(Object obj) {
        return true;
    } */


    /* Can't overide methods of object class inside the interface */

    /* static boolean equals(Object obj) {

    } */

    boolean equals(Object obj);
}

public class ObjectClassMethods {

    public boolean equals(Object obj) {
        return true;
    }
}
