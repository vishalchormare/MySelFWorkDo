package com.bridgelabz.oops;


class Animal1 {

}

class Monkey1 extends Animal1 {

}


class Test {

    void m1(Animal1 animal) {
        System.out.println("m1(animal)");
    }
    void m1(Monkey1 monkey) {
        System.out.println("m1(monkey)");
    }
}


public class Polymorphism8 {

    public static void main(String[] args) {


        Animal1 animal1 = new Animal1();
        Monkey1 monkey1 = new Monkey1();
        Animal1 obj = new Monkey1();

        Test test = new Test();
        test.m1(animal1); // m1(animal)
        test.m1(monkey1); // m1(monkey)
        test.m1(obj);     // m1(animal)

        // Method resolution(determining which method will be called) is taken care by compiler based on reference type at the time of compilation
        // That's why overloading is called compile-time polymorphism , static polymorphism , early binding

    }
}
