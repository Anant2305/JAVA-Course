package com.company;

public class HealthyBurger extends Burger {
    private String healthyExtraName_1;
    private double healthyExtraPrice_1;
    private String healthyExtraName_2;
    private double healthyExtraPrice_2;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown Rye", meat, price);
    }

    public void addHealthAddition_1(String name, double price) {
        this.healthyExtraName_1 = name;
        this.healthyExtraPrice_1 = price;
    }

    public void addHealthAddition_2(String name, double price) {
        this.healthyExtraName_2 = name;
        this.healthyExtraPrice_2 = price;
    }

    @Override
    public double itemiasedBurger() {
        double burgerPrice = super.itemiasedBurger();
        if(this.healthyExtraName_1 != null){
            burgerPrice += this.healthyExtraPrice_1;
            System.out.println("Added " + this.healthyExtraName_1 + " for an extra " + this.healthyExtraPrice_1);
        }

        if(this.healthyExtraName_2 != null){
            burgerPrice += this.healthyExtraPrice_2;
            System.out.println("Added " + this.healthyExtraName_2 + " for an extra " + this.healthyExtraPrice_2);
        }

        return burgerPrice;
    }
}
