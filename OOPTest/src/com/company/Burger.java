package com.company;

public class Burger {
    private String name;
    private String breadType;
    private String meat;
    private double price;

    private String additiona1Name_1;
    private double additionalPrice_1;

    private String additiona1Name_2;
    private double additionalPrice_2;

    private String additiona1Name_3;
    private double additionalPrice_3;

    private String additiona1Name_4;
    private double additionalPrice_4;

    public Burger(String name, String breadType, String meat, double price) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    public void addBurgerAddition_1(String name, double price) {
        this.additiona1Name_1 = name;
        this.additionalPrice_1= price;
    }

    public void addBurgerAddition_2(String name, double price) {
        this.additiona1Name_2 = name;
        this.additionalPrice_2= price;
    }

    public void addBurgerAddition_3(String name, double price) {
        this.additiona1Name_3 = name;
        this.additionalPrice_3= price;
    }

    public void addBurgerAddition_4(String name, double price) {
        this.additiona1Name_4 = name;
        this.additionalPrice_4= price;
    }

    public double itemiasedBurger(){
        double burgerPrice = this.price;
        System.out.println(this.name + " Burger " + " on a " + this.breadType + " roll " + "price is " + this.price);
        if(this.additiona1Name_1 != null) {
            burgerPrice += this.additionalPrice_1;
            System.out.println("Added " + this.additiona1Name_1 + " for an extra " + this.additionalPrice_1);
        }

        if(this.additiona1Name_2 != null) {
            burgerPrice += this.additionalPrice_2;
            System.out.println("Added " + this.additiona1Name_2 + " for an extra " + this.additionalPrice_2);
        }

        if(this.additiona1Name_3 != null) {
            burgerPrice += this.additionalPrice_3;
            System.out.println("Added " + this.additiona1Name_3 + " for an extra " + this.additionalPrice_3);
        }

        if(this.additiona1Name_4 != null) {
            burgerPrice += this.additionalPrice_4;
            System.out.println("Added " + this.additiona1Name_4 + " for an extra " + this.additionalPrice_4);
        }

        return burgerPrice;
    }

}
