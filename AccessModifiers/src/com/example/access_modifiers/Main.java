package com.example.access_modifiers;

public class Main {

    public static void main(String[] args) {
        Account anantsAccount = new Account("Anant");
        anantsAccount.deposit(1000);
        anantsAccount.withdraw(500);
        anantsAccount.withdraw(-200);
        anantsAccount.deposit(-20);
        anantsAccount.calculatedBalance();

        System.out.println("Balance on account is " + anantsAccount.getBalance());
    }
}
