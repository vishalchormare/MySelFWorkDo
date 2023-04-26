package com.bridgelabz.oops;


public class Polymorphism4 {

    void m1() {
        System.out.println("m1()");
    }

    int m1(int x) {
        System.out.println("m1(int) => " + x);
        return x;
    }

    static void m1(float x) {
        System.out.println("m1(float) => " + x);
    }

    // 'return type' of methods does not play a role while overloading.
    // static and non-static does not play a role while overloading.
    // we can take any return type while overloading methods.
    // static and non-static methods can be overloaded

    public static void main(String[] args) {
        Polymorphism4 obj1 = new Polymorphism4();
        obj1.m1();
        obj1.m1(3);
        m1(5.4F);
    }
}
