package io.migenjutsu.udemy.masterclass.coding_challenges.polymorphism_challenge;

class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;


    public Car(int cylinder, String name) {
        this.cylinder=cylinder;
        this.name=name;
        this.wheels=4;
        this.engine=true;
    }

    public int getCylinder() { return cylinder; }
    public String getName() { return name; }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String  brake() {
        return "Car -> brake()";
    }
}

class Acura extends Car {
    public Acura(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() { return "Acura -> startEngine()"; }

    @Override
    public String accelerate() { return "Acura -> accelerate()"; }

    @Override
    public String brake() { return "Acura -> brake()"; }
}

class Subaru extends Car {
    public Subaru(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() { return getClass().getSimpleName()+"-> startEngine()"; }
//    public String startEngine() { return "Subaru -> startEngine()"; }

    @Override
    public String accelerate() { return getClass().getSimpleName()+"-> accelerate()"; }
//    public String accelerate() { return "Subaru -> accelerate()"; }

    @Override
    public String brake() { return getClass().getSimpleName()+"-> brake()"; }
//    public String brake() { return "Subaru -> brake()"; }
}

public class PolyMain {
    public static void main(String[] args) {

        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println();

        Acura acura = new Acura(6, "RSX");
        System.out.println(acura.startEngine());
        System.out.println(acura.accelerate());
        System.out.println(acura.brake());

        System.out.println();

        Subaru subaru = new Subaru(6, "WRX STI");
        System.out.println(subaru.startEngine());
        System.out.println(subaru.accelerate());
        System.out.println(subaru.brake());

    }
}


// TODO:
// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).