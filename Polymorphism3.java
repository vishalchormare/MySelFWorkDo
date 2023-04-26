package com.bridgelabz.oops;


class A2 {

    int x = 10;

    void m1() {
        System.out.println("m1 of A2");
    }
}

class B2 extends A2 {

    int y = 20;

    @Override
    void m1() {
        System.out.println("m1 of B2");
    }

    void m2() {
        System.out.println("m2 of B2");
    }
}

public class Polymorphism3 {


    public static void main(String[] args) {

        A2 obj1 = new A2();
        System.out.println(obj1.x);
        obj1.m1();

        B2 obj2 = new B2();
        System.out.println(obj2.y);
        obj2.m2();
        System.out.println(obj2.x);
        obj2.m1();

        // Parent reference can hold child object
        A2 obj3 = new B2();
        System.out.println(obj3.x);
        obj3.m1();
//        obj3.m2();


        // In case of inhertience, when a parent reference is holding a child object, with that reference I can only access the properties of parent class.

        // In case of overridding, when a parent reference is holding a child object, method resolution(determining which method will be accessed) is done by JVM based on run-time object
        // That is why , overridding is called Run-time polymorphsim , dynamic polymorphism , lazy binding



        // Child reference cannot hold parent object
//        B2 obj4 = new A2();


    }

}
