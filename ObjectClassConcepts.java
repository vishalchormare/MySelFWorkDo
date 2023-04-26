package com.bridgelabz.oops;

public class ObjectClassConcepts {

    public static void main(String[] args) {
        // Object class is a predefined class in java.
        // present in java.lang package .

        // Object class is the parent class of every class in java whether it is predefined or userdefined class.
        Object obj = new Object();

        Animal ref1 = new Animal();
        ref1.walk();
        System.out.println(ref1.x);
        ref1.getClass();
        ref1.toString();

        Cat ref2 = new Cat("Scottish fold", 3, "orange");
        ref2.getClass();
        ref2.toString();


        System.out.println(ref1);  // println calls ref1.toString();
        System.out.println(ref2);

        System.out.println("*******************************");
        int x1 = 10;
        int x2 = 10;
        System.out.println(x1 == x2); // true
        System.out.println();
        Animal ref3 = new Animal(); // x = 10
        Animal ref4 = new Animal(); // x = 10
        Animal ref5 = ref3;
        System.out.println(ref3 == ref4); // false
        System.out.println(ref3 == ref5); // true

        System.out.println(ref3.equals(ref4)); // false     // true
        System.out.println(ref3.equals(ref5)); // true      // true

        Cat ref6 = new Cat("Scottish fold", 3, "orange");
        Cat ref7 = new Cat("Egyptian", 2, "black");
        Cat ref8 = new Cat("Scottish fold", 3, "orange");
        System.out.println(ref6.equals(ref7)); // false
        System.out.println(ref6.equals(ref8)); // true


        // String class method needs to be implemented -> Assignment

//        Person ref6 = new Person();
//        System.out.println(ref3.equals(ref6));

    }
}
