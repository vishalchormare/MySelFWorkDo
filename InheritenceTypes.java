package com.bridgelabz.oops;

// Inheritence Types
// Single
// Multi-level
// Hierarchial
// Multiple
// Hybrid

class A {
    int x = 10;

    void m1() {
        System.out.println("m1 of A");
    }
}

// Single Inheritence
class B extends A {
    int y = 20;

//     This is possible because this is overrididng.
    void m1(){
        System.out.println("m1 of B");
    }

    void m2() {
        System.out.println("m2 of B");
    }
}

// Multi-level
class C extends B {
    int z = 30;

    @Override
    void m1() {
        System.out.println("m1 of C");
    }

    void m3() {
        System.out.println("m3 of C");
    }
}

// Hierarchial Inheritence
// class D extends A as well as class B extends A
class D extends A {

    int w = 40;

    void m4() {
        System.out.println("m4 of D");
    }
}


class E {
    int a = 50;

    void m5() {
        System.out.println("m5 of E");
    }

    void m7() {
        System.out.println("m7 of E");
    }
}

class F {
    int b = 60;

    void m5() {
        System.out.println("m5 of F");
    }

    void m6() {
        System.out.println("m6 of F");
    }
//    void m6(){
//
//    }
}

// Multiple Inheritence is not supported in java through classes
// There is ambiguity problem
// Diamond death problem
//class G extends E, F {
//
////    void m5() {
////    }
////
////    void m5() {
////    }
//
//}


public class InheritenceTypes {

    public static void main(String[] args) {

        A obj1 = new A();
        System.out.println(obj1.x);
        obj1.m1();

        B obj2 = new B();
        System.out.println(obj2.y);
        System.out.println(obj2.x);
        obj2.m2();
        obj2.m1();

        C obj3 = new C();
        System.out.println(obj3.z);
        System.out.println(obj3.y);
        System.out.println(obj3.x);
        obj3.m1();
        obj3.m2();
        obj3.m3();

    }


}
