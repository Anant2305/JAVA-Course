package com.company;

public class DeluxBurger extends Burger {


    public DeluxBurger() {
        super("Delux", "White", "Sausage & Bacon", 14.54);
        super.addBurgerAddition_1("Chips", 2.75);
        super.addBurgerAddition_2("Drink" , 1.50);

    }

    @Override
    public void addBurgerAddition_1(String name, double price) {
        System.out.println("Cannot add Addtional Items");
    }

    @Override
    public void addBurgerAddition_2(String name, double price) {
        System.out.println("Cannot add Addtional Items");
    }

    @Override
    public void addBurgerAddition_3(String name, double price) {
        System.out.println("Cannot add Addtional Items");
    }

    @Override
    public void addBurgerAddition_4(String name, double price) {
        System.out.println("Cannot add Addtional Items");
    }
}
