package com.bridgelabz.oops;

// Abstract class
// We will use abstract class when we know partial implementations
// Abstract class is used for 0% to 100% Abstraction.
// Abstract class contains Abstract methods(methods without body) as well as concrete method(methods with implementation)
// We need to mention abstract keyword while declaring abstract methods. Abstract methods cannot be private.
// Abstract class can contain any kind of variables.
// The child class of abstract class can override either all or some of the abstract methods. It is not mandatory to override all the abstract methods.
// Abstract class contains a constructor because the variables of abstract class has to be initialized.
// We cannot create an object of Abstract class

abstract class Demo1 {

    int x = 0;

    static int y = 10;

    void m1() {
        System.out.println("m1 of Demo1");
    }

    static void m2() {
        System.out.println("m2 of Demo1");
    }

    abstract void m3();

    abstract void m4();

}

abstract class Demo2 extends Demo1 {

    @Override
    void m3() {
        System.out.println("m3 of Demo2");
    }


}

class Demo3 extends Demo2 {

    @Override
    void m4() {
        System.out.println("m4 of Demo3");
    }
}


public class Abstraction2 {

    public static void main(String[] args) {

        Demo1 ref1 = new Demo3();
        ref1.m3();
        ref1.m4();
        ref1.m1();
        System.out.println(ref1.x);

    }
}
