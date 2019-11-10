package com.interfaces;

interface A {

    default void show() {
        System.out.println("A");
    }

    static void test() {
        System.out.println("Static A");
    }
}

interface B {

    default void show() {
        System.out.println("B");
    }

    static void test() {
        System.out.println("Static B");
    }
}

public class DiamondProblem implements A,B {

     /* Must overide show here to avoid diamond problem of default method*/
     public void show() {
        System.out.println("C");
    }

    public static void main(String[] args) {

        A a = new DiamondProblem();

        a.show();

        /* a.test(); --> throws error in java 8 */
        A.test();

    }
}
