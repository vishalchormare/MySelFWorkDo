package com.bridgelabz.oops;

// Inheritence => IS-A Relationship
// Association => HAS-A Relationship
// By creating objects inside a class
// Eg->  AddressBook HAS Contacts
//   ->  Building HAS Rooms
//   ->  Teacher HAS Students
//   ->  Team HAS Player

// 2 types -> Composition -> strong relationship -> Container object and contained object cannot exist individually without each other
//           Eg:- Room cannot exist without building
//                Class and Method

//         -> Aggregation
//         Eg:- Player can exist without Team


// https://www.edureka.co/blog/association-in-java/#:~:text=Association%20in%20Java%20is%20a,and%20many%2Dto%2Dmany

class Vehicle{

}
class Car extends Vehicle {

    String color;
    String model;
    Engine engine;

}

class Engine {

    String engineType;


}

public class Association {


    // String class methods
    public static void main(String[] args) {
        String str = "ABC";
        Engine engine1 = new Engine();
        engine1.engineType = "Petrol";

        Car car1 = new Car();

        car1.engine = engine1;
        car1.color = "Red";
        car1.model = "Ferrari";

        System.out.println(car1.engine.engineType);
        System.out.println(car1.model);
        System.out.println(car1.color);



    }
}
