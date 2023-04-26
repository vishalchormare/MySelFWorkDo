package com.bridgelabz.oops;

// private -> default -> protected -> public
// we cannot assign weaker access priviledges while overriding
// we can increase the scope of access specifier but we cannot reduce the scope while overriding

class A6 {

    protected void m1() {
        System.out.println("m1 of A6");
    }
}

class B6 extends A6 {

    @Override
    public void m1() {
        System.out.println("m1 of B6");
    }
}

public class Polymorphism9 {

    public static void main(String[] args) {

    }
}
