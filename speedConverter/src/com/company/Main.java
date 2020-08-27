package com.company;

public class Main {

    public static void main(String[] args) {

        long miles = speedConverter.toMilePerHour((10.5));
        System.out.println("Miles= "+ miles);

        speedConverter.printConversion(10.5);
    }
}
