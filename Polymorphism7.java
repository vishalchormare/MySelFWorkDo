package com.bridgelabz.oops;

// static method can be inherited
// static method cannot be overridden

// private methods cannot be inherited
class A5 {
    int x;

    void m1() {
        System.out.println("m1 of A5");
    }

    static void m2() {
        System.out.println("m2 of A5");
    }

    private void m4(){
        System.out.println("m4 of A5");
    }
}

class B5 extends A5 {
    int y;

    void m3() {
        System.out.println("m3 of B5");
    }

    @Override
    void m1() {
        System.out.println("m1 of B5");
    }

    static void m2() {
        System.out.println("m2 of B5");
    }

}

public class Polymorphism7 {

    public static void main(String[] args) {

        A5.m2();
        B5.m2();


        A5 obj1 = new A5();
        obj1.m2();
        B5 obj2 = new B5();
        obj2.m2();

        A5 obj3 = new B5();
        obj3.m2();
        // Method hiding and not overriding
    }

}
