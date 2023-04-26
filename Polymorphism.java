package com.bridgelabz.oops;

// Poly - many
// morph - form
// 2 types
// Compile-time polymorphism - overloading
// Run-time polymorphism - overriding

public class Polymorphism {

    // Method name along with arguments is called method signature.
    // Overloading -> 2 or more methods having same name but different number of arguments or type of arguments.
    void m1() {
        System.out.println("m1()");
    }

    void m1(int x) {
        System.out.println("m1(int) => " + x);
    }

    void m1(float x) {
        System.out.println("m1(float) => " + x);
    }

    void m1(int x, float y) {
        System.out.println("m1(int,float) => " + x + " , " + y);
    }

    void m1(String str) {
        System.out.println("m1(String) => " + str);
    }


    public static void main(String[] args) {

        Polymorphism obj = new Polymorphism();
        obj.m1();
        obj.m1(4);
        obj.m1(4.5F);
        obj.m1(3, 5.6F);
        obj.m1("ABC");

    }
}
