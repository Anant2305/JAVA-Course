package com.example._final;

public class SomeClass {
    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    //final can only be set once and then is it not allowed to be amended.

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
