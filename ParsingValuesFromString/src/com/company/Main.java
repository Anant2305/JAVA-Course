package com.company;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018.125";
        System.out.println("NumberAsString= " + numberAsString);

//        int number = Integer.parseInt(numberAsString);
//        System.out.println("Number = " + number);

        double numberDouble = Double.parseDouble(numberAsString);
        System.out.println("Number = " + numberDouble);


        numberAsString += 1;
        //number += 1;
        numberDouble += 1;

        System.out.println("NumberAsString= " + numberAsString);
        //System.out.println("Number = " + number);
        System.out.println("Number = " + numberDouble);
    }
}
