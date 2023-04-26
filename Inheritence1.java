package com.bridgelabz.oops;

// Inheritence -> Acquiring thr properties from parent class to child class
// IS-A relationship
// Animal
// Cat , Dog , Monkey
// Monkey IS-A Animal , Cat IS-A Animal , Dog IS-A Animal
// We need to use 'extends' keyword to do inheritence

class Animal5 {

    static int a = 20;

    int x = 10;

    void walk() {
        System.out.println("walk of Animal class");
    }

    void run() {
        System.out.println("eat of Animal class");
    }

    static void m1() {
        System.out.println("m1 of Animal");
    }

}


class Monkey5 extends Animal5{

    static int b = 3;

    int y = 34;

    void m2() {
        System.out.println("m2 of Monkey class");
    }

    static void m3(){
        System.out.println("m3 of monkey");
    }
}


public class Inheritence1 {

    static int d = 10;

    public static void main(String[] args) {

//        System.out.println(d);
        Animal5 obj1 = new Animal5();
        System.out.println(obj1.x);
        obj1.run();
        obj1.walk();
        Animal5.m1();
        System.out.println(Animal5.a);


        Monkey5 obj2 = new Monkey5();
        System.out.println(obj2.y);
        obj2.m2();
        System.out.println(Monkey5.b);
        Monkey5.m3();
        // Animal class properties accessible through Monkey class object due to inheritence
        System.out.println(obj2.x);
        obj2.run();
        obj2.walk();
        System.out.println(Monkey5.a);
        Monkey5.m1();



    }
}
