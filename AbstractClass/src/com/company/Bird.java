package com.company;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is Pecking");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " Breath In and Out");
    }

    @Override
    public void fly() {
        System.out.println("Is Flapping its wings");
    }
}
