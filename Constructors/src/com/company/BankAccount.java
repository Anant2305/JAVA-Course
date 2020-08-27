package com.company;

public class BankAccount {

    private double accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        //set up default values
        this(953696, 2.50, "Default Name", "Default.email@me.uk", "9999 9999");
        System.out.println("Empty Constructor called");
    }

    public BankAccount(double accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Data being updated");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }



    public void setAccountNumber(double accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public double getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositFunds(double funds){
        this.balance += funds;
        System.out.println("Current Balance is " + this.balance);
    }

    public void withdrawFunds(double funds){
        if((this.balance - funds) < 0){
            System.out.println("Insufficent funds");
        }else {
            this.balance -= funds;
            System.out.println("Current Balance is " + this.balance);
        }
    }
}
