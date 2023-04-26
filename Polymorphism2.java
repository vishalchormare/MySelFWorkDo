package com.bridgelabz.oops;


// Overriding : if we are not satisfied with the inherited method's implementation in the child class, we can override that method and provide owr own implementation
// Method name along with arguments(Method signature) should be same while overriding
class A1 {

    int x;

    void m1() {
        System.out.println("m1() of A1");
    }
}

class B1 extends A1 {
    int y;

    @Override
    void m1() {
        System.out.println("m1 of B1");
    }

    void m2() {
        System.out.println("m2() of B1");
    }
}


//
public class Polymorphism2 {

    public static void main(String[] args) {


        A1 obj1 = new A1();
        System.out.println(obj1.x);
        obj1.m1();

        B1 obj2 = new B1();
        System.out.println(obj2.y);
        obj2.m2();
        System.out.println(obj2.x);
        obj2.m1();

    }
}
