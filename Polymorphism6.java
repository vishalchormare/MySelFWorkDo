package com.bridgelabz.oops;



class A4 {
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

class B4 extends A4 {
    int y;

    @Override
    void m1() {
        System.out.println("m1 of B3");
    }
//
    @Override
    Cat m2() {
        System.out.println("m2 of B3");
        Cat obj = new Cat();
        return obj;
    }

    void m3() {
        System.out.println("m3 of B3");
    }

    @Override
    void m5() {
        System.out.println("m5");
    }

    @Override
    void m5(int x) {
        System.out.println("m5 " + x);
    }
}

public class Polymorphism6 {

    public static void main(String[] args) {
        A4 obj1 = new A4();
        System.out.println(obj1.x);
        obj1.m2();
        obj1.m1();
        obj1.m5();
        obj1.m5(5);
        System.out.println();

        B4 obj2 = new B4();
        System.out.println(obj2.y);
        obj2.m3();
        System.out.println(obj2.x);
        obj2.m2();
        obj2.m1();
        obj2.m5();
        obj2.m5(5);


        // Parent class reference can just call parent class properties even when we have done inheritence
        A4 obj3 = new B4();
        System.out.println(obj3.x);
        obj3.m1();
        obj3.m2();
        obj3.m5();
        obj3.m5(5);
//        System.out.println(obj3.y);
//        obj3.m3();
    }

}
