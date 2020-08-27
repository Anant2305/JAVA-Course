package com.company;

class Car{

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;

    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerated() {
        return "Car -> accelerated()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerated() {
        return "Mitsubishi -> accelerated()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerated() {
        return "Ford -> accelerated()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

class BMW extends Car {
    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  " -> startEngine()";
    }

    @Override
    public String accelerated() {
        return getClass().getSimpleName() +  " -> accelerated()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	    Car car = new Car(8,"Base Car");
        System.out.println(car.getName());
        System.out.println(car.startEngine());
        System.out.println(car.accelerated());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander");
        System.out.println(mitsubishi.getName());
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerated());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Mondeo");
        System.out.println(ford.getName());
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerated());
        System.out.println(ford.brake());

        BMW bmw = new BMW(6, "G650 Xmoto");
        System.out.println(bmw.getName());
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerated());
        System.out.println(bmw.brake());
    }

}
