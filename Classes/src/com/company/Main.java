package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());

    }
}
