package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Barclays");

        bank.addBranch("Manchester");
        bank.addCustomer("Manchester", "Anant", 50.00);
        bank.addCustomer("Manchester", "Dipti", 1050.25);
        bank.addCustomer("Manchester", "Amisha", 150.50);

        bank.addBranch("Ashton");
        bank.addCustomer("Ashton", "Shiv", 5000.00);

        bank.addCustomerTransaction("Manchester", "Anant", 60.50);
        bank.addCustomerTransaction("Manchester", "Anant", 160.50);
        bank.addCustomerTransaction("Manchester", "Dipti", 160.50);

        bank.listCustomers("Manchester", true);
        bank.listCustomers("Ashton", true);

        if(!bank.addCustomer("Melbourne", "Dan", 5.53)){
            System.out.println("Error Melbourne branch does not exists");
        }

        if(!bank.addBranch("Manchester")){
            System.out.println("Manchester branch already exists");
        }

        if(!bank.addCustomerTransaction("Manchester", "Shiv", 50.50)){
            System.out.println("Customer does not exists at branch");
        }

        if(!bank.addCustomer("Manchester", "Anant", 12.21)){
            System.out.println("Customer already exists");
        }

    }
}
