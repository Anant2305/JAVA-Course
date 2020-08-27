package com.company;

public class Main {

    public static void main(String[] args) {

        Burger burger = new Burger("Basic", "white", "Chicken", 3.50);
        double price = burger.itemiasedBurger();
        burger.addBurgerAddition_1("Tomatoe", 0.50);
        burger.addBurgerAddition_2("Cheese", 0.25);
        burger.addBurgerAddition_3("Onions", 0.40);
        System.out.println("Total price is " + burger.itemiasedBurger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addBurgerAddition_1("Egg", 5.43);
        healthyBurger.addHealthAddition_1("Lentils", 3.41);
        System.out.println("Total health price is " + healthyBurger.itemiasedBurger());

        DeluxBurger deluxBurger = new DeluxBurger();
        deluxBurger.addBurgerAddition_1("Lamb", 10.50);
        deluxBurger.itemiasedBurger();
    }
}
