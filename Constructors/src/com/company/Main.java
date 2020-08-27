package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount anantsAccount = new BankAccount(123456, 75.00, "Anant Chohan", "me@me.com", "0161 344 5145");
        BankAccount defaultAccount = new BankAccount();
	    //        anantsAccount.setAccountNumber(123456);
//        anantsAccount.setCustomerName("Anant");
//        anantsAccount.setEmail("anant.chohan.me.uk");
//        anantsAccount.setPhoneNumber("01613445145");
        System.out.println(anantsAccount.getCustomerName());
        System.out.println(anantsAccount.getEmail());
        System.out.println(anantsAccount.getPhoneNumber());
        System.out.println(anantsAccount.getBalance());
	    anantsAccount.withdrawFunds(100);
	    anantsAccount.depositFunds(50);
        anantsAccount.withdrawFunds(100);
        anantsAccount.depositFunds(51);
        anantsAccount.withdrawFunds(100);
        System.out.println("********************************");
        System.out.println(defaultAccount.getAccountNumber());
        System.out.println(defaultAccount.getBalance());
        System.out.println(defaultAccount.getCustomerName());
        System.out.println(defaultAccount.getEmail());
        System.out.println(defaultAccount.getPhoneNumber());

        VipCustomer person = new VipCustomer();
        System.out.println(person.getName());
        System.out.println(person.getEmailAddress());

        VipCustomer person2 = new VipCustomer("anant", 250000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getEmailAddress());

        VipCustomer person3 = new VipCustomer("Dipti", 2500000.00, "dipti@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
