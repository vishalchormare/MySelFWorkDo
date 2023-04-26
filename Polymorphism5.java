package com.bridgelabz.oops;

// 'return type' of methods plays a role while overriding.
// we can take either same return types or covarient(parent-child relationship) return types.

class A3 {
    int x;

    void m1() {
        System.out.println("m1 of A3");
    }


    Animal m2() {
        System.out.println("m2 of A3 ");
        Animal obj = new Animal();
        return obj;
    }

    void m5() {
        System.out.println("m5 of A3");
    }

    void m5(int x) {
        System.out.println("m5(int) of A3");
    }

}

class B3 extends A3 {
    int y;

//    @Override
//    void m1() {
//        System.out.println("m1 of B3");
//    }
//
//    @Override
//    Monkey m2() {
//        System.out.println("m2 of B3");
//        Monkey obj = new Monkey();
//        return obj;
//    }

    void m3() {
        System.out.println("m3 of B3");
    }

//    @Override
//    void m5() {
//        System.out.println("m5");
//    }
//
//    @Override
//    void m5(int x) {
//        System.out.println("m5 " + x);
//    }
}

public class Polymorphism5 {

    public static void main(String[] args) {

        A3 obj1 = new A3();
        System.out.println(obj1.x);
        obj1.m2();
        obj1.m1();
        obj1.m5();
        obj1.m5(5);
        System.out.println();

        B3 obj2 = new B3();
        System.out.println(obj2.y);
        obj2.m3();
        System.out.println(obj2.x);
        obj2.m2();
        obj2.m1();
        obj2.m5();
        obj2.m5(5);


        // Parent class reference can just call parent class properties even when we have done inheritence
        A3 obj3 = new B3();
        System.out.println(obj3.x);
        obj3.m1();
        obj3.m2();
        obj3.m5();
        obj3.m5(5);
//        System.out.println(obj3.y);
//        obj3.m3();


    }
}
