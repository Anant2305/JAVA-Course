package com.company;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("north");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("east");

        Ceiling ceiling = new Ceiling(12,"Yellow");

        Bed bed = new Bed("Modern", 4, 12, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Shivs", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();

        bedroom.getlamp().turnOn();

    }
}
