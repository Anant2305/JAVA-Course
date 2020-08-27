package com.company;

public class VipCustomer {

    private String name;
    private double creditlimit;
    private String emailAddress;

    public VipCustomer(){
        this("Default Name", 50000.00, "default@email.com");
    }

    public VipCustomer(String name, double creditlimit, String emailAddress) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditlimit) {
        this(name, creditlimit, "Nil@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
